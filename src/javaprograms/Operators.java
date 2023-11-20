package javaprograms;

public class Operators {

	public static void main(String[] args) {
int a=10,b=20,c=50;
		
		//arithmetic operators//
		System.out.println("arithemetic operators");
		System.out.println("sum of a and b:" +(a+b));
		System.out.println("diff of a and b:" +(a-b));
		System.out.println("mul of a and b:" +(a*b));
		System.out.println("div of a and b:" +(a/b));
		System.out.println("mod div of a and b:" +(a%b));
		
		//relational operators == != > < >= <= //
		//always returns a boolean value//
		System.out.println("relational operators");
		System.out.println(a==b);
		System.out.println(a!=b);
		System.out.println(a>b);
		System.out.println(a<b);
		System.out.println(a>=b);
		System.out.println(a<=b);
		
		//logical operators && ! || //
		//works between two boolean values//
		System.out.println("logical operators");
		System.out.println((a<=b)&(a<b));
		System.out.println((a>b)||(a>=b));
		System.out.println(!(a>b));
		
		//increment & decrement operators//
		System.out.println("increment & decrement");
		a++;        //or a=a+1;//
		System.out.println(a);
		b++;       //or b=b+1;//
		System.out.println(b);
		a--;      //or a=a-1;//
		System.out.println(a);
		b--;     //or b=b-1;//
		System.out.println(b);
		
		//ternary operators
		System.out.println("ternary operators");
		int i=(a<b)? ((a<c)?a:b) : ((c<a)?a:c);
		System.out.println(i);
				
		
		}

}
