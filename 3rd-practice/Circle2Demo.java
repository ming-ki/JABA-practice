package sec01;

class Circle {
	double radius;
	static int numOfCircles = 0;
	int numCircles = 0;
	
	public Circle(double radius) {
		this.radius = radius;
		numOfCircles++;
		numCircles++;
	}
}
public class CircleDemo {

	public static void main(String[] args) {
		Circle myCire = new Circle(10.0);
		Circle youCircle = new Circle(5.0);
		Circle ourCircle = new Circle(8.0);
		
		//print()
		System.out.println("���� ����: " + Circle.numOfCircles);
		System.out.println("���� ����: " +  youCircle.numCircles);
	}
	void print() {
		System.out.println("�ν��Ͻ� �޼����Դϴ�.");
	}

}