package exceptionhandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Program {

	public static void main(String[] args) throws FileNotFoundException {
		int firstnum=20;
		int secondnum=0;
		int result;
		System.out.println("execution starts");
		
		try {
		result=firstnum/secondnum;
		}catch(Exception e){
			System.out.println(e.toString());
			throw e;
		}finally {
			System.out.println("finally block");
		}
		
		File file=new File("D:/resume.docx");
		FileInputStream fis=new FileInputStream(file);
		System.out.println(fis);
		}

}
