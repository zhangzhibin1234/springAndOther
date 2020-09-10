package com.zzb.spring;

import com.zzb.spring.entity.Customers;
import com.zzb.spring.service.CustomersService;
import com.zzb.spring.service.impl.CustomersServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @className:MainClass
 * @desc:
 * @author:zzb
 * @date:2020/8/3120:44 version:1.0
 **/
public class MainClass {
    private static final Logger logger = LoggerFactory.getLogger(MainClass.class);

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        context.start();
        //demoTest
        CustomersService customersService=(CustomersService)context.getBean("customersServiceImpl");
        Customers customers= customersService.selectByPrimaryKey(10001);
        logger.info("customers:{}",customers);
        logger.info("applicaion is ok");
        threadHold(context);
        logger.info("application is exit");


    }

    public static void threadHold(ClassPathXmlApplicationContext context){
        while (true){
            try {
                Thread.currentThread().sleep(Thread.MAX_PRIORITY);
            } catch (InterruptedException e) {
                e.printStackTrace();
                context.stop();
                logger.debug("application is exit");
            }
        }
    }
}
