package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Merge {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter arraysize1");
		int arrsize1=sc.nextInt();
	    String[] arr1=new String[arrsize1];
	    System.out.println("enter array1 values");
	    for(int i=0;i<arrsize1;i++) {
	    	arr1[i]=sc.next();
	    }
	    
	    System.out.println("enter arraysize2");
		int arrsize2=sc.nextInt();
	    String[] arr2=new String[arrsize2];
	    System.out.println("enter array2 values");
	    for(int i=0;i<arrsize2;i++) {
	    	arr2[i]=sc.next();
	    }
	    System.out.println("input1: "+Arrays.toString(arr1));
	    System.out.println("input2: "+Arrays.toString(arr2));
	    
	    String[] arr3=new String[arr1.length+arr2.length];
	    for(int i=0;i<arr1.length;i++) {
	    	arr3[i] = arr1[i];
	    }
	    for(int i=0;i<arr2.length;i++) {
	    	arr3[i+arr1.length]=arr2[i];
	    }
	    System.out.println("output: "+Arrays.toString(arr3));
	    
	    
        sc.close();
	}
}