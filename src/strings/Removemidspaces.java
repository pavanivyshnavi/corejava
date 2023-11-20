package strings;

public class Removemidspaces {

	public static void main(String[] args) {
		String s1="birds  are  flying  in the  sky";
		String s2="";
		for(int i=0;i<=s1.length()-1;i++) {
			char ch1=s1.charAt(i);
			if(ch1!=' ') {
				s2=s2+ch1;
			}else {
				char ch2=s1.charAt(i+1);
					if(ch2==' ') {
						continue;
					}else {
						s2=s2+ch1;
					}
				}
			}
			System.out.println(s2);

	}

}
