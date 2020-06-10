package com.test;

import com.util.jdbcUtil;
import org.junit.Test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @Author:JIANGBEI
 * @Date:2020/5/28 19:30
 * @Version: 1.0
 */
public class demo1 {
    @Test
    public void test1(){
        Connection conn=null;
        PreparedStatement pst=null;
        ResultSet rs=null;
        try {
            conn= jdbcUtil.getConnection();
            String sql ="select * from crm.base_dict";
            pst=conn.prepareStatement(sql);
             rs = pst.executeQuery();
             while (rs.next()){
                 String dict_id = rs.getString("dict_id");
                 System.out.println(dict_id);

             }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            jdbcUtil.closeResource(conn,pst,rs);
            System.out.println("master前行分支");
            System.out.println("本行代码为测试新的分支dev-1所写");

            System.out.println("dev-1继续前行");
        }
    }
}
