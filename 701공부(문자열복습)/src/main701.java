import java.util.Scanner;

public class main701 {

	
	static Scanner scan = new Scanner(System.in);
	
	
	public static void main(String[] args) {
		
		
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
	
//		[1316번]				

		
		
		
	}

}
