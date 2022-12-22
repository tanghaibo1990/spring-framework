import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;

public class TestCircularReference {
	public static void main(String[] args) {
		ClassPathResource resource = new ClassPathResource("testCircularReference.xml");
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);

		reader.loadBeanDefinitions(resource);

		factory.getBean(CircularReference1.class).sayHello();
	}
}
