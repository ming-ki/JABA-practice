package sec03;

public class BarBoolDemo {
	/**
	 * ��õ����б� �繰���ͳ��а� 20�й� �ȹ���(20201509)
	 * 3���� ���� �ǽ� _05
	 * BarBoolDemo ����
	 */
	public static void main(String[] args) {
		char ga1 = '��';
		char ga2 = '\uac00'; //�ѱ� �����ڵ� ����
		
		boolean cham = true;
		boolean geojit = false;
		
		System.out.println(ga1);
		System.out.println((int)ga1);
		System.out.println(ga2);
		System.out.println(++ga2);
		System.out.println(cham + "�� �ƴϸ�" + geojit + "�Դϴ�.");
	}

}
