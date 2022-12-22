public class CircularReference1 {

	public CircularReference1(){
		System.out.println("CircularReference1 ctor.");
	}
	
	private CircularReference2 circularReference2;

	public CircularReference2 getCircularReference2() {
		return circularReference2;
	}

	public void setCircularReference2(CircularReference2 circularReference2) {
		this.circularReference2 = circularReference2;
	}

	public void sayHello(){
		circularReference2.sayHello();
		System.out.println("CircularReference1 sayHello.");  
	}
}
