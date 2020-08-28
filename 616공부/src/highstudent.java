
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
	System.out.println("학생이름  :" + getName());
	System.out.println("학생나이  :" + getAge());
	System.out.println("학생성별  :" + getSex());
	System.out.println("학생학번  :" + getNumber());
	System.out.println("학생반  :" + getClassno());
	System.out.println("학생담당선생님  :" + getTeacher());
	
	}
	
	
	
}
