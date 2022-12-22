public class CircularReference2 {

	public CircularReference2(){
		System.out.println("CircularReference2 ctor.");
	}
	private CircularReference1 circularReference1;

	public CircularReference1 getCircularReference1() {
		return circularReference1;
	}

	public void setCircularReference1(CircularReference1 circularReference1) {
		this.circularReference1 = circularReference1;
	}

	public void sayHello(){
		System.out.println("CircularReference2 sayHello.");
	}
}
