package tasks;

import java.util.Scanner;

public class Person {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		 System.out.println("enter age: ");
		 int age=sc.nextInt();
		 
		 if(age>0 && age<=12) {
			 System.out.println("This person is child");
		 }else if(age>12 && age<=19) {
			 System.out.println("This person is teenager");
		 }else if(age>19 && age<=64) {
			 System.out.println("This person is an adult");
		 }else if(age>64) {
			 System.out.println("This person is a senior");
		 }else {
			 System.out.println("enter correct age");
		 }
			 

	}

}
