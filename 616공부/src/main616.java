import java.util.ArrayList;
import java.util.Scanner;

public class main616 {

	public static void main(String[] args) {
		
//		Node one =new Node(10, 20);
//		Node two =new Node(30, 40);
//		
//		Node result = one.getCenter(two);
//		System.out.println(result.getX()+ " " + result.getY() );
	
		
		
		
		//�л��̸��� �Է��ϸ� �й��� ������ ���α׷��� ������.!!!!!
		
//		Student st1 = new Student("�强��", "1666");
//		Student st2 = new Student("�强��", "1336");
//		Student st3 = new Student("�强��", "1226");
//	
//		ArrayList <Student> List = new ArrayList<Student>();
//		
//		List.add(st1);
//		List.add(st2);
//		List.add(st3);
//		
//		
//		for(Student stu : List) {
//			System.out.println(stu.getName());
//			System.out.println(stu.getNo());
//		}
//		
//		
//		Scanner scan = new Scanner(System.in);
//		while (true) {
//			System.out.println("��� �˻��� �ϰ� �����ø�y, �����ϰ� ������ n");
//			String input = scan.next();
//			
//			if(input.equals("y")) {
//				System.out.println("�˻��� �����մϴ�.");
//			String name = scan.next();
//			boolean flag = false;
//			
//					for(Student stu : List) {
//						if(stu.getName().equals(name)) {
//							System.out.println("�ش��ϴ� �л��� �й���"+stu.getNo());
//							flag =true;												
//						}
//					}
//			if (!flag) {System.out.println("�ش��ϴ� �л��̸��� �����ϴ�.");
//				
//			}
//			
//			
//			}
//			else if (input.equals("n"))
//			{break;
//		}
//		
//			
//		
		
		Student st1 = new Student("�强��", "44");
		Student st2 = new Student("������", "43");
		Student st3 = new Student("������", "42");
		
		ArrayList<Student> list = new ArrayList<Student>();
		
		list.add(st1);
		list.add(st2);
		list.add(st3);
		
		for(Student stu : list) {
			System.out.println(stu.getName());
			System.out.println(stu.getNo());
		}
		
		
		Scanner scan = new Scanner(System.in);
		
	
		while(true) {
			System.out.println("�˻��� �ϰ� ������ y / �ƴϸ� n�� �Է��ϼ���");
			String input = scan.next();
			Boolean flag = false;
			
			if(input.equals("y")) {
			
				System.out.println("�л��� �̸��� �Է��ϼ���!");
				String name =  scan.next();
			
			for(Student stu : list) {
			if(stu.getName().equals(name)){
			System.out.println("�ش� �л��� �й���" + stu.getNo());
			flag = true;
			
			}
			
		}if(!flag) {
			System.out.println("�Է��Ͻ� �л��� ������ �������� �ʽ��ϴ�.");
				
			}
			}else if(input.equals("n")) {
				System.out.println("�˻��� �����մϴ�.");
				break;
			}
			
		
			}
		
		
		
		
		
		
		
		
		
		
		
//		
//	}System.out.println("���α׷��� ����Ǿ����ϴ�.");
	
//	
//		�������� fm1 = new ��������("������", "�۷ι� ����");
//		�������� fm2 = new ��������("�强��", "������");
//		�������� fm3 = new ��������("��ȫ��", "����");
//		�������� fm4 = new ��������("���̿�", "��ŷ����");
//		
//		ArrayList<��������> List = new ArrayList<��������>();
//		
//		List.add(fm1);
//		List.add(fm2);
//		List.add(fm3);
//		List.add(fm4);
//		
//		for(�������� fam :  List) {
//			System.out.print(fam.getName()+ " ");
//			System.out.println(fam.getJob());
//		}
//		
//		Scanner scan = new Scanner(System.in);
//		
//		while(true) {
//			System.out.println("������ ������ �ñ��ϸ� ?�� / �ñ����� ������ NO�� �Է��� �ּ���");
//			String input = scan.next();
//			if(input.equals("?")) {
//				System.out.println("������ �̸��� �Է����ּ���");
//				String name = scan.next();
//				Boolean flag = false;
//				
//				for(�������� fam : List) {
//					if(name.equals(fam.getName())) {
//						System.out.println("������������ ������ " + fam.getJob());
//						flag = true;
//					}
//					}
//				if(!flag) {System.out.println("�ش��ϴ� ���� �������� �������� �ʽ��ϴ�!");
//			}
//			}
//		    else if (input.contentEquals("NO"))			
//		    {System.out.println("���α׷��� ����Ǿ����ϴ�."); 
//		    break;}
//		    	}
	
//		
//		practice a1 = new practice("�强��", "��", "20");
//		practice a2 = new practice("�����", "��", "24");
//		practice a3 = new practice("���̿�", "��", "23");
//		
//		ArrayList<practice> List = new ArrayList<practice>();
//		
//
//		List.add(a1);
//		List.add(a2);
//		List.add(a3);
//		
//		for(practice a : List) {
//			System.out.println(a.getAge());
//			System.out.println(a.getSex());
//			System.out.println(a.getName());
//		
//		}
//		
//		Scanner scan = new Scanner(System.in);
//		
//		while(true) {
//			System.out.println("������ �˰� ������ y / �����ϰ� ������ n�� ���� �ּ���");
//			String input = scan.next();
//			if(input.equals("y")){
//				System.out.println("�̸��� �Է����ּ���");
//				String name = scan.next();
//				Boolean flag = false;
//				
//				for(practice a : List) {
//				if(name.equals(a.getName())){
//					System.out.println("�ش� �̸��� ���� ����� ����/���̴� = "+a.getSex()+"/"+a.getAge());
//					flag = true;
//					
//				}if(!flag) {
//					System.out.println("�ش� �̸��� ���� ����� �����ϴ�.");
//					}
//								}
//				
//			}else if(input.equals("n")) {
//				System.out.println("�ش� ���α׷��� �����մϴ�.");
//				break; }
//			
//		}
	
//	
//		Scanner scan = new Scanner(System.in);
//		System.out.println("�� �л��� ���� �Է��ϼ���.");
//		int no = scan.nextInt();
//		
//		highstudent[] student = new highstudent[no];
//		
//		for(int i = 0; i<no; i++ ) {
//			
//			String name;
//			int age;
//			String sex;
//			int number;
//			String classno;
//			String teacher;
//	
//			System.out.println("�л��� �̸��� �Է��ϼ���  :" );
//			name = scan.next();
//			System.out.println("�л��� ���̸� �Է��ϼ���  :" );
//			age = scan.nextInt();
//			System.out.println("�л��� ������ �Է��ϼ���  :" );
//			sex = scan.next();
//			System.out.println("�л��� �й��� �Է��ϼ���  :" );
//			number = scan.nextInt();
//			System.out.println("�л��� ���� �Է��ϼ���  :" );
//			classno = scan.next();
//			System.out.println("�л��� ��缱������ �Է��ϼ���  :" );
//			teacher = scan.next();
//			student[i] = new highstudent( name,  age,  sex,  number,  classno,  teacher);
//			
//		
//		}
//		
//		for(int i = 0; i<no; i++) {
//			student[i].show();
//		}
//		
		
//		
//		
//		
//		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("�л��� ���� �Է��� �ּ���");
//		int no = scan.nextInt();
//		
//		highstudent[] student = new highstudent[no];
//		
//		for(int i = 0; i < no; i++) {
//			
//		
//			
//			String name;
//			int age;
//			String sex;
//			int number;
//			String classno;
//			String teacher;
//			
//			System.out.println("�л��� �̸��� �Է��� �ּ���!");
//			name = scan.next();
//			System.out.println("�л��� ���̸� �Է��� �ּ���!");
//			age = scan.nextInt();
//			System.out.println("�л��� ������ �Է��� �ּ���!");
//			sex = scan.next();
//			System.out.println("�л��� �й��� �Է��� �ּ���!");
//			number = scan.nextInt();
//			System.out.println("�л��� ���� �Է��� �ּ���!");
//			classno = scan.next();
//			System.out.println("�л��� ��缱������ �Է��� �ּ���!");
//			teacher = scan.next();
//			student[i] = new highstudent ( name,  age,  sex,  number,  classno,  teacher);
//			
//			
//			
//			
//		}
//		
//		for(int i = 0; i <no; i++) {
//			student[i].show();
//		}

	
	
	}
		}

	



