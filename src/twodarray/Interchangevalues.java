package twodarray;

import java.util.Arrays;
import java.util.Scanner;

public class Interchangevalues {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the row size");
		int rowsize=sc.nextInt();
		int[][] arr=new int[rowsize][];
		for(int i=0;i<rowsize;i++) {
			System.out.println("enter col size for row no:"+i);
			int colsize=sc.nextInt();
			arr[i]=new int[colsize];
			System.out.println("enter col values for row no:"+i);
			for(int j=0;j<colsize;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.println("input array:");
		for(int i=0;i<arr.length;i++) {
			System.out.println(Arrays.toString(arr[i]));
		}
		int[][] arr1=new int[arr.length][];
		for(int i=0;i<arr.length;i++) {
			arr1[i]=new int[arr[i].length];
			for(int j=0;j<arr[i].length;j++) {
				arr1[i][j]=arr[j][i];
			}
			
		}
		System.out.println("output array:");
		for(int i=0;i<arr1.length;i++) {
			System.out.println(Arrays.toString(arr1[i]));
		}
		sc.close();


	}

}
