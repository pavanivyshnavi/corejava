package tasks;

public class Hallowpattern {

	public static void main(String[] args) {
		for(int row=0;row<5;row++) {
			//for every row run the col
			for(int col=0;col<5;col++) {
				if(row==0 || row==4 || col==0 || col==4) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			//when one row is added print new line
			System.out.println("");
		}


	}

}
