package tasks;

import java.util.Scanner;

public class Largestnumber {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 
		 System.out.println("enter the value of num1");
		 int num1=sc.nextInt();
		 System.out.println("enter the value of num2");
		 int num2=sc.nextInt();
		 System.out.println("enter the value of num3");
		 int num3=sc.nextInt();
		 
		 if(num1>num2) {
			 System.out.println(num1+" is a greater number");
		 }else if(num2>num3) {
			 System.out.println(num2+" is a greater number");
		 }else if(num3>num1){
			 System.out.println(num3+" is a greater number");
		 }
		 
	}

}
