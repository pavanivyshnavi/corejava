package twodarray;

import java.util.Arrays;
import java.util.Scanner;

public class Sumofele {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    System.out.println("enter the row size");
	    int rowsize=sc.nextInt();
	    int[][] arr=new int[rowsize][];
	    for(int i=0;i<rowsize;i++) {
	    	System.out.println("enter col size for row number:"+i);
	    	int colsize=sc.nextInt();
	    	arr[i]=new int[colsize];
	    	System.out.println("enter col values for row number:"+i);
	    	for(int j=0;j<colsize;j++) {
	    		arr[i][j]=sc.nextInt();
	    	}
	    }
	    System.out.println("input");
	    for(int i=0;i<arr.length;i++) {
	    System.out.println(Arrays.toString(arr[i]));
	    }
		
		System.out.println("output");
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				sum +=arr[i][j];
			}
		}
		System.out.println("sum:"+sum);
		
	}

}
