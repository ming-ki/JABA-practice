package sec02;

public class Rectangle extends Shape{

	int width;
	int height;
	
	public Rectangle(int width,int height) {
		this.width=width;
		this.height=height;
	}
	public void draw() {
		System.out.println("�簢���� �׸���.");
	}
	public double findArea() {
		return width*height;
	}
}
