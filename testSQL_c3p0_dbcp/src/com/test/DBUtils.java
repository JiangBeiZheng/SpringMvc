package com.test;

import com.util.JdbcUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.MapListHandler;
import org.junit.Test;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

/**
 * @Author:JIANGBEI
 * @Date:2020/5/28 21:32
 * @Version: 1.0
 * DBUtils可以很轻松的处理resultset结果集，转换成各种不同形式的结果进行输出或者返回
 */
public class DBUtils {
   /* /**
    * @Params null
    * @return void
    * @author JIANGBEI
    * @date 2020/5/28 21:34
    */
    @Test
    public void test() throws SQLException {
        QueryRunner queryRunner = new QueryRunner(JdbcUtils.getDataSource());
        String sql ="SELECT * FROM crm.base_dict";
        List<Map<String, Object>> query = queryRunner.query(sql, new MapListHandler());//另一个时query.update
        System.out.println(query);
        for (int i = 0; i < query.size(); i++) {
            Map<String, Object> stringObjectMap = query.get(i);
            System.out.println("------------------");
            System.out.println(stringObjectMap.get("dict_id"));
        }
    }
}
