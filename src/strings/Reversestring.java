package strings;

import java.util.Scanner;

public class Reversestring {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string");
		String str=sc.nextLine();
		String rev=new String();
		for(int i=str.length()-1;i>=0;i--) {
			rev=rev+str.charAt(i);
		}
		
       System.out.println(rev);
	

	}

}
