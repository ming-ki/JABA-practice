package sec03;

public class BarBoolDemo {
	/**
	 * 순천향대학교 사물인터넷학과 20학번 안민지(20201509)
	 * 3주차 수업 실습 _05
	 * BarBoolDemo 예제
	 */
	public static void main(String[] args) {
		char ga1 = '가';
		char ga2 = '\uac00'; //한글 유니코드 적용
		
		boolean cham = true;
		boolean geojit = false;
		
		System.out.println(ga1);
		System.out.println((int)ga1);
		System.out.println(ga2);
		System.out.println(++ga2);
		System.out.println(cham + "가 아니면" + geojit + "입니다.");
	}

}
