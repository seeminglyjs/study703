import java.util.Scanner;




public class study615 {

	//�ִ� ������� ���غ���
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
	
//	////�ִ밪���ϱ� if Ȱ��
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
//	///�ִ밪���ϱ� �ΰ����� ����� �Լ� Ȱ��
//		public static int max (int a, int b) {
//			return (a>b) ? a:b;
//		}
//		
//		public static int function1 (int a, int b, int c) {
//			int result1 = max(a,b);
//			return  max(result1,c);
//			}
	
	
	
//	//���丮���� ���غ��� �ݺ��Լ� Ȱ��
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
	
	//�Ǻ���ġ �Լ��� ������  1 1 ���� �����ؼ� ���ʷ� ���ذ���.
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
//			System.out.println("50�� ������° ������� �����ϴ�.");
//		}
//		else {
//			System.out.println("50�� ������° �������" + result);
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

		
		// 100 ���� �迭�ȿ� ������ 1~100���� �� ���� �ְ� ���⿡ ����� ���غ���
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
//		System.out.print(" ������ �迭�� ũ�⸦ �Է� �� �Է��ϼ��� :");
//		int number = scanner.nextInt();
//		int[]array = new int[number];
//		for (int i = 0; i <number; i++) {
//			System.out.println("�迭�� �Է��� ������ �ϳ��� �Է��ϼ��� :" );
//				array[i] = scanner.nextInt();
//				
//		}
//		int result = -1;
//		for(int i = 0; i <number; i++) {
//			result = max(result,array[i]);
//		}
		
//		
//		Scanner scanner = new Scanner(System.in);
//		System.out.print("����ϰ��� �ϴ� �迭�� ũ�⸦ �Է��ϼ���.");
//		int number = scanner.nextInt();
//		int [] array = new int[number];
//	
//		
//		
//		for(int i = 0; i < number; i++) {
//			System.out.print("�ְ� ���� ������ �Է��ϼ���.");
//			array[i] = scanner.nextInt();
//		}
//		
//		int result = -1;
//		
//		for(int i = 0; i< number; i++) {
//			result = max(result, array[i]);
//			
//		}System.out.println("����ū������"+result);
	
		
		
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
