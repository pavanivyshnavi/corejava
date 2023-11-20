package javaprograms;

public class Progress {

	public static void main(String[] args) {
int marks=120;
		
		if(marks>=35 && marks<45) {
			System.out.println("passed with grade E");
		}
			else if(marks>=45 && marks<60) {
				System.out.println("passed with grade D");
		}
			else if(marks>=60 && marks<75) {
				System.out.println("passed with grade C");
		}
			else if(marks>=75 && marks<85) {
				System.out.println("passed with grade B");
		}
			else if(marks>=85 && marks<95) {
				System.out.println("passed with grade A");
		}
			else if(marks>=95 && marks<=100) {
				System.out.println("passed with grade O");
		}
			else if(marks<35) {
				System.out.println("the student was faied in exams");
		}
			else {
				System.out.println("inavlid marks");
			}
	}

}
