package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Sum1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter array size");
		int arraysize=sc.nextInt();
	    int[] arr=new int[arraysize];
	    
	    System.out.println("enter array values");
	    for(int i=0;i<arraysize;i++) {
	    	arr[i]=sc.nextInt();
	     }
	    System.out.println("input: "+Arrays.toString(arr));
	    int sum=0;
	    for(int i=0;i<arr.length;i++) {
	      sum=sum+arr[i];
	    }
	    System.out.println("output: "+sum);
	    sc.close();

	}

}
