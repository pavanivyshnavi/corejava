package interfaces;

public class Apple implements Laptop {

	public void copy() {
		System.out.println("apple copy code");
		}

	public void cut() {
		System.out.println("apple cut code");
		
	}
    public void paste() {
		System.out.println("apple paste code");
		
	}
    public void keyboard() {
		System.out.println("apple keyboard code");
	}
	@Override
	public void security() {
		System.out.println("apple security code");
	}

}
