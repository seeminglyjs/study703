import java.io.BufferedReader;
import java.io.BufferedWriter;
// �Էµ� �����Ͱ� �ٷ� ���޵��� �ʰ� �߰��� ���۸� ������ ��ģ�� ���޵ȴ�.
// Enter�� ���� �ν��ϰ� ���� �����Ͱ� String���� �����Ǿ� ���� ������ 
// �Է¹��� ������ �����ϴ� �۾��� �� �ʿ䰡 ���� ����.
// ������ ���� ���� �����͸� ó���ؾ� �Ѵٸ� Scanner ���� ȿ���� ����.
// �̴� Buffer�� �޸������ν��� �۾��ӵ����� ���̰� ���� ���� �����̴�.
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
//		BufferedWriter �� ��� ���۸� ��� ���ұ� ������ �ݵ�� 
//		flush() / close() �� �ݵ�� ȣ���� �־� ��ó���� ���־���մϴ�. 
//		�׸��� bw.write���� System.out.println();�� ���� �ڵ��������� ���⶧���� 
//		������ ���־���� ��쿡�� \n�� ���� ���� ó�����־���մϴ�.


//		[10818��] N���� ������ �־�����. �̶�, �ּڰ��� �ִ��� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
//		ù° �ٿ� ������ ���� N (1 �� N �� 1,000,000)�� �־�����. 
//		��° �ٿ��� N���� ������ �������� �����ؼ� �־�����. 
//		��� ������ -1,000,000���� ũ�ų� ����, 1,000,000���� �۰ų� ���� �����̴�.
//		
//		ù° �ٿ� �־��� ���� N���� �ּڰ��� �ִ��� �������� ������ ����Ѵ�.
//		
//	
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//				
//		System.out.println("N ���� �Է����ּ���.");
//		int N = Integer.parseInt(br.readLine());
//		// int n = Integer.parseInt(br.readLine());
//		System.out.println("���ϰ��� �ϴ� ���ڸ� ������ ���� �Է��� �ּ���.");
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
//		System.out.println("���ϰ��� �ϴ� ������ ������ �Է����ּ���.");
//		Integer.parseInt(br.readLine());
//		
//		System.out.println("���ϰ��� �ϴ� ���ڸ� ������ ���� �Է��� �ּ���.");
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
//		}System.out.println("�ִ밪" + max + "�ּڰ�" +  min);
//		
	
//		[10996��] ������ ���� ��Ģ�� ������ �ڿ� ���� ��� ������.	
//		ù° �ٿ� N(1 �� N �� 100)�� �־�����.
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
