package com.aaa.test;

import com.aaa.entity.User;
import com.aaa.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * @author ：jinxin
 * @date ：Created in 2020/10/12 14:12
 * @version: $
 */
public class UserTest {
    @Test
    public void test1(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService service = (UserService) applicationContext.getBean("service");
        List<User> users = service.listAll();
    }
}
