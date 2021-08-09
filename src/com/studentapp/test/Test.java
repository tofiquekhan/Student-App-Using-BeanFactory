package com.studentapp.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.studentapp.beans.Student;

public class Test {

	public static void main(String[] args) {
		
	
	Resource resource = new ClassPathResource("/com/studentapp/resources/applicationContext.xml");
	BeanFactory factory = new XmlBeanFactory(resource);
	Student s1 = (Student) factory.getBean("student1");
	
	s1.getDetails();
	Student s2 = (Student) factory.getBean("student2");
	s2.getDetails();
	}
}
