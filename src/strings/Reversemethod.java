package strings;

import java.util.Scanner;

public class Reversemethod {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String str=sc.nextLine();
		String[] words=str.split(" ");
		String outputString="";
		for(int i=0;i<words.length;i++) {
			String word=words[i];
			String revword=getReverseString(word);
			
			if(i!=words.length-1) {
				outputString +=revword+" ";
			}else {
				outputString +=revword;
			}
			
		}
		System.out.println(outputString);
		sc.close(); 
		
	}
	private static String getReverseString(String inputstring) {
		String revstring="";
		for(int j=inputstring.length()-1;j>=0;j--) {
			revstring +=inputstring.charAt(j);
		}
		return revstring;
	}

}
