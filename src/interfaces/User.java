package interfaces;

public class User {

	public static void main(String []args) {
		Lenovo lenovo=new Lenovo();
		lenovo.copy();
		lenovo.capture();
		lenovo.keyboard();
		
		Apple apple=new Apple();
		apple.paste();
		apple.cut();
		
		Laptop.audio();
		
		
	}

}
