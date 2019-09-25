package com.stackroute.domain;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("BeanFile.xml");
        Movie movie=(Movie)applicationContext.getBean("movie2");

        XmlBeanFactory xmlBeanFactory= new XmlBeanFactory ( new ClassPathResource("BeanFile.xml"));
        Movie movieFirst= (Movie)xmlBeanFactory.getBean("movie2");

        System.out.println(movie.getActor());

        movie.setBeanName("boom123");
    }
}