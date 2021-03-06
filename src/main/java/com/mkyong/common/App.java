package com.mkyong.common;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mkyong.beans.Employee;
import com.mkyong.beans.Question;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext appContext = new ClassPathXmlApplicationContext("Spring-Module.xml");
    	 
        Employee emp = (Employee) appContext.getBean("e1");
        emp.show();        
        
        Question que = (Question) appContext.getBean("q");
        que.displayInfo();
    }
}
