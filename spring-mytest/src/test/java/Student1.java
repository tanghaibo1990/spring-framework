import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Student1 {
	private Student student;

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean-student-customer-conversion.xml");
		Student1 student1 = context.getBean(Student1.class);
		System.out.println("name:" + student1.getStudent().getName() + ",age:" + student1.getStudent().getAge());
	}
}
