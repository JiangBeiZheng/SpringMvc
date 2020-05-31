package com.test.demo;



import com.test.pojo.Crm;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @Author:JIANGBEI
 * @Date:2020/5/29 21:55
 * @Version: 1.0
 */
public class Demo {



    @Test
    public void test() throws IOException {
        InputStream resourceAsStream = Resources.getResourceAsStream("sqlmap/SqlMapConfig.xml");
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        SqlSessionFactory build = sqlSessionFactoryBuilder.build(resourceAsStream);
        SqlSession sqlSession = build.openSession();
        List<Object> queryBlogById = sqlSession.selectList("queryBlogById");
        for (Object o : queryBlogById) {
            System.out.println(o);
        }
        sqlSession.close();
    }
    @Test
    public void test1() throws IOException {
        InputStream resourceAsStream = Resources.getResourceAsStream("sqlmap/SqlMapConfig.xml");
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        SqlSessionFactory build = sqlSessionFactoryBuilder.build(resourceAsStream);
        SqlSession sqlSession = build.openSession();
        Crm crm = new Crm();
        crm.setDict_id("50");
        crm.setDict_enable("1");
        crm.setDict_item_Code(null);
        crm.setDict_item_Name("客户客户");
        crm.setDict_memo(null);
        crm.setDict_type_Code("010");
        crm.setDict_type_Name("客户客户");
      //  sqlSession.insert("saveCrm",crm);//测试插入
      //  sqlSession.update("update",crm);//测试更新
        sqlSession.delete("delete",50);
        sqlSession.commit();
        sqlSession.close();
    }

}
