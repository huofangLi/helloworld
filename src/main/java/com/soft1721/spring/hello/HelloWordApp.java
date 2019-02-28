package com.soft1721.spring.hello;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by SHIGAUNG on 2019/2/25.
 */
public class HelloWordApp {
    public static void main(String[] args) {
//        1、读入配置（.xml）文件
        ApplicationContext context = new ClassPathXmlApplicationContext("/beans.xml");
//        2、读取配置好的bean
        HelloWorld helloWorld = (HelloWorld) context.getBean("helloWorld");
//        3、运行helloWorld的方法
        System.out.println(helloWorld.getHello());
    }
}
