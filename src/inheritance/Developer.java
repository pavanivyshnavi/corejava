package inheritance;

public class Developer extends Guest {
	public void write() {
	   super.read();
	   System.out.println("write code");
   }
   public void read() {
		System.out.println("read code updated");
	}
}
