package sec03;

public class CastDemo {
	/**
	 * 순천향대학교 사물인터넷학과 20학번 안민지(20201509)
	 * 3주차 수업 실습 _05
	 * CastDemo 예제
	 */
	public static void main(String[] args) {
		int i;
		double d;
		byte b;
		
		i = 7 / 4;
		System.out.println(i);
		d = 7 / 4;
		System.out.println(d);
		d = 7 / (double)4;
		System.out.println(d); //i = 7 / (double) 4; 타입 불일치로 에러 발생
		
		i = 300;
		if(i<Byte.MIN_VALUE || i > Byte.MAX_VALUE)
		{
			System.out.println("byte 타입으로 변환 할 수 없습니다."); //byte 최대값 127
		}
		else
		{
			b = (byte) i;
		}

	}

}
