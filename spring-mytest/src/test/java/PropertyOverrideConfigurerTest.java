import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PropertyOverrideConfigurerTest {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean-student-pro-override.xml");
		Student student = context.getBean(Student.class);
		System.out.println("name:" + student.getName() + " , age: " + student.getAge());
	}
}
