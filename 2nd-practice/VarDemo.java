package sec03;

public class VarDemo {
	/**
	 * 순천향대학교 사물인터넷학과 20학번 안민지(20201509)
	 * 3주차 수업 실습 _06
	 * VarDemo 예제
	 */
	// var a =1;  메서드 내부에서만 사용 가능
	public static void main(String[] args) {
		int var = 1; //변수 이름으로 사용 가능
		
		var x = 1;
		
		var xx = 23; // 다수의 변수를 하나의 실행문으로 표현
		
		
		var aa = 10; //null 값 대입 가능
		
		var oops = 'a'; //바로 초기화 하지 않으면 타입 추론 불가
		oops = 1;
		
		

	}

	//void test(var x) {} //타입 추론 불가
}
