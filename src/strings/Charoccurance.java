package strings;

import java.util.Scanner;

public class Charoccurance {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in) ;
		System.out.println("enter a string");
		String str=sc.nextLine();
		System.out.println("enter a charecter");
		char ch=sc.next().charAt(0);
		int count=0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==ch) {
				count++;
			}
		}
		
		System.out.println("occurance of char "+ch+":"+count);
		
			
		sc.close();

	}

}
