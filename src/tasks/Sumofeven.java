package tasks;

import java.util.Scanner;

public class Sumofeven {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in) ;
		System.out.println("enter starting number");
		int startingnum=sc.nextInt();
		System.out.println("enter ending number");
		int endingnum=sc.nextInt();
		int sum=0;
			for(int i=startingnum;i<=endingnum;i++) {
			if(i%2==0) {
				sum=sum+i;
				
				}
			}
			System.out.println(sum);
			sc.close();
			}

}
