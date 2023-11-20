package strings;

public class Removeduplicatechars {

	public static void main(String[] args) {
		String str="ABCSABETECC";
		String newstr="";
		System.out.println("input string:"+str);
		for(int i=0;i<str.length();i++) {
			String ch=""+str.charAt(i);
			if(newstr.contains(ch)) {
				continue;
			}
			newstr+=ch;
		}
		System.out.println("output string:"+newstr);
		
	}

}
