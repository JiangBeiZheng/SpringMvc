package com.mucfc;

import org.apache.log4j.Logger;

/**
 * @Author:81347
 * @Date:2020/5/25 21:05
 * @Version: 1.0
 */
public class Test {
    private static Logger logger=Logger.getLogger(Test.class);

    public static void main(String[] args) {
        System.out.println("this is print Message");
        logger.debug("this is debug Message");
        logger.info("this is info Message");
        logger.warn("this is warn Message");
        logger.error("this is error Message");

    }
}
