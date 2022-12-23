import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InitializingBeanTest implements InitializingBean {

	private String name;

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("InitializingBeanTest initializing...");
		this.name = "chenssy 2 号";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public void setOtherName(){
		System.out.println("InitializingBeanTest setOtherName...");
		this.name = "chenssy 3 号";
	}
	public void initBean(){
		System.out.println("InitializingBeanTest initBean...");
		this.name = "chenssy 4 号";
	}

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean-post-processor.xml");
		InitializingBeanTest bean = context.getBean(InitializingBeanTest.class);
		System.out.println("bean name:" + bean.getName());
	}
}