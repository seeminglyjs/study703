import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	
	
	public static int max (int a, int b) {
		return (a>b) ? a:b;
	}
	
	
	// a, b, c 중 최댓 값을 구해보자


//	public static int function (int a , int b, int c) {
//		int max = 0;
//		
//		if(a>b) {
//			if(a>c) {
//				max = a;
//			}
//		}else if(b>c) {
//			if(b>a) {
//				max = b;
//			}
//		}else {
//			max =c;
//		}
//		
//
//	return max ;}	
	

	// a의 b번째 공약수를 구해보자 https://www.udemy.com/course/java-programming-tutorial-2017/learn/lecture/8110830?start=90#notes
	
//	public static int funtion (int a, int b) {
//		for(int i = 1; i <a; i++) {
//			if( a % i  == 0) {
//				b--;
//			if( b == 0 ) {
//				return i;}
//			}
//		}
//		
//		
//	return -1;}
	
	
	
//	// 펙토리얼을 구해보자
//	
//	public static int factorial (int number) {
//		int sum =1;
//		for(int i = 1; i <= number; i++) {
//			sum *= i;
//		} return sum;
//	}
/////////////////////////////////////////////////////////////////////////////////	
	
	//피보나치 구하기
//	
//	public static int fivo (int x) {
//		int a= 1;
//		int b =1;
//		int result = 0;
//		
//		for(int i = 1; i<x; i++) {
//			result += a + b;
//			a = b;
//			b = result;
//}
//		
//
//	return result;}
//	
	
	
	
 
	public static void main(String[] args) {
		
		
//		//알파벳 a 부터 z 까지 출력을 해보자
//
//		for(char i = 'a'; i <= 'z'; i++ ) {
//			System.out.println(i);
//		}
/////////////////////////////////////////////////////////////////////////////////
		
		
		//일부 문자열만 출력을 해보자
		
//		String a = "Hello World";
//		
//		System.out.println(a.substring(0, 3));
///////////////////////////////////////////////////////////////////////////////////	

		
		//시간을 출력하자
		
//		int time = 5432;
//		int m = time / 60 ;
//		int s = time % 60 ;
//		
//		System.out.println(m + "분" + s + "초");
///////////////////////////////////////////////////////////////////////////////////
		
		
//		int a = 40;
//		int b = 70;
//		
//		System.out.println((a>b) ? a:b);
/////////////////////////////////////////////////////////////////////////////////////		
		
		//거듭 제곱 연산
//		double a = Math.pow(3.0, 40.0);
//		System.out.println("3의 40 제곱은" + (int) a);
/////////////////////////////////////////////////////////////////////////////////////		
		
		
		//점수별 학점을 부여해보자
		
//		int a = 70;
//		int b = 80;
//		
//		if((a + b)/2 > 90) {
//			System.out.println("당신의 학접은 A 입니다.");
//			
//		} else if ( (a + b)/2 >80) {
//			System.out.println("당신의 학접은 B 입니다.");
//		} else if ((a + b)/2 > 70) {
//			System.out.println("당신의 학접은 C 입니다.");
//		}
//		else {
//			System.out.println("당신은 낙제점입니다.");
//		}
				
		//1 부터 1000까지의 합을 구해보자
		
//		int a = 1;
//		int sum = 0;
//	
//		while(a <= 1000) {
//			sum+= a++;
//		}
//		
//		System.out.println(sum);
	
	
		//1부터 5까지 곱합값을 알아보자
	
//		int a = 1;
//		int sum = 1;
//		
//		while( a <= 5) {
//			sum *= a++;
//			System.out.println(sum);
//		}
		
/////////////////////////////////////////////////////////////////////////////////////
		// for을 이용하여 삼각형을 출력해보자

//		int n =10;
//		
//		for(int i= n; i > 1; i--) {
//			for(int j = i; j > 1; j--) {
//				System.out.print("%");
//			}System.out.println();
//		}
		

		//for 을 이용해 사각형을 출력해보자.
//		
//		int n = 10;
//		
//		for(int i = 0; i < n; i++ ) {
//			for(int j = 0; j < n; j++ ) {
//				System.out.print("%");
//				
//			}System.out.println();
//		}
		
		
		//for 을 이용해 원을 출력해보자.
//		// 공식 x^2 + y^2 = z^2
//		
//		int n = 15;
//		
//		for(int i = -n; i <= n; i++) {
//			for(int j = -n; j <= n; j++) {
//				
//				if(i*i + j*j <=n*n) {
//					System.out.print("%");
//					
//				}else {
//					System.out.print("-");
//				}
//				
//			}System.out.println();
//			
//		}
	
		
/////////////////////////////////////////////////////////////////////////////////////		
	
		
		// a, b, c 중 최댓 값을 구해보자
		
//		System.out.println(function(622, 8660, 1999920));

	
/////////////////////////////////////////////////////////////////////////////////////	
	
		
		//40의 5번째 공약수를 고하는 공식
//	
//		System.out.println(funtion(40, 5));
//	
		
		//펙토리얼 구하기
	
//		System.out.println(factorial(4));
	
//		
//		System.out.println(fivo(3));
		
		
		
		// 100 개의 배열안에 랜덤한 1~100까지 의 수를 넣고 여기에 평균을 구해보자
		
//		int [] arr = new int[100];
//		
//		for(int i = 1; i<100; i++) {
//			arr[i] = (int) (Math.random() *100 +1);
//		}
//		
//		int sum = 0;
//				for(int i =1; i <100; i++) {
//					sum += arr[i];
//				}
//		
//				System.out.println(sum/100);
//		
		
		// 입력한 n 개의 배열안에 랜덤한 1~100까지 의 수를 넣고 여기에 평균을 구해보자
		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("숫자를 원하는 만큼 입력하세요");
//		
//		int input =scan.nextInt();
//		int [] arr = new int[input];
//
//		for(int i = 1; i<input; i++) {
//			arr[i] = (int) (Math.random() * 100 + 1);
//		}
//		
//		int sum = 0;
//		
//		for(int i =1; i< input; i++ ) {
//			sum += arr[i];
//		}
//		
//		System.out.println("입력하신 숫자의 총합은  " + sum + "해당숫자의 평균은 " + sum / input + " 입니다.") ;
		
//		
//		Scanner scan = new Scanner(System.in);
//		
//		System.out.println("배열의 크기를 입력하세요");
//		
//		int input = scan.nextInt();
//		int[] arr = new int[input];
//		
//		System.out.println(" 넣고 싶은 숫자를 입력하세요");
//		for(int i = 0; i <input; i++) {
//			arr[i] = scan.nextInt();
//		}
//		
//		int result = -1;
//		
//		for(int i = 0; i <input; i++) {
//			result = max(result, arr[i]);
//			
//		}
//		
//		System.out.println("최대값은" + result);
//		
		

	}

}
