package javaprograms;

public class Continue1 {

	public static void main(String[] args) {
		for(int i=1;i<=20;i++) {
			if(i==4 || i==18) {
				continue;
			}
			System.out.println(i);
		}

	}

}
