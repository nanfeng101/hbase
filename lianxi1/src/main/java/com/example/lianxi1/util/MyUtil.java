package com.example.lianxi1.util;

import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;
@Component
public class MyUtil {
    public static String getNewFileName(String oldFileName) {
        int lastIndex = oldFileName.lastIndexOf(".");
        String fileType = oldFileName.substring(lastIndex);
        Date now = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("YYYYMMDDHHmmssSSS");
        String time = sdf.format(now);
        String newFileName = time + fileType;
        return newFileName;
    }
}
