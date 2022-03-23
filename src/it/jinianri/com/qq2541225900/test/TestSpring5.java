package it.jinianri.com.qq2541225900.test;

import it.jinianri.com.qq2541225900.User;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class TestSpring5 {
    @Test
    public void testAdd() {
        //1 加载 spring 配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        //ApplicationContext context = new FileSystemXmlApplicationContext("classpath:bean1.xml");
        //2 获取配置创建的对象
        User user = context.getBean("user", User.class);
        System.out.println(user);
        user.add();
    }
}
