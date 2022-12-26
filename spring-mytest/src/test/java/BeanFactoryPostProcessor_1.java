import org.springframework.beans.BeansException;
import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.Ordered;

public class BeanFactoryPostProcessor_1 implements BeanFactoryPostProcessor, Ordered {
	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		System.out.println("调用 BeanFactoryPostProcessor_1 ...");

		System.out.println("容器中有 BeanDefinition 的个数：" + beanFactory.getBeanDefinitionCount());

//		// 获取指定的 BeanDefinition
//		BeanDefinition bd = beanFactory.getBeanDefinition("student");
//
//		MutablePropertyValues pvs = bd.getPropertyValues();
//
//		pvs.addPropertyValue("name", "chenssy1");
//		pvs.addPropertyValue("age", 15);
	}

	@Override
	public int getOrder() {
		return 0;
	}

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean-student.xml");
		Student student = (Student) context.getBean("student");
		System.out.println("name:" + student.getName() + ", age:" + student.getAge());
	}

}
