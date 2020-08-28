import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class main202007 {
	
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) throws NumberFormatException, IOException {

		
		
		
		
///////////701(문자열복습내용)/////////////////////////////////		
//		[11654]
//		
//		System.out.println("문자를 입력해주세요.");	
//		char text = scan.nextLine().charAt(0);
//		int no = (int) text;
//		System.out.println(no);
		
		
//		[11720번]		
//		
//		System.out.println("숫자를 입력해주세요.");
//		String number = scan.nextLine();
//		int sum = 0;
//		
//		
//		
//		System.out.println();
//		for(int i = 0; i < number.length(); i++) {
//			sum += Integer.parseInt(number.substring(i, i+1));
//			System.out.println(sum); //확인용으로 대입함..
//		}
//		
//		System.out.println(sum);
		
		
//		[10809번]	
//		System.out.println("문자를 입력해주세요.");
//		String text = scan.nextLine();
//		
//		for(char c = 'a'; c <= 'z'; c++) {
//			System.out.print(text.indexOf(c)+ " ");
//			//입력한 문자가 어느 위치에 indexof들어간 문자내 어디에 위치하는지 알려준다.
//		}
		

//		[2675번]	
//		
//		System.out.println("테스트 케이스를 입력해주세요.");
//		int T = scan.nextInt();
//		System.out.println("반복횟수를 입력해주세요.");
//		String result = "";
//		
//		System.out.println("문자를 입력해주세요.");
//		for(int i = 0; i < T; i++) {
//			int R = scan.nextInt();
//			String text = scan.next();
//			for(int j = 0; j < text.length(); j++) {
//				for(int k = 0; k < R; k++) {
//					result += text.charAt(j);
//				}
//			}
//		} System.out.println(result);
	
	
//		[1157번] 
//		
//		
//		System.out.println("문자를 입력해주세요.");
//		String text = scan.nextLine().toUpperCase();
//		int [] count = new int[26];
//		int max = 0;
//		char result = '?';
//				
//		for(int i = 0; i < text.length(); i++) {
//			count[text.charAt(i) - 65]++;
//			if(max < count[text.charAt(i) - 65]) {
//				max = count[text.charAt(i) - 65];
//				result = text.charAt(i);
//			}
//			else {
//				result ='?';
//			}
//		}System.out.println(result);
//		
//	
///////////////////////////////////////////////////////////////////////////////////////		
		
//		[1152번]		
//		
//		System.out.println("문장을 입력해주세요.");
//		String str = scan.nextLine();
//		int count = 1;
//		
//		
//		for(int i = 1; i < str.length()-1; i++) {
//			if(str.charAt(i) == ' ') {
//				count++;
//			}
//
//		}
//		
//		System.out.println(count);
		
///////////////////////////////////////////////////////////////////////////////////////		
		
//		[2908번]				
		
//		System.out.println("정수 두개를 입력해주세요.");
//		
//		String a = scan.next();
//		String b = scan.next();
//		String max = "";
//		
//		
//		for(int i = a.length()-1; i >=0; i--) {
//			max += a.charAt(i);
//		}
//			a = max;
//			
//		max = "";
//	
//		for(int i = b.length()-1; i >= 0; i--) {
//			max += b.charAt(i);
//		}
//			b = max;
//		
//		int ano = Integer.parseInt(a);	
//		int bno = Integer.parseInt(b);	
//			
//		if( ano > bno) {
//			System.out.println(ano);
//		}else {
//			System.out.println(bno);
//		}

//		[5622번]		
	
//		final int num [] = {3,3,3,4,4,4,5,5,5,6,6,6,7,7,7,8,8,8,8,9,9,9,10,10,10};
//		
//		
//		System.out.println("문자를 입력해주세요.");
//		String str = scan.next().toUpperCase();
//		int sum = 0;
//		
//		for(int i = 0; i < str.length(); i++) {
//			sum += num[str.charAt(i)- 65];
//		}
//	
//		System.out.println(sum);
//	
//	

		
//		[2941번]	
	
//		final String cro [] = {"c=","c-","dz=","d-","lj","nj","s=","z="};
//		System.out.println("문자를 입력해주세요.");
//		String str = scan.next();
//		int sum = 0;
//		
//		for(int i = 0; i < str.length(); i++) {
//			if(str.contains(cro[i])) {
//				str = str.replaceAll(cro[i], "#");
//				System.out.println(str);
//			}
//		}
//		sum = str.length();
//		System.out.println(sum);
//		System.out.println(str);

		
		
		
		
		
		
		
		
		
///////////702(boolean 배열복습내용)/////////////////////////////////				
		
//		boolean isPowerOn = true; //Boolean 타입의 변수가 true면 false로, false면 true로 바꾸는 코드
//		isPowerOn = !isPowerOn; // if를 쓸 필요 없다.
//		
//		//Boolean 형태로 배열을 선언하고 초기화하는 예제
//		boolean [] bitList;
//		bitList = new boolean[10]; //기본값으로 초기화

		
//		Arrays.fill(bitList, false); //특정 값으로 초기화
//		for(int i = 0 ; i <bitList.length; i++) {
//			System.out.println(bitList[i]);
//		}
	
//		부울 연산은 보통 다음처럼 조건문의 판단 기준으로 많이 사용된다.
//		int base = 180;
//		int height = 185;
//		boolean isTall = height > base;
//
//		if (isTall) {
//		    System.out.println("키가 큽니다.");
//		}
//	
//	
//		boolean a = compareAB(60, 70);
//		System.out.println(a);
//		
//		
//	}
//
//	private static boolean compareAB(int a, int b) {
//		if(a == b) {
//			return true;
//		}else {
//			return false;
//		}
//	}		


		
		
		
		
		
		
		
///////////703(복습내용)/////////////////////////////////	
		
//		[15596번]			
//		int [] a = new int [10];
//		for(int i= 0; i < a.length; i++) {
//			a[i] = i;
//		}
//		
//		System.out.println(test(a));
//		
//
//		
//		boolean [] notSelfNo = new boolean [10000];
//		for(int i = 1; i < notSelfNo.length; i++) {
//			int number = selfno(i);
//			if(number <= 10000){
//				notSelfNo[number] = true;
//			}
//		}
//		for(int i = 1; i < notSelfNo.length; i++) {
//			if(!notSelfNo[i]) {
//				System.out.println(i);
//			}
//		}
//		
//		
//		
//	}
//	
//	
////		[4673번]
//	
//	public static int selfno(int n) {
//		int number = n;
//		while(n > 0) {
//			number += n % 10;
//			n /= 10;
//		}
//		return number;
//		[15596번]		
//	public static int test(int[] a){
//		int sum = 0;
//		for(int i =0; i < a.length; i++) {
//			sum += a[i];
//		}
//		return sum;
//		
//	}
		
		
		
		
		
		
		
		
///////////706(if 중괄호 삭제내용)/////////////////////////////////			
		
		
//		자바의 경우에는 보다 유연하게 중괄호{} 를 생략해서 쓸 수 있다.
//
//		if(1==2)
//		  System.out.println("false");
//		else
//		  System.out.println("true");
//
//		와 같이 중괄호{} 를 생략해서 쓸 수 있다.
//		단, 붙여도 상관없으며, 한곳에서만 붙여도 무방하다.
//		아래와 같이 부분적으로 중괄호 사용 가능.
//
//		if(1==2){
//		  System.out.println("false");
//		}
//		else
//		  System.out.println("true");
//
//		그리고, 중괄호{} 부분은 내려서 써도 상관없다.
//		if(1==2)
//		  {
//		  System.out.println("false");
//		  }
//
//		중괄호를 생략해서 쓰는 사람이 꽤 많은듯 한데,
//		조건문이 길어지다보면, 각 처리부분의 구역 구별이 불분명해지는 문제점이 생긴다.
//		따라서, 웬만하면 중괄호를 붙여서 구역을 확실히 구분 지어주는 것이 좋은듯 하다.
//		좀 귀찮고, 문장이 몇줄 길어지더라도 중괄호를 붙이는 습관을 들이는 것이 좋다.
//
//		if 문의 경우, else if 구문을 사용할때도 중괄호 생략이 가능한데,
//		주의할점은, else if 문을 사용하면, 마지막에 반드시 else 구문이 붙어야 한다는 것이다.
//
//		if(1==2){
//		  System.out.println("1");
//		}else if(1==3){
//		  System.out.println("2");
//		}else{
//		  System.out.println("3");
//		}
//
//		위의 부분에서 else 부분을 생략해서는 안된다.(에러발생)
//
//		이 구문은 중괄호를 생략해서 아래와 같이 쓸 수 있다.
//
//		if(1==2)
//		  System.out.println("1");
//		else if(1==3)
//		  System.out.ptintln("2");
//		else
//		  System.out.println("3");
//
//		또한, 부분적으로 중괄호{} 를 생략해서 쓰는 예를 보자.
//
//		if(1==2){
//		  if(2==3)
//		    System.out.println("3");
//		  else
//		    System.out.println("4");
//		}
//		else
//		  System.out.println("5");
//
//		위와같이 부분적으로 중괄호{} 를 생략해서 사용 가능하다.
//
//		그러나, 위에서 보면 부분적으로는 중괄호{} 를 사용하고 있는데,
//		중첩된 if 문이기 때문에 그 경계를 분명히 하기 위해서 사용한 것으로 보여진다.
//		근본적으로는 혼란을 막기위해, 아래와 같이 중괄호를 생략하지 않고 사용하는 것이 명확하다.
//
//		if(1==2){
//		  if(2==3){
//		    System.out.println("3");
//		  }else{
//		    System.out.println("4");
//		  }
//		}else{
//		  System.out.println("5");
//		}
//
//		이렇게 하면, 좀 복잡해 보이긴 하지만, 그 경계가 분명해서 가독성(문장이해)이 더 높아진다.

		
		
		
		
///////////707(ArrayList)/////////////////////////////////			

//		ArrayList는 List 인터페이스를 상속받은 클래스로 크기가 가변적으로 변하는 선형리스트입니다. 
//		일반적인 배열과 같은 순차리스트이며 인덱스로 내부의 객체를 관리한다는점등이 유사하지만 
//		한번 생성되면 크기가 변하지 않는 배열과는 달리 
//		ArrayList는 객체들이 추가되어 저장 용량(capacity)을 초과한다면 
//		자동으로 부족한 크기만큼 저장 용량(capacity)이 늘어난다는 특징을 가지고 있습니다.
		
		
//		ArrayList list = new ArrayList();//타입 미설정 Object로 선언된다.
//		ArrayList<Student> members = new ArrayList<Student>();//타입설정 Student객체만 사용가능
//		ArrayList<Integer> num = new ArrayList<Integer>();//타입설정 int타입만 사용가능
//		ArrayList<Integer> num2 = new ArrayList<>();//new에서 타입 파라미터 생략가능
//		ArrayList<Integer> num3 = new ArrayList<Integer>(10);//초기 용량(capacity)지정
//		ArrayList<Integer> list2 = new ArrayList<Integer>(Arrays.asList(1,2,3));//생성시 값추가
		
//		ArrayList선언시 ArrayList list = new ArrayList()로 선언 후 
//		내부에 임의의 값을 넣고 사용할수도 있지만 이렇게 사용할경우 값을 뽑아내기 위해서는 
//		캐스팅(Casting) 연산이 필요하고 잘못된 타입으로 캐스팅을 한 경우에는 에러가 발생하기에 
//		위와 같은 방식은 추천하지 않습니다. ArrayList를 사용할시에는 ArrayList에 타입을 명시해주는것이 좋습니다. 
//		JDK 5.0이후부터 자료형의 안정성을 위해 제너릭스(Generics)라는 개념이 도입되었습니다. 
//		ArrayLIst<String> list = new ArrayList<String>(); 
//		이라고 되어있다면 String객체들만 add되어질수있고 다른 타입의 객체는 사용이 불가능합니다.
		

//		ArrayList 값 추가
//		ArrayList<Integer> list = new ArrayList<Integer>();
//		list.add(3); //값 추가
//		list.add(null); //null값도 add가능
//		list.add(1,10); //index 1뒤에 10 삽입
//		ArrayList<Student> list = new ArrayList<Student>();
//		Student student = new Student(name,age);
//		members.add(student);
//		members.add(new Member("홍길동",15));
		
//		ArrayList에 값을 추가하려면 ArrayList의 add(index, value) 메소드를 사용하면 됩니다. 
//		index를 생략하면 ArrayList 맨 뒤에 데이터가 추가되며 index중간에 값을 추가하면 
//		해당 인덱스부터 마지막 인덱스까지 모두 1씩 뒤로 밀려납니다. 

		
//		ArrayList 값 삭제
//		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(1,2,3));
//		list.remove(1);  //index 1 제거
//		list.clear();  //모든 값 제거
//		ArrayList에 값을 제거하려면 ArrayList의 remove(index) 메소드를 사용하면 됩니다. 
//		remove()함수를 사용하여 특정 인덱스의 객체를 제거하면 바로 뒤 인덱스부터 마지막 인덱스까지 모두 앞으로 1씩 당겨집니다. 
//		모든 값을 제거하려면 clear() 메소드를 사용하면 됩니다.
		
		
		
//		ArrayList 크기 구하기
//		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(1,2,3));
//		System.out.println(list.size()); //list 크기 : 3
//		ArrayList의 크기를 구하려면 ArrayList의 size() 메소드를 사용하면 됩니다.
	
	
	
	
	
//		ArrayList 값 출력
//		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(1,2,3));
//
//		System.out.println(list.get(0));//0번째 index 출력
//				
//		for(Integer i : list) { //for문을 통한 전체출력
//		    System.out.println(i);
//		}
//
//		Iterator iter = list.iterator(); //Iterator 선언 
//		while(iter.hasNext()){//다음값이 있는지 체크
//		    System.out.println(iter.next()); //값 출력
//		}
//		ArrayList의 get(index) 메소드를 사용하면 ArrayList의 원하는 index의 값이 리턴됩니다. 
//		전체출력은 대부분 for문을 통해서 출력을하고 Iterator를 사용해서 출력을 할수도 있습니다.
//
//		 
//
//		ArrayList 값 검색
//		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(1,2,3));
//		System.out.println(list.contains(1)); //list에 1이 있는지 검색 : true
//		System.out.println(list.indexOf(1)); //1이 있는 index반환 없으면 -1
//		ArrayList에서 찾고자 하는 값을 검색하려면 ArrayList의 contains(value) 메소드를 사용하면 됩니다. 
//		만약 값이 있다면 true가 리턴되고 값이 없다면 false가 리턴됩니다. 
//		값을 있는 index를 찾으려면 indexOf(value) 메소드를 사용하면 되고 만약 값이 없다면 -1을 리턴합니다.


		
		
		
		
///////////708(문자열 붙이기 Concat Append)/////////////////////////////////		
//		
//		String a = " a b c ";
//		String b = "c c c c b c ";
//		
//		System.out.println(a.concat(b));
//		
//		StringBuilder sb = new StringBuilder("adsdwe");
//		
//		sb.append("sdsdaswewe");
//		sb.append("wewewrwrwr");
//		System.out.println(sb);
		
	

		
		
		
///////////710(문자열 indexOf, lastIndexOf)/////////////////////////////////			
	
//		String str = "i am sopgk";
//		
//		for(char c = 'a'; c <= 'z'; c++) {
//			for(char c1 = 'a'; c <= 'z'; c++) {	
//			System.out.print(str.indexOf(c1)+ " ");
//			}
//			System.out.println();
//			System.out.print(str.lastIndexOf(c)+ " ");
//		}
	

		
		
		
		
		
		
		
		
		
		
/////////711(복습)/////////////////////////////////	
		
		
//		백준[1978]
		
//		Scanner scan = new Scanner(System.in);
//		int N = scan.nextInt();
//		Boolean flag = true;
//		int count = 0;
//		
//		
//		for(int i = 0; i < N; i++) {
//			int M = scan.nextInt();
//			if( M <= 1) {
//				flag = false;
//			}else {
//				for(int j = 2; j <= M / 2; j++) {
//					if(M % j == 0) {
//						flag = false;
//					}
//					if(flag)
//						count++;
//						flag = true;
//				}
//			}
//		}
//		System.out.println(count);
//		
	
//		백준[2581번]		
		
//		Scanner scan = new Scanner(System.in);
//		int M = scan.nextInt();
//		int N = scan.nextInt();
//		int min = 10001;
//		int sum = 0;
//		int count = 0;
//		
//		for(int i = M; i <= N; i++) {
//			for(int j = 2; j < i/2; j++) {
//				if(i % j == 0) 
//					count++;
//			}
//				if(count == 0 && i !=1) {
//					sum += i;
//					if(min > i) 
//						min = i;
//					
//				}
//				count = 0;
//			}
//		
//		System.out.println(sum);
//		System.out.println(min);

		
		
//		백준[4948번]		
		
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		System.out.println("N을 입력해 주세요.");
//		int N = Integer.parseInt(br.readLine());
//		int TwoN = N * 2;
//		int check = 0;
//		int count = 0;
//		int i = N;
//		
//		while(i <= TwoN) {
//			for(int j = 2; j <= i / 2; j++) {
//			if(i % j == 0) 
//				check ++;
//		}
//			if(check == 0 && i != 1 ) {
//				count++;
//			}
//			check =  0;
//			i++;
//	} 
//		System.out.println(count);
		
//		Scanner s = new Scanner(System.in);
//		int m=1;
//		while(true) {
//			m=s.nextInt();
//			if (m == 0) break;
//			int n = m * 2;
//			int cnt = 0;
//			boolean[] data= new boolean[n+1];
//			
//			data[0]=false;
//			data[1]=false;
//			
//			for(int i=2; i<=n; i++) 
//				data[i]=true;
//			
//			for(int i=2; i<=n; i++) 
//				
//				for(int j=2; j*i<=n; j++) 
//					data[i*j]=false;
//			
//			for(int i=m+1; i<data.length; i++) 
//				if (data[i]) cnt++;
//			System.out.println(cnt);
//		}
//		
		
		
	
//		Scanner scan = new Scanner(System.in);
//		while(true) {
//		int M = scan.nextInt();
//		int N = M * 2;
//		
//		if(M == 0) {
//			break;
//		}
//		
//		int[] nums = new int[(N+1)];
//		for(int i=2; i<=N; i++) {
//			nums[i] = i;
//		}
//		
//		for(int i=2; i<=Math.sqrt(N); i++) {
//			if(nums[i] == 0) {
//				continue;
//			}
//			
//			int temp = i;
//			for(int j = i+1; j<=N; j++) {
//				if(j % temp == 0) {
//					nums[j] = 0;
//				}
//			}
//		}
//		
//		int count = 0;
//		for(int i = M+1; i <nums.length; i++){
//			if(nums[i] != 0)
//				count++;
//		}
//		System.out.println(count);
//		
//	}
		
		
/////////712(복습)/////////////////////////////////			

	
//	 백준[9020번] 		
//		 Scanner input = new Scanner(System.in);
//	      int i = 0;
//	      int a = 0,b = 0; //소수의 곱 
//	      int n = 0;
//	      int z = input.nextInt();
//	      for(int j = 0 ;j < z; j++)
//	      {
//	      n=input.nextInt();
//	      for(a = n/2, b = n/2;; a++,b--)
//	      {
//	         n=a+b;
//	         if(check(a)&&check(b))
//	         {
//	            System.out.println(b+" "+a);
//	            break;
//	         }
//	      }
//	      }
//	      //1. 입력을 받는다
//	      
//	      //2 . 입력받은 값을 소수의 곱으로 표현한다.
//
//	}
//	
//	 public static boolean check(int n)
//	   {
//	      //자기 자신과 1 말고는 나누어 져서는 안됨.
//	      
//	      
//	      for(int i = 2; i <= n/2; i++)
//	      {
//	         if(n%i == 0)
//	            return false;
//	      }
//	      return true;
//	   }
		
//		[1085번]				
		
//		int x = scan.nextInt();
//		int y = scan.nextInt();
//		int w = scan.nextInt();
//		int h = scan.nextInt();
//	
//		ArrayList<Integer> List = new ArrayList<Integer>();
//		
//		List.add(x);
//		List.add(y);
//		List.add(w-x);
//		List.add(h-y);
//		System.out.println(List.get(0));
	
	///////712(복습)/////////////////////////////////			

		
//		백준 1018 참고용 데이터
//		
//		 for( int i = 0 ;i < N ; i++){
//	            String line = scan.next();
//	            for(int j = 0; j < M ; j++){
//	                Chess[i][j] = line.charAt(j);
//	            }
//	        }
//	        for(int i =0 ; i < N-7 ; i++) {
//	            for (int j = 0; j < M - 7; j++) {
//	                int ChangeCount1 = 0;
//	                int ChangeCount2 = 0;
//	                int Exchange=0;
//	                
//	                for(int x = 0; x < 8; x++){
//	                    for(int y = 0; y < 8 ; y++){
//	                        if(Chess[i+x][j+y] != Test1[x][y]){
//	                            ChangeCount1++;                          
//	                        }	                      
//	                    }
//	                }
//	                for(int x = 0; x < 8;x++){
//	                    for(int y = 0; y < 8 ; y++){
//	                        if(Chess[i+x][j+y] != Test2[x][y]){
//	                            ChangeCount2++;
//	                           
//	                        }
//	                    }
//	                }
//	                
//	                Exchange = (ChangeCount1 > ChangeCount2) ? ChangeCount2 : ChangeCount1;
//	                if(min > Exchange) min = Exchange;
//	            }
//	        }
//	                System.out.print(min);
		
		
	/////718(인접행렬 인접리스트)/////////////////////////////////				
//		ArrayList를 사용하여 구현한 양방향 인접리스트 소스코드

//	}
//	//그래프(리스트) 클래스
//	class ListGraph{
//		private ArrayList<ArrayList<Integer>>listGraph;
//	}
//	
//	//그래프 초기화
//	public ListGraph(int intSize) {
//		this.listGraph = new ArrayList<ArraList<Integer>>();
//		 // 그래프 초기화
//        // put(int x, int y) 에서 입력되는 정점의 값은 0 이상의 정수이나
//        // ArrayList의 index는 0 부터 시작이므로 
//        // ArrayIndexOutOfBoundsException 방지를 위해 
//        // 정점을 담는 인접리스트의 size는 1을 더하여 초기화해줌
//        // ex) initSize = 3
//        // graph[0]
//        // graph[1] -> 2 -> 3
//        // graph[2] -> 1 -> 3 -> 4
//        // graph[3] -> 1 -> 2 -> 4 -> 5
//        for(int i=0; i<initSize+1; i++) {
//            listGraph.add(new ArrayList<Integer>());
//        }
//    }
// 
//    // 그래프 return
//    public ArrayList<ArrayList<Integer>> getGraph() {
//        return this.listGraph;
//    }
// 
//    // 그래프의 특정 노드 return
//    public ArrayList<Integer> getNode(int i) {
//        return this.listGraph.get(i);
//    }
// 
//    // 그래프 추가 (양방향)
//    public void put(int x, int y) {
//        listGraph.get(x).add(y);
//        listGraph.get(y).add(x);
//    }
// 
//    // 그래프 추가 (단방향)
//    public void putSingle(int x, int y) {
//        listGraph.get(x).add(y);
//    }
//    
//    // 그래프 출력 (인접리스트)
//    public void printGraphToAdjList() {
//        for(int i=1; i<listGraph.size(); i++) {
//            System.out.print("정점 " + i + "의 인접리스트");
//            
//            for(int j=0; j<listGraph.get(i).size(); j++) {
//                System.out.print(" -> " + listGraph.get(i).get(j));
//            }
//            System.out.println();
//        }
//    }
//}
// 
//public class AdjacencyList {
//    
//    public static void main(String[] args) {
//        int initSize = 6;
//        ListGraph adjList = new ListGraph(initSize);
//        
//        adjList.put(1, 2);
//        adjList.put(1, 3);
//        adjList.put(2, 3);
//        adjList.put(2, 4);
//        adjList.put(3, 4);
//        adjList.put(3, 5);
//        adjList.put(4, 5);
//        adjList.put(4, 6);
//        
//        adjList.printGraphToAdjList();
//    }
//    
}

}
