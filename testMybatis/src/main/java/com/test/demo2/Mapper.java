package com.test.demo2;

import com.test.pojo.Crm;

import java.util.List;

/**
 * @Author:JIANGBEI
 * @Date:2020/5/30 9:15
 * @Version: 1.0
 */
public interface Mapper {
    Crm select(Integer a);
    List<Crm> queryCrmDict(Crm c);
    List<Crm> queryCrmDict1(Crm c);
    List<Crm> selectTestForEatch(List a);
}
