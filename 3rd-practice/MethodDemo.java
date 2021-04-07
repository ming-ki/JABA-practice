package sec04;

public class MethodDemo {

	public static void main(String[] args) {
		System.out.println("ÇÕ(1~10):"+sum(1,10));
		System.out.println("ÇÕ(10~100):"+sum(10,100));
		System.out.println("ÇÕ(100~100):"+sum(100,1000));
		System.out.println("»¬¼À(1~10):"+sub(1,10));
		System.out.println("»¬¼À(10~100):"+sub(10,100));
		System.out.println("»¬¼À(100~100):"+sub(100,1000));
		System.out.println("°ö¼À(1~10):"+mul(1,10));
		System.out.println("°ö¼À(10~100):"+mul(10,100));
		System.out.println("°ö¼À(100~100):"+mul(100,1000));
		System.out.println("³ª´°¼À(1~10):"+div(1,10));
		System.out.println("³ª´°¼À(10~100):"+div(10,100));
		System.out.println("³ª´°¼À(100~100):"+div(100,1000));
	}
	public static int sum(int i1, int i2)
	{
		int sum = 0;
		for(int i=i1; i<=i2; i++)
		{
			sum += i;
			
		}
		return sum;
		}
	
	public static int sub(int j1, int j2)
	{
		int sub = 0;
		for(int j=j2; j<=j1; j--)
		{
			sub -= j;
		}
		return sub;
	}
	public static int mul(int k1, int k2)
	{
		int mul = 1;
		for(int k=k2; k<=k1; k--)
		{
			mul *= k;
		}
		return mul;
	}
	public static int div(int t1, int t2)
	{
		int div = 1;
		for(int t=t2; t<=t1; t--)
		{
			div /= t;
		}
		return div;
	}
}

