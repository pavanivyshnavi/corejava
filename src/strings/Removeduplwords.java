package strings;

public class Removeduplwords {

	public static void main(String[] args) {
		String str="vyshu vyshu";
		String result="";
		for(int i=0;i<str.length();i++) {
			String str1=""+str.charAt(i);
			if(str1!=result) {
				result+=str;
							}
					}
		System.out.println(result);
	}

}
