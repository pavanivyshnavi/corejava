package encapsulation;

public class Student {
	private int rollno;
	private String name;
	private boolean isAttended;
	
	public boolean getisAttended() {
		if(isAttended==false)
			System.out.println("student not attended");
		else
			System.out.println("student attended");
			return isAttended;
		
	}
	public void setAttended(boolean isAttended) {
	this.isAttended = isAttended;
	}
	public int getRollno() {
		System.out.println(rollno);
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		System.out.println(name);
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
