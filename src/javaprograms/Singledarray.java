package javaprograms;

public class Singledarray {

	public static void main(String[] args) {
		/*int a[]=new int[5];//a is array name,5 is size of the array;
		a[0]=100;//index starts with 0 so if the size is n then index will be (n-1)
		a[1]=200;
		a[2]=300;
		a[3]=400;
		a[4]=500;*/
			
			//or//
			
		int a[]= {100,200,300,400,500};
		System.out.println(a.length);//to know length of an array
		System.out.println(a[4]);
		
		/*for(int i=0;i<=4;i++) {
			System.out.println(a[i]);
			}*/
		
		//or we can use advanced/enhanced for loop//
		
		for(int i:a) {
			System.out.println(i);
		}

	}

}
