package tasks;

public class Pattern2 {

	public static void main(String[] args) {
		int n=5;
		for(int row=1;row<=n;row++) { 
			//for every row run the col
		for(int col=1;col<=row;col++) {
				System.out.print("* ");
			}
		//when one row is added print new line
			System.out.println("");
		}
		

	}

}
