package javaprograms;

public class Vowels {

	public static void main(String[] args) {
		char ch='i';
		
		 /*switch(ch) {
		case 'a':System.out.println(ch+" is a vowel");
		case 'e':System.out.println(ch+" is a vowel");
		case 'i':System.out.println(ch+" is a vowel");
		case 'o':System.out.println(ch+" is a vowel");
		case 'u':System.out.println(ch+" is a vowel");
		default:System.out.println(ch+" is a consonant");
		}*/
		
		if(ch=='a' || ch=='e' ||ch=='i' ||ch=='o' || ch=='u' ) {
			System.out.println(ch+" is a vowel");
		}else {
			System.out.println(ch+ " is a consonant");
		}

	}

}
