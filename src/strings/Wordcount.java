package strings;

import java.util.Scanner;

public class Wordcount {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String st=sc.nextLine();
		int count=1;
		for(int i=0;i<st.length();i++) {
			if(st.charAt(i)==' ') {
				count++;
			}
		}
		System.out.println("no. of words in a string:"+count);
			sc.close();
		

	}

}
