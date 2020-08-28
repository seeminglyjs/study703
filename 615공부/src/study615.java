import java.util.Scanner;




public class study615 {

	//최대 공약수를 구해보자
//	public static int function (int number, int k) {
//		for(int i = 1; i <=number; i++) {
//			if(number % i == 0) {
//				k--;
//				if(k == 0)
//				{
//					return i;
//				}
//			}
//		}
//		return -1;
//	}
	
	
//	
//	public static int function(int number, int k) {
//		for(int i = 1; i <=number; i++ ) {
//			if(number % i == 0) {
//				k--;
//			}
//			if( k==0) {
//				return i;
//			}
//		}
//		return -1;
//	}
//	
	
//	
//	public static char funtion (String a) {
//		return  a.charAt(a.length() -2 ); 
//				}
//	
//	
	
//	////최대값구하기 if 활용
//	public static int function (int a, int b, int c) {
//		if((a>b) && (a>c)) {
//			return a;
//		}
//		else if((b>a) && (b>c)) {
//			return b;
//		}		
//	return c;}
//		
//		
//	///최대값구하기 두가지의 사용자 함수 활용
//		public static int max (int a, int b) {
//			return (a>b) ? a:b;
//		}
//		
//		public static int function1 (int a, int b, int c) {
//			int result1 = max(a,b);
//			return  max(result1,c);
//			}
	
	
	
//	//펙토리얼을 구해보자 반복함수 활용
//	 public static int factiorial(int number) {
//		 int sum = 1;
//		 for(int i =1; i <= number; i++) {
//			 sum *= i;
//			 
//		 }return sum;
//	 }
//	
//	
//	
//	
//	public static int factiorial(int number) {
//		if( number == 1) 
//			return 1;
//	else 
//		return  number * factiorial(number -1);
//	
//	}
	
	//피보나치 함수를 만들어보자  1 1 부터 시작해서 차례로 더해간다.
//	public static int fibo (int number) {
//		int one = 1;
//		int two = 1;
//		int result = -1;
//		
//		if(number == 1) {
//			return one;
//		}
//			else if(number ==2) {
//				return two;
//			}else{
//				for(int i = 2; i < number; i++) {
//					result = one + two;
//					one = two;
//					two = result;
//			
//				}
//			}
//		
//	return result;}
	
//	public static int fibo (int number) {
//		if(number == 1) {
//			return 1;
//			
//		} 
//		
//		else if( number ==2) {
//		return 1;	
//		}
//		
//		else {
//			return fibo(number -1) + fibo(number -2);
//			
//		}
//		
//	}
//	
//	
//	public static int max(int a, int b) {
//		return (a>b) ? a:b;
//	}
//	
//	

	public static void main(String[] args) {
	
//		int result = function( 50, 6);
//		
//		if(result == -1) {
//			System.out.println("50의 여섯번째 공약수는 없습니다.");
//		}
//		else {
//			System.out.println("50의 여섯번째 공약수는" + result);
//		}
		
//		System.out.println(funtion("hello world"));
	
//		int result = function(400330, 200222222 ,14410);
//		int result1 = function1(4003320, 2002222222 ,144120);
//		
//		System.out.println(result);
//		System.out.println(result1);
//			
//		int result = factiorial(10);
//		
//		System.out.println(result);
	
//	int result = fibo(4);
//	
//	System.out.println(result);
//	
//	
//	int result = fibo(5);
//	
//	System.out.println(result);
//	
//		int [] array = new int[100];
//		for(int i = 0; i<100; i++) {
//			array[i] = (int) (Math.random() * 100 + 1);
//		}
//		
//		int sum = 0;
//				for(int i = 0; i< 100; i++) {
//					sum += array[i];
//				}
//	System.out.println(sum/100);

		
		// 100 개의 배열안에 랜덤한 1~100까지 의 수를 넣고 여기에 평균을 구해보자
//	int [] array = new  int [100];
//	
//	for(int i = 1; i <100; i++ ) {
//		array[i] = (int) (Math.random() *100 +1); 
//	}
//	
//	int sum = 0;
//			for(int i = 1; i <100; i++ ) {
//				sum += array[i];
//			}
//	
//			System.out.println(sum/100);
		
		
//		Scanner scanner = new Scanner(System.in);
//		System.out.print(" 생성한 배열의 크기를 입력 를 입력하세오 :");
//		int number = scanner.nextInt();
//		int[]array = new int[number];
//		for (int i = 0; i <number; i++) {
//			System.out.println("배열에 입력할 정수를 하나씩 입력하세요 :" );
//				array[i] = scanner.nextInt();
//				
//		}
//		int result = -1;
//		for(int i = 0; i <number; i++) {
//			result = max(result,array[i]);
//		}
		
//		
//		Scanner scanner = new Scanner(System.in);
//		System.out.print("사용하고자 하는 배열의 크기를 입력하세요.");
//		int number = scanner.nextInt();
//		int [] array = new int[number];
//	
//		
//		
//		for(int i = 0; i < number; i++) {
//			System.out.print("넣고 싶은 정수를 입력하세요.");
//			array[i] = scanner.nextInt();
//		}
//		
//		int result = -1;
//		
//		for(int i = 0; i< number; i++) {
//			result = max(result, array[i]);
//			
//		}System.out.println("가장큰정수는"+result);
	
		
		
		int N = 10;
		int[][] array = new int[N][N];
		
		for( int i =0; i<N; i++) {
			
			for( int j =0; j<N; j++) {
				
				array[i][j] = (int) (Math.random() *10);
			}
		}
	
		for( int i =0; i<N; i++) {
			for( int j = 0; j<N; j++) {
				System.out.print(array[i][j]+" ");
			}System.out.println();
		}
		
		
	}

}
