package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Minword {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the arraysize");
		int arrsize=sc.nextInt();
		String[] arr=new String[arrsize];
		System.out.println("enter array values");
		for(int i=0;i<arrsize;i++) {
			arr[i]=sc.next();
		}
		System.out.println("input: "+Arrays.toString(arr));
		
		String minlengthword=arr[0];
		int minlengthwordindex=0;
		for(int i=0;i<arr.length;i++) {
			if(minlengthword.length() > arr[i].length()) {
				minlengthword=arr[i];
				minlengthwordindex=i;
			}
		}
		System.out.println("minlengthword:"+minlengthword);
		System.out.println("minlengthwordindex:"+minlengthwordindex);
		sc.close();

	}

}
