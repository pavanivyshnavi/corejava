package tasks;

public class Fibonacci {

	public static void main(String[] args) {
		int num1=0,num2=1;
		System.out.println(num1);//0 
		System.out.println(num2);//1
		for(int i=2;i<10;i++) {
			int sum=num1+num2;
			System.out.println(sum);//1 2 3 5 8 13 21 34 
			num1=num2;
			num2=sum;
		}


	}

}
