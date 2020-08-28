import java.io.BufferedReader;
import java.io.BufferedWriter;
// 입력된 데이터가 바로 전달되지 않고 중간에 버퍼링 과정을 거친후 전달된다.
// Enter만 경계로 인식하고 받은 데이터가 String으로 고정되어 지기 때문에 
// 입력받은 정보를 가공하는 작업을 할 필요가 많아 진다.
// 하지만 많은 양의 데이터를 처리해야 한다면 Scanner 보다 효율이 좋다.
// 이는 Buffer의 메모리줌으로써의 작업속도에서 차이가 많이 나기 때문이다.
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class main626 {

	public static void main(String[] args) throws IOException {
//		
//		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//		
//		String s = "avddse";
//		bw.write(s+"\n");
//		bw.write(s);
//		bw.flush();
//		bw.close();
//		BufferedWriter 의 경우 버퍼를 잡아 놓았기 때문에 반드시 
//		flush() / close() 를 반드시 호출해 주어 뒤처리를 해주어야합니다. 
//		그리고 bw.write에는 System.out.println();과 같이 자동개행기능이 없기때문에 
//		개행을 해주어야할 경우에는 \n를 통해 따로 처리해주어야합니다.


//		[10818번] N개의 정수가 주어진다. 이때, 최솟값과 최댓값을 구하는 프로그램을 작성하시오.
//		첫째 줄에 정수의 개수 N (1 ≤ N ≤ 1,000,000)이 주어진다. 
//		둘째 줄에는 N개의 정수를 공백으로 구분해서 주어진다. 
//		모든 정수는 -1,000,000보다 크거나 같고, 1,000,000보다 작거나 같은 정수이다.
//		
//		첫째 줄에 주어진 정수 N개의 최솟값과 최댓값을 공백으로 구분해 출력한다.
//		
//	
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//				
//		System.out.println("N 값을 입력해주세요.");
//		int N = Integer.parseInt(br.readLine());
//		// int n = Integer.parseInt(br.readLine());
//		System.out.println("비교하고자 하는 숫자를 여백을 통해 입력해 주세요.");
//		StringTokenizer st = new StringTokenizer(br.readLine()," ");
//	
//		int index = 0;
//		int[] arr = new int[N];
//		while(st.hasMoreTokens()) {
//			arr[index] = Integer.parseInt(st.nextToken());
//			index++;
//		}
//		
//		Arrays.sort(arr);
//		System.out.print(arr[0] + " " + arr[N - 1]);
		
//	
//		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
//		
//		System.out.println("비교하고자 하는 숫자의 개수를 입력해주세요.");
//		Integer.parseInt(br.readLine());
//		
//		System.out.println("비교하고자 하는 숫자를 여백을 통해 입력해 주세요.");
//		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
//		
//		int max = - 100000;
//		int min = 100000;
//		
//		while(st.hasMoreTokens()) {
//			int val = Integer.parseInt(st.nextToken());
//			
//			if(val > max) {
//				max = val;
//			}if(val < min) {
//				min = val;
//			}
//			
//		}System.out.println("최대값" + max + "최솟값" +  min);
//		
	
//		[10996번] 예제를 보고 규칙을 유추한 뒤에 별을 찍어 보세요.	
//		첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.
//		ex)3
//		
//		* *
//		 *
//		* *
//		 *
//		* *
//		 *	
		
//		Scanner scan = new Scanner(System.in);
//		int N = scan.nextInt();
//		
//		for(int i = 1; i <= 2 * N; i++) {
//			
//			if(i % 2 == 1) {
//				for(int j = 1; j <= N; j++) {
//					if(j % 2 == 1) {
//						System.out.print("*");
//					}else {
//						System.out.print(" ");
//					}
//				}
//				
//				
//			}else {
//				for(int j = 1; j <= N; j++) {
//					if(j % 2 == 1) {
//						System.out.print(" ");
//					}else {
//						System.out.print("*");
//					}
//				
//			}
//		}
//	
//	System.out.println();}

}
}
