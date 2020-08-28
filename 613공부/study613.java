import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import com.sun.java_cup.internal.runtime.Scanner;

public class study613 {
	
	final static int N = 10;
	
	
	
	public static void main(String[] args) throws IOException {
		
//	 double a = 0.6;
//	 int b = (int) (a+0.5);
	 
//	 System.out.println(b);
	
//		double a = 0.5;
//		
//		int b = (int) (a+0.5);
//		
//		System.out.println(b);
//		
//////////////////////////////////////////////////////////////		
		
//		for(char i ='a'; i <= 'z'; i++) {
//			
//			System.out.print(i + ",");
//		}
		
		
//		for(char i = 'a'; i <= 'z'; i++ ) {
//			
//			System.out.print(i + " ");
//		}
//		
//		
//////////////////////////////////////////////////vv////////////v////////////			

//		int a = 200;
//		
//		System.out.println("10진수 :" + a);
//		System.out.format("8진수 : %o", + a);
//		System.out.format("16진수 : %x", + a);
//		
	
	
//		String a = "jang sung";
//		
//		System.out.println(a);
//		System.out.println(a.substring(0, 3));
//		System.out.println(a.substring(2, 7));
	
//		
//		String a ="janh sung";
//		
//		System.out.println(a);
//		System.out.println(a.substring(0, 1));
//		System.out.println(a.substring(3, 6));
//		//////////////////////////////////////////////////////////////		//////////////////////////////////////////////////////////////		
		
		
		//분초 계산기
//		int time = 6243;
//		int minutes = time /60;
//		int second = time % 60;
//		
//		System.out.println( minutes +"분"+second+"초" );
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////				
		
//		int time = Time / 3600;
//		int minutes = Time / 60;
//		int second = Time % 60;
//		
//		System.out.println(minutes+ "분 "+ second+"초");
//		System.out.println(time);
		
		

//		int a = (1%3);
//		int b = (2%3);
//		int c = (4%3);
//		int d = (5%3);
//		int e = (6%3);
//		
//		System.out.println(a);
//		System.out.println(b);
//		System.out.println(c);
//		System.out.println(d);
//		System.out.println(e);
	
//		int a = 50;
//		int b = 50;
//		
//		System.out.println("a와 b는 같은가? " + (a == b));
//		System.out.println("a가 b보다 큰가? " + (a > b));
//		System.out.println("a가 b보다 작은가? " + (a < b));
//		System.out.println("a와 b는 같은가? " + (a == b));
//		System.out.println("a와 b와 같고 40보다는 큰가? " + ((a == b) && (a > 40)));
//		System.out.println("a와 b보다 크거나 30보다는 큰가? " + ((a == b) || (a > 30)));
//		System.out.println("a와 50보다 큰가? " + !(a > 50));
	
//		int x =60;
//		int y =80;
//		
//		System.out.println("최댓값은" + max(x,y) +"입니다.");
//				
		
//		int a = 50;
//		int b =70;
//		
//		System.out.println((a<b) && (a>40));
		
//	}	static int max(int a, int b) {
//		int result = (a>b) ? a :b; // 에이가 비보다 크면은 에이를 출력하고 아니면 비를 출력하는 사망연산식
//		return result;
		
//	}

		
		
	

	
//		double a = 
//				Math.pow(3.0, 20.0); // 거듭 제곱 연산 방법
//		System.out.println("3의 20제곱은" + (int)a + "입니다");
//	
//	
//		
//		
//		int a = 80;
//		
//		a += 1 ;
//		
//		if( a>= 80) {
//			System.out.println("해당학생의 점수는"+ a + "으로 합격점수입니다.");
//		}
//		else {
//			System.out.println("해당학생의 점수는"+ a + "으로 불합격점수입니다.");
//		}
//	
		
//		String a = "나는 장윤선입니다.";
//		
//		if(a.contains("장성우")) {
//			System.out.println("네 주인님 명령을 내려주세요");
//		}
//		
//		else {
//			System.out.println("너 새끼는 누구냐 뒤지고 싶은거냐?");
//		}
//		
//	
	
//		int a = 30;
//		
//		점수(5);
//	
//	}
//
//	public static void 점수(int a) {
//		if( a>= 90) {
//			
//			System.out.println("당신의 학접은 A입니다.");
//		}
//		
//		else if (a >= 80) {
//			System.out.println("당신의 학접은 B입니다.");			
//		}
//		else if (a >= 70) {
//			System.out.println("당신의 학접은 c입니다.");			
//		}
//		else {
//			System.out.println("당신의 학접은 장윤선급입니다. 즉 노답이라는 이야기 이지요");			
//		}
//

	
//	
//		String a = "man";
//		int b = 3;
//		
//		if (a.equals("man")) {
//			System.out.println("남자입니다."); 스트링은 문자열이기 때문에 == 으로는 해당값이 동등합을 비교할수 없으며, .equals를 통해서만 해당 값이 같음을 비교할 수 있다.
//		}
//		
//		else {
//			System.out.println("여자 입니다.");
//		}
//		
//		
//		if ( b == 3) {
//			
//			System.out.println("참입니다.");
//		
//		}
//		else {
//			System.out.println("거짓입니다.");
//		}
//	
//	
//	
//	
//	
		
//		
//		String a = "a";
//		
//		if(a.equalsIgnoreCase("A")) { 대문자와 소문자 상관없이 해당값이 참인지 거짓인지를 비교할 수 있음
		
//			System.out.println("같음");
//		}
//		
//		else {
//		System.out.println("같음");	
//		}
//	
//	
//	
//	
//	
		
//		int a = 1, sum = 0;
//		
//		
////		while( a <= 1000) {
////			System.out.print(a + " ");
////			a++;
////		}
////		
//		
//		while( a <= 1000) {
//			
//			sum += a++;
//	
//			System.out.println("1부터 1000까지의 합은" + sum + "입니다.");
//			
//	}	System.out.println("1부터 1000까지의 합은" + sum + "입니다.");
	

	
	//for문으로 삼각형 만들기
//	for(int i = N; i>0; i--) {
//		for(int j = i; j>0; j--) {
//			System.out.print("◈");
//		}
//		System.out.println();
//	}
	
//	for(int i = N; i>0; i--) {
//		for(int j = i; j>0; j--) {
//			System.out.print("◈");
//		}
//		System.out.println();
//	}if(i*i +j*j <= N*N ) 

		
		
		//원을 만들어보자
		
//		x^2 + y^2 = r^2
		
//	for(int i  = -N; i <= N; i++) {
//		
//		for(int j = -N; j <= N; j++) {
//			
//			if(i*i +j*j <= N*N ) {
//		
//				System.out.print("*");
//			
//			}
//			else {
//				System.out.print("-");
//			}
//				
//		
//		} System.out.println();
//	}

	
	
//}	int a = 50;
//	int b = 60;
//
//	static int max(int a, int b) {
//	int result = (a>b) ? a: b;
//	return result;
//	
//}
		
		
		
//		
//		
//	java.util.Scanner	a = new java.util.Scanner(System.in);
//		System.out.println("정수를 입력하세요");
//		int i = a.nextInt();
//		System.out.println("입력된 정수는"+ i+ " 입니다.");
//		a.close();
//		
//		
//		
		
//		
//		File f =new File("input.txt");
//	
//		try {
//			java.util.Scanner sc = new java.util.Scanner(f);
//			while(sc.hasNextInt()) {
//				System.out.println(sc.nextInt() * 100);
//			}
//			sc.close();
//				} catch (FileNotFoundException e) {
//			
//			e.printStackTrace();
//		}
//		
//
//		
//		
//		String a = "장성우";
//		
//		System.out.println(a);
//		
//		
//		
//		System.out.println(10+10);
//		
		
		
		for(int i = 0; i<10; i++ ) {
			
			for(int j =0; j < 10; j++ ) {
			System.out.print("*");
		}
		
			System.out.println();
		
		
	}



//	private static File File(String string) {
//		// TODO Auto-generated method stub
//		return null;
	}
}

