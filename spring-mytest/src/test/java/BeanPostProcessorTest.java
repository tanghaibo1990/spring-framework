import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;

import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.Ordered;

public class BeanPostProcessorTest implements BeanNameAware {

	private String beanName;


	public void display() {
		System.out.println("hello BeanPostProcessor!!!");
		System.out.println("beanName:" + beanName);
	}

	public static void main(String[] args) {
//		ClassPathResource resource = new ClassPathResource("bean-post-processor.xml");
//		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
//		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
//		reader.loadBeanDefinitions(resource);
//		factory.addBeanPostProcessor(new BeanPostProcessorTest());
//
//		BeanPostProcessorTest test = (BeanPostProcessorTest) factory.getBean("beanPostProcessorTest");
//		test.display();

		ClassPathXmlApplicationContext factory = new ClassPathXmlApplicationContext("bean-post-processor.xml");
		BeanPostProcessorTest test = (BeanPostProcessorTest) factory.getBean("beanPostProcessorTest");
		test.display();
	}

	@Override
	public void setBeanName(String name) {
		this.beanName = name;
	}
}