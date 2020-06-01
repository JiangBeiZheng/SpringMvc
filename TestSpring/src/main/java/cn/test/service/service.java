package cn.test.service;

import cn.test.dao.dao;

/**
 * @Author:JIANGBEI
 * @Date:2020/6/1 20:48
 * @Version: 1.0
 */
public class service {
    private dao dao;
    public String serviceTest(){
        System.out.println("this is service test");
        dao.daoTest();
        return "service";
    }

    public void setDaoBean(dao daoBean) {
        this.dao=daoBean;
    }
}
