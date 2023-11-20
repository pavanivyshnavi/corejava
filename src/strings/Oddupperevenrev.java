package strings;

import java.util.Scanner;

public class Oddupperevenrev {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in) ;
		System.out.println("enter the string");
		String str=sc.nextLine();
		String[] words=str.split(" ");
		String outputstring="";
		for(int i=0;i<words.length;i++) {
			String word=words[i];
		 if(i%2==0) {
			 outputstring +=word.toUpperCase();
			 }else {
			outputstring +=getReverseString(word);
			 }
			if(i!=words.length-1) {
				outputstring +=" ";
			}
		}
		System.out.println(outputstring);
		sc.close();
	}
	private static String getReverseString(String inputString) {
		String revstring="";
		for(int j=inputString.length()-1;j>=0;j--) {
			revstring +=inputString.charAt(j);
		}
	return revstring;

	}

}
