package ru.sinokop.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
//	private static final long serialVersionUID = 1L;
	
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context  = new ClassPathXmlApplicationContext("applicationContext.xml");
		TestBean testBean = context.getBean("testBean", TestBean.class);
		System.out.println(testBean.getName());
		context.close();
	}

}
