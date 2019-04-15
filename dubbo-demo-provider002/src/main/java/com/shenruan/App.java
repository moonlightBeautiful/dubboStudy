package com.shenruan;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"dubbo-demo" +
                "-provider002.xml"});
        context.start();
        System.out.println("服务提供者002注册服务成功，端口：20882");
        try {
            System.in.read();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } // press any key to exit
        context.close();
    }
}
