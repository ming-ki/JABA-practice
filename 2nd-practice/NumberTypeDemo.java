package chap2;

public class NumberTypeDemo {
	/**
	 * 순천향대학교 사물인터넷학과 20학번 안민지(20201509)
	 * 3주차 수업 실습 _04
	 * NumberTypeDemo 예제
	 */
	public static void main(String[] args) {
		int mach;
		int distance;
		mach = 340;
		distance = mach *60*60;
		System.out.println("소리가 1시간 동안 가는 거리 : "+ distance + "m");
				
		double radius;
		double area;
		radius = 10.0;
		area = radius * radius * 3.14;
		System.out.println("반지름이" + radius + "인 원의 넓이 : " +area);

	}

}
