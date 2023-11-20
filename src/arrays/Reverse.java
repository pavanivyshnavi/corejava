package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter array size");
		int arrsize=sc.nextInt();
		String[] arr=new String[arrsize];
		System.out.println("enter array values");
		for(int i=0;i<arrsize;i++) {
			arr[i]=sc.next();
		}
		System.out.println("input: "+Arrays.toString(arr));
	    String[] reverse=new String[arr.length];
		for(int i=0;i<arr.length;i++) {
			reverse[arr.length-i-1]=arr[i];
		}
	
		System.out.println("input: "+Arrays.toString(reverse));
	

	}

}
