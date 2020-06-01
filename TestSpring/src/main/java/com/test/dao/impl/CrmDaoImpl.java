package com.test.dao.impl;

import com.test.dao.CrmDao;
import com.test.dao.pojo.Base;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;

/**
 * @Author:JIANGBEI
 * @Date:2020/5/31 21:37
 * @Version: 1.0
 */
public class CrmDaoImpl implements CrmDao {

        private SqlSessionFactory sqlSessionFactory;

    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        this.sqlSessionFactory = sqlSessionFactory;
    }

    public Base test(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        Base base = sqlSession.selectOne("queryUserById",1);
        sqlSession.close();
        return base;
    }
}
