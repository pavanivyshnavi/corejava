package strings;

public class Removevowels {

	public static void main(String[] args) {
		String str="vyshnavi";
		String result="";
		String str1="aeiou";
		System.out.println("input string:"+str);
		for(int i=0;i<str.length();i++) {
			String ch=""+str.charAt(i);
			if(str1.contains(ch)) {
				continue;
			}
			result+=ch;
		}
		System.out.println("output string:"+result);
			
	}

}
