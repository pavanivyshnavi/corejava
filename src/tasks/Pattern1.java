package tasks;

public class Pattern1 {

	public static void main(String[] args) {
		int n=5;
		for(int row=0;row<n;row++) {//0
			//for every row run the col
			for(int col=0;col<n;col++) {//0
				if(row+col>=4) {
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
