package com.example.lianxi1.config;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.HBaseConfiguration;
import org.apache.hadoop.hbase.client.Connection;
import org.apache.hadoop.hbase.client.ConnectionFactory;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class HbaseConfig {
    public Connection connection=null;
    public Connection conf(){
        Configuration configuration = HBaseConfiguration.create();
        configuration.set("hbase.rootdir", "hdfs://master:9000/hbase");
        configuration.set("hbase.zookeeper.quorum","master:2181,slave01:2181");
        try {
            //2、创建连接对象
            connection= ConnectionFactory.createConnection(configuration);
            //3、创建Admin对象
        } catch (IOException e) {
            e.printStackTrace();
        }
        return connection;
    }
}
