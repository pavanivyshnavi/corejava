package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter arraysize");
		int arraysize=sc.nextInt();
		int arr[]=new int[arraysize];
		
		System.out.println("enter array values");
		for(int i=0;i<arraysize;i++) {
			 arr[i]=sc.nextInt();
		}
		System.out.println("input: "+Arrays.toString(arr));
		int sum=0;
		int avg=0;
		for(int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
			avg=sum/arr.length;
		}
		System.out.println("output: "+avg);
		sc.close();


	}

}
