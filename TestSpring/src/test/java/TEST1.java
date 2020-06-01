import com.test.dao.CrmDao;
import com.test.dao.mapper.SqlMapper;
import com.test.dao.pojo.Base;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author:JIANGBEI
 * @Date:2020/6/1 20:13
 * @Version: 1.0
 */
public class TEST1 {
    private ApplicationContext context;
    @Before
    public void setUp(){
        this.context=new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
    }
    @Test
    public void test(){
        CrmDao userDao = (CrmDao)context.getBean("userDao");
        Base test = userDao.test();
        System.out.println(test);
    }
    @Test
    public void test2(){
        SqlMapper bean = context.getBean(SqlMapper.class);
        Base base = bean.queryById(1);
        System.out.println(base);
    }
}
