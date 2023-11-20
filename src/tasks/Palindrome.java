package tasks;

public class Palindrome {

	public static void main(String[] args) {
		String str="racecar";
		String rev="";
		for(int i=str.length()-1;i>=0;i--) {
			rev=rev+str.charAt(i);
		}
		//System.out.println(rev);
			if(str.equals(rev)) {
				System.out.println(str+" is a palindrome word");
			}else {
				System.out.println(str+" is not a palindrome word");
			}

	}

}
