package sec03;

public class CastDemo {
	/**
	 * ��õ����б� �繰���ͳ��а� 20�й� �ȹ���(20201509)
	 * 3���� ���� �ǽ� _05
	 * CastDemo ����
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
		System.out.println(d); //i = 7 / (double) 4; Ÿ�� ����ġ�� ���� �߻�
		
		i = 300;
		if(i<Byte.MIN_VALUE || i > Byte.MAX_VALUE)
		{
			System.out.println("byte Ÿ������ ��ȯ �� �� �����ϴ�."); //byte �ִ밪 127
		}
		else
		{
			b = (byte) i;
		}

	}

}
