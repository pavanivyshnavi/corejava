package tasks;

public class Removemidspaces {

	public static void main(String[] args) {
		String s1="birds  are  flying  in the  sky";
		String s2="";
		for(int i=0;i<s1.length();i++) {
			char ch=s1.charAt(i);
			if(ch!=' ') {
				s2=s2+ch;
			}else {
				char ch1=s1.charAt(i+1);
					if(ch1==' ') {
					continue;	
					}else {
						s2=s2+ch;
					}
				}
			
			}
		System.out.println(s2);

	}

}
