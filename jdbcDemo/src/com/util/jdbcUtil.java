package com.util;

import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

/**
 * @Author:81347
 * @Date:2020/5/28 19:30
 * @Version: 1.0
 */
public class jdbcUtil {
    private static String driver;
    private static String url;
    private static String username;
    private static String password;
    static {
        try {
            initConfig();
            Class<?> aClass = Class.forName(driver);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    private static void initConfig(){
        Properties properties = new Properties();
        InputStream is;
        is=jdbcUtil.class.getResourceAsStream("jdbc.properties");
        try {
            properties.load(is);
            driver=properties.getProperty("driver");
            url=properties.getProperty("url");
            username=properties.getProperty("username");
            password=properties.getProperty("password");
        } catch (IOException e) {
            e.printStackTrace();
        }finally {

                try {
                    is.close();
                } catch (IOException e) {
                        e.printStackTrace();
                }
        }
    }
/**
 * 
 * @param args [args]
 * @return void
 * @author JIANGBEI
 * @creed: Talk is cheap,show me the code
 * @date 2020/5/28 19:52
 */
    public static void main(String[] args) {
        initConfig();   
    }
   public static Connection getConnection() throws SQLException {
       Connection connection = DriverManager.getConnection(url,username,password);
       return connection;
   }
   public static void closeResource(Connection conn, Statement stmt, ResultSet resultSet){
        if(resultSet!=null){
            try {
                resultSet.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (stmt!=null){
            try {
                stmt.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if(conn!=null){
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
   }
}
