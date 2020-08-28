import java.util.Scanner;

public class main {

	public static void main(String[] args) {
	
//		main main = new main();
//		main.sound();
//		main.call();
//		
//		
//	}
//
//	@Override
//	public void sound() {
//		System.out.println("쩐다바리바리");
//		
//	}
//
//	@Override
//	public void call() {
//		System.out.println("왜불러 바리바리");
		
//	
//	Scanner scan = new Scanner(System.in);
//	System.out.println("사과면 1 / 바나나면 2");
//	int input = scan.nextInt();
//	
//	Fruit fruit;
//	
//	
//	if(input == 1) {
//		 fruit = new apple();
//		 fruit.show();
//		
//	}else if(input == 2) {
//		fruit = new banana();
//		fruit.show();
//	}
//	
	
		
//		Hero[] hero = new Hero[2];
//		hero[0] = new worrior("전사");
//		hero[1] = new archer("궁수");
//	
//		
//		for(int i = 0; i < hero.length; i++) {
//			hero[i].attack();
//			
//			if(hero[i] instanceof worrior ) {
//				worrior temp = (worrior) hero[i];
//				temp.powerboom();
//			}
//			else if(hero[i] instanceof archer ) {
//				archer temp1= (archer) hero[i];
//				temp1.fireball();
//		}
//	
//	
//	}

		// 피보나치 공식 a = an-1 + an-2
//		
//		int [] a = new int [100];
//		
//		a[0] = 1;
//		a[1] = 1;
//		
//		for(int i = 2; i <20; i++) {
//			
//			a[i] =a[i-1] + a[i-2];
//			
//		}
//		
//		for(int i = 3; i <20; i++) {
//			System.out.println(a[i]);
//		}
//		
		// 2번 피보나치 공식 a = an-1 + an-2
		
//		int a1 = 1;
//		int a2 = 1;
//		
//		
//		for(int i = 3; i<20; i++) {
//			int result = a1+a2;
//			System.out.println(result+" ");
//			a1 = a2;
//			a2 = result;
			
		
		//2의 최빈수를 구해보자
//		int[] a = new int[12];
//		
//		a[0] = 1;
//		a[1] = 2;
//		a[2] = 2;
//		a[3] = 3;
//		a[4] = 1;
//		a[5] = 4;
//		a[6] = 2;
//		a[7] = 2;
//		a[8] = 4;
//		a[9] = 3;
//		a[10] = 5;
//		a[11] = 3;
//		a[12] = 2;
//		
//		for(int i = 0; i<=13; i++ ) {
//			
//		}
//		
//		
//		Scanner scan = new Scanner(System.in);
//		
//		int [] input = new int[10];
//		
//		for(int i = 0; i<10; i++) {
//			input[i] = scan.nextInt();
//		}
//		
//		int [] mode = new int [10];
//		//index → 출현한수
//		//index값 → index(출현한수)가 몇번 나왓는지 저장하는 용도
//		// mode[3] = 5 //3번 숫자가 5번 출현 했다.
//			
//		for (int i = 0; i < 10; i++) {
//			mode[input[i]]++;
//		}
//	
//		
//		
//		int modeno = 0;
//		int modecou = 0;
//		
//		for (int i = 0; i < 10; i++) {
//			if(modecou < mode[i]) {
//				modecou =mode[i];
//				modeno = i;
//			} 
//		}System.out.println("나온횟수" + modecou+"최빈수는" + modeno);
	
	
		// 대문자를 소문자로 소문자를 대문자로
		// 링크 https://www.youtube.com/watch?v=DTEiENYVR14&list=PLVoihNyHW4xkm_KJ8_N8X7F6EQP4uSRyR&index=6
//		String input = "HellowWorlD";
//		char []arr;
//		arr =input.toCharArray();
//		System.out.print(arr);
//		System.out.println();
//		
//		
//		
//		for(int i = 0; i<arr.length; i++) {
//			if(arr[i] >='a' && arr[i] <='z') {
//				arr[i] = (char) (arr[i] + ('A'-'a'));
//			}
//			
//			else if (arr[i] >='A' && arr[i] <='Z') {
//				arr[i] = (char) (arr[i] - ('A'-'a'));
//			}	
//				
//			
//	} System.out.println(arr);
//		
	
		
		
		
//		int a1 = 1;
//		int a2 = 1;
//		
//		for(int i = 3; i <20; i++) {
//			int result =a1 + a2;
//			a1=a2;
//			a2= result;
//			
//			System.out.println(result);
//		}
//		
//		
//		int[] a = new int[100];
//		
//		a[0]= 1;
//		a[1]= 1;
//		
//		for(int i = 2; i <20; i++) {
//			a[i]= a[i-1] + a[i-2];
//			
//		}
//		for(int i = 3; i <20; i++) {
//			System.out.println(a[i]);
//	
//	}	
//				
		
	
		String input = "Hello World";
		char arr[];
		arr = input.toCharArray();
		System.out.println(arr);
		System.out.println();
		
		 for(int i = 0; i < arr.length; i++) {
			 if(arr[i] >='a'  && arr[i] <='z') {
				 arr[i] = (char)(arr[i] + ('A'-'a'));
			 }
			 
			 else if(arr[i] >='A'  && arr[i] <='Z') {
				 arr[i] = (char)(arr[i] - ('A'-'a'));
		 } 
			 
				
		
		
		
	}System.out.println(arr);
}
}