package strings;

import java.util.Scanner;

public class Wordreverse {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string");
		String st=sc.nextLine();
		String[] words=st.split(" ");
		String outputstring="";
		for(int i=0;i<words.length;i++) {
			String word=words[i];
			String revword="";
			for(int j=word.length()-1;j>=0;j--) {
				revword +=word.charAt(j);
			}
			outputstring +=revword+" ";
		}
		String finaloutputstring=outputstring.trim();
        System.out.println(outputstring);

	}

}
