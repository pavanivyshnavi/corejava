package javaprograms;

public class Primenumbers {

	public static void main(String[] args) {
		int i,j;
		for(i=1;i<=60;i++)
		{
			int count=0;
			for(j=1;j<=i;j++) {
				if(i%j==0)
				{
					count++;
				}
			}
			if(count==2) {
			System.out.println(i);
			}
		}

	}

}
