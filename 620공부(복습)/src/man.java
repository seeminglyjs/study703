
public class man {
	
	String name;
	String sex;
	int age;
	

	public man(String name, String sex, int age) {
		super();
		this.name = name;
		this.sex = sex;
		this.age = age;
	}
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	public void show() {
		System.out.println("-------------------------");
		System.out.println("�ش� ����� �̸���" + name);
		System.out.println("�ش� ����� ������" + sex);
		System.out.println("�ش� ����� ���̴�" + age);
		
	}
	
	
}
