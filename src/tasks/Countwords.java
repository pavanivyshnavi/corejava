package tasks;

public class Countwords {

	public static void main(String[] args) {
		String str="java prgrm to find words in string";
	    //String[] str1=str.split(" ");
		//System.out.println("no. of words in str:"+str1.length);
		int count=1;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==' '){
				count++;
			}
		}
		System.out.println("no.of words in a string:"+count);
	}

}
