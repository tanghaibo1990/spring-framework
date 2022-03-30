package org.springframework.tests.xsd;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;

public class UserTest {
	public static void main(String[] args) {

		ClassPathResource resource = new ClassPathResource("org/springframework/tests/xsd/user-bean.xml");
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);

		reader.loadBeanDefinitions(resource);

		User user = (User) factory.getBean("user");
		User user1 = (User) factory.getBean("user");
		System.out.println(user.getUserName() + "----" + user.getEmail());
	}
}
