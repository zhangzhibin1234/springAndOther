package com.zzb.spring.test;

import com.zzb.spring.service.Aservice;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @className:MainTest
 * @desc:
 * @author:zzb
 * @date:2020/8/3122:04 version:1.0
 **/
public class MainTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        Aservice aservice= (Aservice) applicationContext.getBean("aserviceImpl");
        aservice.haha();

    }
}
