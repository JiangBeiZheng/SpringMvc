package com.test.demo2;

import com.test.pojo.Crm;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author:JIANGBEI
 * @Date:2020/5/30 9:04
 * @Version: 1.0
 */
public class Demo {
    @Test
    public void test() throws IOException {
        InputStream resourceAsStream = Resources.getResourceAsStream("sqlmap/SqlMapConfig.xml");
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        SqlSessionFactory build = sqlSessionFactoryBuilder.build(resourceAsStream);
        SqlSession sqlSession = build.openSession();
        Mapper mapper = sqlSession.getMapper(Mapper.class);
        Crm select = mapper.select(1);
        System.out.println(select);
        sqlSession.close();
    }

    @Test
    public void test1() throws IOException {
        InputStream resourceAsStream = Resources.getResourceAsStream("sqlmap/SqlMapConfig.xml");
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        SqlSessionFactory build = sqlSessionFactoryBuilder.build(resourceAsStream);
        SqlSession sqlSession = build.openSession();
        Mapper mapper = sqlSession.getMapper(Mapper.class);
        Crm crm = new Crm();
        //检验if标签是否生效
        //crm.setDict_id("13");
        crm.setDict_type_Code("004");
        List<Crm> crms = mapper.queryCrmDict(crm);
        for (int i = 0; i < crms.size(); i++) {
            System.out.println(crms.get(i));
        }

    }

    /* *
     * @说明：测试where标签，详情见CrmMapper.xml配置文件中where标签的使用
     * @Params []
     * @return void
     * @author JIANGBEI
     * @date 2020/5/31 19:51
     */
    @Test
    public void testWhere() throws IOException {
        InputStream resourceAsStream = Resources.getResourceAsStream("sqlmap/SqlMapConfig.xml");
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        SqlSessionFactory build = sqlSessionFactoryBuilder.build(resourceAsStream);
        SqlSession sqlSession = build.openSession();
        Mapper mapper = sqlSession.getMapper(Mapper.class);
        Crm crm = new Crm();
        //检验where标签是否生效
        //crm.setDict_id("13");
        crm.setDict_type_Code("004");
        List<Crm> crms = mapper.queryCrmDict1(crm);
        for (int i = 0; i < crms.size(); i++) {
            System.out.println(crms.get(i));
        }
    }
    /* *
     * @说明：测试foreatch标签，详细标签配置见配置文件
     * 一般使用foreatch的情况应该都是传递参数为list的情况？
     * @Params []
     * @return void
     * @author JIANGBEI
     * @date 2020/5/31 20:12
     */
    @Test
    public void testForeathc() throws IOException {
        InputStream resourceAsStream = Resources.getResourceAsStream("sqlmap/SqlMapConfig.xml");
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        SqlSessionFactory build = sqlSessionFactoryBuilder.build(resourceAsStream);
        SqlSession sqlSession = build.openSession();
        Mapper mapper = sqlSession.getMapper(Mapper.class);
        ArrayList<Integer> integers = new ArrayList<Integer>();
        integers.add(1);
        integers.add(2);
        integers.add(30);
        List<Crm> crms = mapper.selectTestForEatch(integers);
        for (int i = 0; i < crms.size(); i++) {
            System.out.println(crms.get(i));
        }
    }
}
