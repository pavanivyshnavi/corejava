package strings;

public class Specialchar {

	public static void main(String[] args) {
		String input="bhg67^7189)knA%CfnDRHB@#$";
		int uppercaseletters=0;//6
		int lowercaseletters=0;//7
		int numbers=0;//6
		int specialcharacters=0;//6
		char[] characters=input.toCharArray();
		for(char ch:characters){
			if(Character.isUpperCase(ch))
				uppercaseletters++;
			else if(Character.isLowerCase(ch))
				lowercaseletters++;
			else if(Character.isDigit(ch))
				numbers++;
			else
				specialcharacters++;
			}
		System.out.println("uppercaseletters:"+uppercaseletters);
		System.out.println("lowercaseletters:"+lowercaseletters);
		System.out.println("numbers:"+numbers);
		System.out.println("specialcharacters:"+specialcharacters);
	

	}

}
