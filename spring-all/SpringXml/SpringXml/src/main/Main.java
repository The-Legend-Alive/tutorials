package main;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import testbean.MySpringBeanWithDependency;

public class Main {
	public static void main(String[] args) {
		ApplicationContext appcontext = new ClassPathXmlApplicationContext("META-INF/config.xml");
		BeanFactory factory = appcontext;
		MySpringBeanWithDependency result = (MySpringBeanWithDependency) factory.getBean("mySpringBeanWithDependency");
		result.run();
	}
}
