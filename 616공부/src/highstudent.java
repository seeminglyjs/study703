
public class highstudent extends person {

	private int number;
	private String classno;
	private String teacher;
	

	public highstudent(String name, int age, String sex, int number, String classno, String teacher) {
		super(name, age, sex);
		this.number = number;
		this.classno = classno;
		this.teacher = teacher;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getClassno() {
		return classno;
	}
	public void setClassno(String classno) {
		this.classno = classno;
	}
	public String getTeacher() {
		return teacher;
	}
	public void setTeacher(String teacher) {
		this.teacher = teacher;
	}
	
	
	public void show() {
		System.out.println("----------------------");
	System.out.println("�л��̸�  :" + getName());
	System.out.println("�л�����  :" + getAge());
	System.out.println("�л�����  :" + getSex());
	System.out.println("�л��й�  :" + getNumber());
	System.out.println("�л���  :" + getClassno());
	System.out.println("�л���缱����  :" + getTeacher());
	
	}
	
	
	
}
