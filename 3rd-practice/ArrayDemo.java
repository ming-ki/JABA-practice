package sec01;

public class ArrayDemo {

	public static void main(String[] args) {
		int score1 = 100;
		int score2 = 90;
		int score3 = 50;
		int score4 = 95;
		int score5 = 85;
		
		int sum = score1;
		sum += score2;
		sum += score3;
		sum += score5;
		double average = sum / 5.0;
		
		System.out.println(sum);
		/*int[] score = {100,90.50,95,85}
		int sum = 0;
		
		for(int i=0; i<5; i++)
		{
		sum += score[i];
		}
		double average = sum /5.0;
		System.out.println(sum); */
		

	}

}
