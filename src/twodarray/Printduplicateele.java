package twodarray;

import java.util.Arrays;
import java.util.Scanner;

public class Printduplicateele {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the row size for array1");
		int rowsize_arr1=sc.nextInt();
		int[][] arr1=new int[rowsize_arr1][];
		for(int i=0;i<rowsize_arr1;i++) {
        System.out.println("enter col size 0f row no:"+i);
        int colsize=sc.nextInt();
        arr1[i]=new int[colsize];
        System.out.println("enter col values for row no:"+i);
        for(int j=0;j<colsize;j++) {
        	arr1[i][j]=sc.nextInt();
        }
       }
		
		System.out.println("enter row size for array2");
		int rowsize_arr2=sc.nextInt();
		int[][] arr2=new int[rowsize_arr2][];
		for(int i=0;i<rowsize_arr2;i++) {
			System.out.println("enter col size for row no:"+i);
			int colsize=sc.nextInt();
			arr2[i]=new int[colsize];
			System.out.println("enter col values for row no:"+i);
			for(int j=0;j<colsize;j++) {
				arr2[i][j]=sc.nextInt();
			}
			}
		System.out.println("input array1:");
		for(int i=0;i<arr1.length;i++) {
			System.out.println(Arrays.toString(arr1[i]));
		}
		System.out.println("input array2:");
		for(int i=0;i<arr2.length;i++) {
			System.out.println(Arrays.toString(arr2[i]));
		}
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr1[i].length;j++) {
				int targetele=arr1[i][j];
				for(int k=0;k<arr2.length;k++) {
					for(int l=0;l<arr2[k].length;l++) {
						if(targetele==arr2[k][l]) {
							System.out.println(targetele);
						}
					}
				}
			}
		}
		sc.close();

	}

}
