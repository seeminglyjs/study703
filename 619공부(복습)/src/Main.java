import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	
	
	public static int max (int a, int b) {
		return (a>b) ? a:b;
	}
	
	
	// a, b, c �� �ִ� ���� ���غ���


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
	

	// a�� b��° ������� ���غ��� https://www.udemy.com/course/java-programming-tutorial-2017/learn/lecture/8110830?start=90#notes
	
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
	
	
	
//	// ���丮���� ���غ���
//	
//	public static int factorial (int number) {
//		int sum =1;
//		for(int i = 1; i <= number; i++) {
//			sum *= i;
//		} return sum;
//	}
/////////////////////////////////////////////////////////////////////////////////	
	
	//�Ǻ���ġ ���ϱ�
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
		
		
//		//���ĺ� a ���� z ���� ����� �غ���
//
//		for(char i = 'a'; i <= 'z'; i++ ) {
//			System.out.println(i);
//		}
/////////////////////////////////////////////////////////////////////////////////
		
		
		//�Ϻ� ���ڿ��� ����� �غ���
		
//		String a = "Hello World";
//		
//		System.out.println(a.substring(0, 3));
///////////////////////////////////////////////////////////////////////////////////	

		
		//�ð��� �������
		
//		int time = 5432;
//		int m = time / 60 ;
//		int s = time % 60 ;
//		
//		System.out.println(m + "��" + s + "��");
///////////////////////////////////////////////////////////////////////////////////
		
		
//		int a = 40;
//		int b = 70;
//		
//		System.out.println((a>b) ? a:b);
/////////////////////////////////////////////////////////////////////////////////////		
		
		//�ŵ� ���� ����
//		double a = Math.pow(3.0, 40.0);
//		System.out.println("3�� 40 ������" + (int) a);
/////////////////////////////////////////////////////////////////////////////////////		
		
		
		//������ ������ �ο��غ���
		
//		int a = 70;
//		int b = 80;
//		
//		if((a + b)/2 > 90) {
//			System.out.println("����� ������ A �Դϴ�.");
//			
//		} else if ( (a + b)/2 >80) {
//			System.out.println("����� ������ B �Դϴ�.");
//		} else if ((a + b)/2 > 70) {
//			System.out.println("����� ������ C �Դϴ�.");
//		}
//		else {
//			System.out.println("����� �������Դϴ�.");
//		}
				
		//1 ���� 1000������ ���� ���غ���
		
//		int a = 1;
//		int sum = 0;
//	
//		while(a <= 1000) {
//			sum+= a++;
//		}
//		
//		System.out.println(sum);
	
	
		//1���� 5���� ���հ��� �˾ƺ���
	
//		int a = 1;
//		int sum = 1;
//		
//		while( a <= 5) {
//			sum *= a++;
//			System.out.println(sum);
//		}
		
/////////////////////////////////////////////////////////////////////////////////////
		// for�� �̿��Ͽ� �ﰢ���� ����غ���

//		int n =10;
//		
//		for(int i= n; i > 1; i--) {
//			for(int j = i; j > 1; j--) {
//				System.out.print("%");
//			}System.out.println();
//		}
		

		//for �� �̿��� �簢���� ����غ���.
//		
//		int n = 10;
//		
//		for(int i = 0; i < n; i++ ) {
//			for(int j = 0; j < n; j++ ) {
//				System.out.print("%");
//				
//			}System.out.println();
//		}
		
		
		//for �� �̿��� ���� ����غ���.
//		// ���� x^2 + y^2 = z^2
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
	
		
		// a, b, c �� �ִ� ���� ���غ���
		
//		System.out.println(function(622, 8660, 1999920));

	
/////////////////////////////////////////////////////////////////////////////////////	
	
		
		//40�� 5��° ������� ���ϴ� ����
//	
//		System.out.println(funtion(40, 5));
//	
		
		//���丮�� ���ϱ�
	
//		System.out.println(factorial(4));
	
//		
//		System.out.println(fivo(3));
		
		
		
		// 100 ���� �迭�ȿ� ������ 1~100���� �� ���� �ְ� ���⿡ ����� ���غ���
		
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
		
		// �Է��� n ���� �迭�ȿ� ������ 1~100���� �� ���� �ְ� ���⿡ ����� ���غ���
		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("���ڸ� ���ϴ� ��ŭ �Է��ϼ���");
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
//		System.out.println("�Է��Ͻ� ������ ������  " + sum + "�ش������ ����� " + sum / input + " �Դϴ�.") ;
		
//		
//		Scanner scan = new Scanner(System.in);
//		
//		System.out.println("�迭�� ũ�⸦ �Է��ϼ���");
//		
//		int input = scan.nextInt();
//		int[] arr = new int[input];
//		
//		System.out.println(" �ְ� ���� ���ڸ� �Է��ϼ���");
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
//		System.out.println("�ִ밪��" + result);
//		
		

	}

}
