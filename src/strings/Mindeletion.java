package strings;

public class Mindeletion {

	public static void main(String[] args) {
		String s="BAABAAB";
		int count=0;
		for(int i=1;i<s.length();i++)
		{
			if(s.charAt(i)==s.charAt(i-1)) {
				count++;
			}
		}
		System.out.println(count);

	}

}
