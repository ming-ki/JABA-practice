package sec03;

public class PrintfDemo {
	/**
	 * ��õ����б� �繰���ͳ��а� 20�й� �ȹ���(20201509)
	 * 3���� ���� �ǽ� _05
	 * printfdemo ����
	 */
	public static void main(String[] args) {
		int i = 97;
		String s = "Java";
		double f = 3.14f;
		System.out.printf("%d\n", i);
		System.out.printf("%o\n", i);
		System.out.printf("%x\n", i);
		System.out.printf("%c\n", i);
		System.out.printf("%5d\n", i);
		System.out.printf("%05d\n", i);
		System.out.printf("%s\n", s);
		System.out.printf("%5s\n", s);
		System.out.printf("%-5s\n", s);
		System.out.printf("%f\n", f);
		System.out.printf("%e\n", f);
		System.out.printf("%4.1f\n", f);
		System.out.printf("%04.1f\n", f);
		System.out.printf("%-4.1f\n", f);

	}

}
