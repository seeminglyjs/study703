import java.util.ArrayList;
import java.util.Scanner;

public class main616 {

	public static void main(String[] args) {
		
//		Node one =new Node(10, 20);
//		Node two =new Node(30, 40);
//		
//		Node result = one.getCenter(two);
//		System.out.println(result.getX()+ " " + result.getY() );
	
		
		
		
		//학생이름을 입력하면 학번이 나오는 프로그램을 만들어보자.!!!!!
		
//		Student st1 = new Student("장성우", "1666");
//		Student st2 = new Student("장성운", "1336");
//		Student st3 = new Student("장성성", "1226");
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
//			System.out.println("계속 검색을 하고 싶으시면y, 종료하고 싶은면 n");
//			String input = scan.next();
//			
//			if(input.equals("y")) {
//				System.out.println("검색을 시작합니다.");
//			String name = scan.next();
//			boolean flag = false;
//			
//					for(Student stu : List) {
//						if(stu.getName().equals(name)) {
//							System.out.println("해당하는 학생의 학번은"+stu.getNo());
//							flag =true;												
//						}
//					}
//			if (!flag) {System.out.println("해당하는 학생이름이 없습니다.");
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
		
		Student st1 = new Student("장성우", "44");
		Student st2 = new Student("장윤선", "43");
		Student st3 = new Student("장장장", "42");
		
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
			System.out.println("검색을 하고 싶으면 y / 아니면 n을 입력하세요");
			String input = scan.next();
			Boolean flag = false;
			
			if(input.equals("y")) {
			
				System.out.println("학생의 이름을 입력하세요!");
				String name =  scan.next();
			
			for(Student stu : list) {
			if(stu.getName().equals(name)){
			System.out.println("해당 학생의 학번은" + stu.getNo());
			flag = true;
			
			}
			
		}if(!flag) {
			System.out.println("입력하신 학생의 정보는 존재하지 않습니다.");
				
			}
			}else if(input.equals("n")) {
				System.out.println("검색을 종료합니다.");
				break;
			}
			
		
			}
		
		
		
		
		
		
		
		
		
		
		
//		
//	}System.out.println("프로그램이 종료되었습니다.");
	
//	
//		가족정보 fm1 = new 가족정보("장윤선", "글로벌 흑인");
//		가족정보 fm2 = new 가족정보("장성우", "멋쟁이");
//		가족정보 fm3 = new 가족정보("장홍석", "스팸");
//		가족정보 fm4 = new 가족정보("유미옥", "빠킹엘보");
//		
//		ArrayList<가족정보> List = new ArrayList<가족정보>();
//		
//		List.add(fm1);
//		List.add(fm2);
//		List.add(fm3);
//		List.add(fm4);
//		
//		for(가족정보 fam :  List) {
//			System.out.print(fam.getName()+ " ");
//			System.out.println(fam.getJob());
//		}
//		
//		Scanner scan = new Scanner(System.in);
//		
//		while(true) {
//			System.out.println("가족의 직업이 궁금하면 ?를 / 궁금하지 않으면 NO를 입력해 주세요");
//			String input = scan.next();
//			if(input.equals("?")) {
//				System.out.println("가족의 이름을 입력해주세요");
//				String name = scan.next();
//				Boolean flag = false;
//				
//				for(가족정보 fam : List) {
//					if(name.equals(fam.getName())) {
//						System.out.println("가족구성원의 직업은 " + fam.getJob());
//						flag = true;
//					}
//					}
//				if(!flag) {System.out.println("해당하는 가족 구성원은 존재하지 않습니다!");
//			}
//			}
//		    else if (input.contentEquals("NO"))			
//		    {System.out.println("프로그램이 종료되었습니다."); 
//		    break;}
//		    	}
	
//		
//		practice a1 = new practice("장성우", "남", "20");
//		practice a2 = new practice("엄재민", "여", "24");
//		practice a3 = new practice("유미옥", "여", "23");
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
//			System.out.println("정보를 알고 싶으면 y / 종료하고 싶으면 n을 눌러 주세요");
//			String input = scan.next();
//			if(input.equals("y")){
//				System.out.println("이름을 입력해주세요");
//				String name = scan.next();
//				Boolean flag = false;
//				
//				for(practice a : List) {
//				if(name.equals(a.getName())){
//					System.out.println("해당 이름을 가진 사람의 성별/나이는 = "+a.getSex()+"/"+a.getAge());
//					flag = true;
//					
//				}if(!flag) {
//					System.out.println("해당 이름을 가진 사람은 없습니다.");
//					}
//								}
//				
//			}else if(input.equals("n")) {
//				System.out.println("해당 프로그랩을 종료합니다.");
//				break; }
//			
//		}
	
//	
//		Scanner scan = new Scanner(System.in);
//		System.out.println("총 학생의 수를 입력하세요.");
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
//			System.out.println("학생의 이름을 입력하세요  :" );
//			name = scan.next();
//			System.out.println("학생의 나이를 입력하세요  :" );
//			age = scan.nextInt();
//			System.out.println("학생의 성별을 입력하세요  :" );
//			sex = scan.next();
//			System.out.println("학생의 학번을 입력하세요  :" );
//			number = scan.nextInt();
//			System.out.println("학생의 반을 입력하세요  :" );
//			classno = scan.next();
//			System.out.println("학생의 담당선생님을 입력하세요  :" );
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
//		System.out.println("학생의 수를 입력해 주세요");
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
//			System.out.println("학생의 이름을 입력해 주세요!");
//			name = scan.next();
//			System.out.println("학생의 나이를 입력해 주세요!");
//			age = scan.nextInt();
//			System.out.println("학생의 성별을 입력해 주세요!");
//			sex = scan.next();
//			System.out.println("학생의 학번을 입력해 주세요!");
//			number = scan.nextInt();
//			System.out.println("학생의 반을 입력해 주세요!");
//			classno = scan.next();
//			System.out.println("학생의 담당선생님을 입력해 주세요!");
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

	



