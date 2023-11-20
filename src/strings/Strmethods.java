package strings;

public class Strmethods {

	public static void main(String[] args) {
		String s="vyshnavi";
		String s1="batchu";
		String s2=" vyshu ";
		
		System.out.println(s.length());
		System.out.println(s.concat(s1));
		System.out.println(s2.trim());
		System.out.println(s.charAt(5));
		System.out.println(s.contains("navi"));
		System.out.println(s.equals("vaishnavi"));
		System.out.println(s.equalsIgnoreCase("VYSHnavi"));
		System.out.println(s1.replace("batchu","vyshu"));
		System.out.println(s.substring(0,4));
		System.out.println(s.toLowerCase());
		System.out.println(s.toUpperCase());


			}

}
