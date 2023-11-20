package interfaces;

public abstract class Sampleac implements Laptop {
	public void copy() {
		System.out.println("sample copy code");
	}
	
	public void cut() {
		System.out.println("sample cut code");
		
	}
	public abstract void paste();
	public abstract void keyboard();

}
