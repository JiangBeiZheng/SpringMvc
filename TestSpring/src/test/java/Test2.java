import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import cn.test.controller.controller;


/**
 * @Author:JIANGBEI
 * @Date:2020/6/1 20:48
 * @Version: 1.0
 */
public class Test2 {
    private ApplicationContext context;
    @Before
    public void setUp(){
        this.context=new ClassPathXmlApplicationContext("classpath:applicationContext1.xml");
    }
    @Test
    public void test(){
        controller controllerBean = (controller)context.getBean("controllerBean");
        controllerBean.controllerTest();
    }
}
