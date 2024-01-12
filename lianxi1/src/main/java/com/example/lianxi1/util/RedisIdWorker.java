package com.example.lianxi1.util;

import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;

@Component
public class RedisIdWorker {
    private StringRedisTemplate stringRedisTemplate;
    /**
     * 开始时间戳
     */
    private static final long BEGIN_TIMESTAP = 1640995200L;
    /**
     * 序列号位数
     */
    private static final long COUNT_BITS=32;

    public RedisIdWorker(StringRedisTemplate stringRedisTemplate) {
        this.stringRedisTemplate = stringRedisTemplate;
    }

    //用于生成全局唯一ID,ID由二进制1位符号位，31位时间戳以及32位序列号组成
    public long nextId(String keyPrefix){
        LocalDateTime now = LocalDateTime.now();
        //将当前时间转为秒
        long mowSecond = now.toEpochSecond(ZoneOffset.UTC);
        long timestamp = mowSecond-BEGIN_TIMESTAP;
        String format = now.format(DateTimeFormatter.ofPattern("yyyy:MM:dd"));
        long increment = stringRedisTemplate.opsForValue().increment("icr:" + keyPrefix + ":" + format);
        //位运算,timestap先左移32位，在进行或运算
        return timestamp << 32 | increment;

    }
}
