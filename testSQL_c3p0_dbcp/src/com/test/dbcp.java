package com.test;

import org.apache.commons.dbcp.BasicDataSource;
import org.junit.Test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @Author:JIANGBEI
 * @Date:2020/5/28 21:02
 * @Version: 1.0
 * 首先添加jar详细见dbcplib文件夹
 */
public class dbcp {
    @Test
    public void test() throws SQLException {
        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://127.0.0.1:3306/crm");
        dataSource.setUsername("root");
        dataSource.setPassword("root");
        //获取连接
        Connection connection = dataSource.getConnection();
        String sql="SELECT * FROM base_dict";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        ResultSet rs = preparedStatement.executeQuery();
        while (rs.next()){
            String dict_id = rs.getString("dict_id");
            System.out.println(dict_id);

        }
        rs.close();
        preparedStatement.close();
        connection.close();
    }
}
