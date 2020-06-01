package cn.test.controller;

import cn.test.service.service;

/**
 * @Author:JIANGBEI
 * @Date:2020/6/1 20:48
 * @Version: 1.0
 */
public class controller {
    private service service;
    public void controllerTest(){
        System.out.println("this is controller");
        String s = service.serviceTest();
        System.out.println("---------------");
        System.out.println(s);
    }

    public void setServiceBean(service serviceBean) {
        this.service=serviceBean;
    }
}
