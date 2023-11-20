package tasks;

public class Fruits {

	public static void main(String[] args) {
		int fruits=50;
		for(int i=1;i<=fruits;i++) {
			if(i%3==0 && i%5!=0) {
				System.out.println(i+" is a mango");
			}else if(i%5==0 && i%3!=0) {
				System.out.println(i+" is a orange");
			}else if(i%3==0 && i%5==0) {
				System.out.println(i+" is a mango and orange");
			}
		}


	}

}
