import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.ClassRelativeResourceLoader;
import test.YoungMan;

public class Test1 {
	public static void main(String[] args) {
		ClassPathResource resource = (ClassPathResource) new ClassRelativeResourceLoader(Test1.class).getResource("bean.xml");
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions(resource);
		YoungMan youngMan = factory.getBean(YoungMan.class);

	}
}
