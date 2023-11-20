package twodarray;

import java.util.Arrays;
import java.util.Scanner;

public class Square {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter row size");
		int rowsize=sc.nextInt();
		int[][] arr=new int[rowsize][];
		for(int i=0;i<arr.length;i++) {
			System.out.println("enter col size of row no. "+i);
			int colsize=sc.nextInt();
			arr[i]=new int[colsize];
			 System.out.println("enter col values of row no. "+i);
			for(int j=0;j<colsize;j++) {
		    arr[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<arr.length;i++) {
	    System.out.println(Arrays.toString(arr[i]));
		}
		int outputarr[][]=new int[arr.length][];
		for(int i=0;i<arr.length;i++) {
		outputarr[i]=new int[arr.length];
		for(int j=0;j<arr[i].length;j++) {
			outputarr[i][j]=(int)Math.pow(arr[i][j], 2);
		}
		}
		for(int i=0;i<arr.length;i++) {
		System.out.println(Arrays.toString(outputarr[i]));
		}
		sc.close();

	}

}
