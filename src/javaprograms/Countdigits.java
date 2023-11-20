package javaprograms;

public class Countdigits {

	public static void main(String[] args) {
		int num=228493;
		int count=0;
		while(num>0) {
			num=num/10;
			count++;
		}
		System.out.println("no. of digits in num are:"+count);

	}

}
