package javaprograms;

public class Twodarray {

	public static void main(String[] args) {
int a[][]= {{100,200},{300,400},{500,600}};
		
		System.out.println(a.length);//it gives no.of rows
		System.out.println(a[0].length);//it gives no.of columns
		
		for(int i=0;i<a.length;i++) {//classic for loop
			for(int j=0;j<a[i].length;j++) {
				System.out.println(a[i][j]);

	}

}
	}
}
