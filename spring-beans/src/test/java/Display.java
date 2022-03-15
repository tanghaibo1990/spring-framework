public abstract class Display {
	public void display() {
		getCar().display();
	}

	public abstract Car getCar();
}
