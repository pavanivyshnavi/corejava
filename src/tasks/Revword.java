package tasks;

public class Revword {

	public static void main(String[] args) {
		String str="MAROLIX";
	    String rev="";
	    int len=str.length();//7
	   // System.out.println(len);
	    for(int i=len-1;i>=0;i--) {
	    	rev=rev+str.charAt(i);
	    }
		
        System.out.println("reverse string: "+rev);


	}

}
