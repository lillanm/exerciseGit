package com.itheima;

import com.itheima.dao.impl.UserDaoImpl;
import com.itheima.domain.User;
import com.itheima.service.impl.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class APP {
    public static void main(String[] args) {
        //3.获取IoC容器
        ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
        //4.获取bean
        // UserServiceImpl userService = (UserServiceImpl) ctx.getBean("userService");
        // userService.save();
        // User user= (User) ctx.getBean("user1");
        // System.out.println(user);
        UserDaoImpl us= (UserDaoImpl) ctx.getBean("userDao");
        us.save();
    }
}
