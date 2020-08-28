
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
		System.out.println("해당 사람의 이름은" + name);
		System.out.println("해당 사람의 성별은" + sex);
		System.out.println("해당 사람의 나이는" + age);
		
	}
	
	
}
