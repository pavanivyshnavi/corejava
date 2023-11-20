package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Maxnumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter array size");
		int arrsize=sc.nextInt();
		int[] arr=new int[arrsize];
		
		System.out.println("enter array values");
		for(int i=0;i<arrsize;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("input: "+Arrays.toString(arr));
		int largestnumber=arr[0];
		int index=0;
		for(int i=0;i<arr.length;i++) {
			if(largestnumber<arr[i]) {
				largestnumber=arr[i];
				index=i;
				
			}
		}
		System.out.println("output:");
		System.out.println("largestnumber: "+largestnumber);
		System.out.println("index: "+index);
	    sc.close();

	}

}
