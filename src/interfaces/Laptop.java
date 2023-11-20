package interfaces;

public interface Laptop {
	//until java7
	public void copy();
	public void cut();
	public void paste();
	public void keyboard();
	
	//from java 8 version
	default void security() {
		commoncode();
		System.out.println("laptop security code");
	}
	static void audio() {
		commoncode();
		System.out.println("laptop audio code");
	}
	
	//from java9 version
	private static void commoncode() {
		System.out.println("laptop commoncode");
	}
	
	

}
