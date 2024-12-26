package com.iisn.collegemodule;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
    	ApplicationContext ac=new ClassPathXmlApplicationContext("college.xml");
    	CollegeClass cc=(CollegeClass)ac.getBean("sd");
    	cc.getData();
    	cc.printData();
    }
}
