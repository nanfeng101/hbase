package com.example.lianxi1.dao;

import com.example.lianxi1.config.HbaseConfig;
import com.example.lianxi1.pojo.User;
import org.apache.hadoop.hbase.TableName;
import org.apache.hadoop.hbase.client.*;
import org.apache.hadoop.hbase.util.Bytes;
import org.springframework.stereotype.Component;
import javax.annotation.Resource;
@Component
public class LoginHbaseDao {
    @Resource
    private HbaseConfig hbaseConfig;
    public User getUserPassword(String username)throws Exception{
        Connection connection = hbaseConfig.conf();
        Table table = connection.getTable(TableName.valueOf("user"));  //hbase表名
        Scan scan = new Scan();
        String goods = "login";  //列族
        scan.addFamily(Bytes.toBytes(goods));
        ResultScanner scanner = table.getScanner(scan);
        User user = new User();
        for(Result result:scanner){
            String name = new String(result.getValue(Bytes.toBytes(goods),Bytes.toBytes("name")));
            if(name.equals(username)) {
                user.setUsername(name);
                user.setPassword(new String(result.getValue(Bytes.toBytes(goods), Bytes.toBytes("pwd"))));
                break;
            }
        }
        return user;
    }
    public void register(User user)throws Exception{
        Connection connection = hbaseConfig.conf();
        Table table = connection.getTable(TableName.valueOf("user"));
        String str1="rowkey"+user.getUsername();
        String str3="goodname1";
        Put put  = new Put(Bytes.toBytes(str1));
        put.addColumn(Bytes.toBytes(str3), Bytes.toBytes("name"), Bytes.toBytes(user.getUsername()));
        put.addColumn(Bytes.toBytes(str3), Bytes.toBytes("pwd"), Bytes.toBytes(user.getPassword()));
        table.put(put);
        table.close();
    }
}
