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

		
		
		
		
///////////701(���ڿ���������)/////////////////////////////////		
//		[11654]
//		
//		System.out.println("���ڸ� �Է����ּ���.");	
//		char text = scan.nextLine().charAt(0);
//		int no = (int) text;
//		System.out.println(no);
		
		
//		[11720��]		
//		
//		System.out.println("���ڸ� �Է����ּ���.");
//		String number = scan.nextLine();
//		int sum = 0;
//		
//		
//		
//		System.out.println();
//		for(int i = 0; i < number.length(); i++) {
//			sum += Integer.parseInt(number.substring(i, i+1));
//			System.out.println(sum); //Ȯ�ο����� ������..
//		}
//		
//		System.out.println(sum);
		
		
//		[10809��]	
//		System.out.println("���ڸ� �Է����ּ���.");
//		String text = scan.nextLine();
//		
//		for(char c = 'a'; c <= 'z'; c++) {
//			System.out.print(text.indexOf(c)+ " ");
//			//�Է��� ���ڰ� ��� ��ġ�� indexof�� ���ڳ� ��� ��ġ�ϴ��� �˷��ش�.
//		}
		

//		[2675��]	
//		
//		System.out.println("�׽�Ʈ ���̽��� �Է����ּ���.");
//		int T = scan.nextInt();
//		System.out.println("�ݺ�Ƚ���� �Է����ּ���.");
//		String result = "";
//		
//		System.out.println("���ڸ� �Է����ּ���.");
//		for(int i = 0; i < T; i++) {
//			int R = scan.nextInt();
//			String text = scan.next();
//			for(int j = 0; j < text.length(); j++) {
//				for(int k = 0; k < R; k++) {
//					result += text.charAt(j);
//				}
//			}
//		} System.out.println(result);
	
	
//		[1157��] 
//		
//		
//		System.out.println("���ڸ� �Է����ּ���.");
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
		
//		[1152��]		
//		
//		System.out.println("������ �Է����ּ���.");
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
		
//		[2908��]				
		
//		System.out.println("���� �ΰ��� �Է����ּ���.");
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

//		[5622��]		
	
//		final int num [] = {3,3,3,4,4,4,5,5,5,6,6,6,7,7,7,8,8,8,8,9,9,9,10,10,10};
//		
//		
//		System.out.println("���ڸ� �Է����ּ���.");
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

		
//		[2941��]	
	
//		final String cro [] = {"c=","c-","dz=","d-","lj","nj","s=","z="};
//		System.out.println("���ڸ� �Է����ּ���.");
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

		
		
		
		
		
		
		
		
		
///////////702(boolean �迭��������)/////////////////////////////////				
		
//		boolean isPowerOn = true; //Boolean Ÿ���� ������ true�� false��, false�� true�� �ٲٴ� �ڵ�
//		isPowerOn = !isPowerOn; // if�� �� �ʿ� ����.
//		
//		//Boolean ���·� �迭�� �����ϰ� �ʱ�ȭ�ϴ� ����
//		boolean [] bitList;
//		bitList = new boolean[10]; //�⺻������ �ʱ�ȭ

		
//		Arrays.fill(bitList, false); //Ư�� ������ �ʱ�ȭ
//		for(int i = 0 ; i <bitList.length; i++) {
//			System.out.println(bitList[i]);
//		}
	
//		�ο� ������ ���� ����ó�� ���ǹ��� �Ǵ� �������� ���� ���ȴ�.
//		int base = 180;
//		int height = 185;
//		boolean isTall = height > base;
//
//		if (isTall) {
//		    System.out.println("Ű�� Ů�ϴ�.");
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


		
		
		
		
		
		
		
///////////703(��������)/////////////////////////////////	
		
//		[15596��]			
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
////		[4673��]
//	
//	public static int selfno(int n) {
//		int number = n;
//		while(n > 0) {
//			number += n % 10;
//			n /= 10;
//		}
//		return number;
//		[15596��]		
//	public static int test(int[] a){
//		int sum = 0;
//		for(int i =0; i < a.length; i++) {
//			sum += a[i];
//		}
//		return sum;
//		
//	}
		
		
		
		
		
		
		
		
///////////706(if �߰�ȣ ��������)/////////////////////////////////			
		
		
//		�ڹ��� ��쿡�� ���� �����ϰ� �߰�ȣ{} �� �����ؼ� �� �� �ִ�.
//
//		if(1==2)
//		  System.out.println("false");
//		else
//		  System.out.println("true");
//
//		�� ���� �߰�ȣ{} �� �����ؼ� �� �� �ִ�.
//		��, �ٿ��� ���������, �Ѱ������� �ٿ��� �����ϴ�.
//		�Ʒ��� ���� �κ������� �߰�ȣ ��� ����.
//
//		if(1==2){
//		  System.out.println("false");
//		}
//		else
//		  System.out.println("true");
//
//		�׸���, �߰�ȣ{} �κ��� ������ �ᵵ �������.
//		if(1==2)
//		  {
//		  System.out.println("false");
//		  }
//
//		�߰�ȣ�� �����ؼ� ���� ����� �� ������ �ѵ�,
//		���ǹ��� ������ٺ���, �� ó���κ��� ���� ������ �Һи������� �������� �����.
//		����, �����ϸ� �߰�ȣ�� �ٿ��� ������ Ȯ���� ���� �����ִ� ���� ������ �ϴ�.
//		�� ������, ������ ���� ��������� �߰�ȣ�� ���̴� ������ ���̴� ���� ����.
//
//		if ���� ���, else if ������ ����Ҷ��� �߰�ȣ ������ �����ѵ�,
//		����������, else if ���� ����ϸ�, �������� �ݵ�� else ������ �پ�� �Ѵٴ� ���̴�.
//
//		if(1==2){
//		  System.out.println("1");
//		}else if(1==3){
//		  System.out.println("2");
//		}else{
//		  System.out.println("3");
//		}
//
//		���� �κп��� else �κ��� �����ؼ��� �ȵȴ�.(�����߻�)
//
//		�� ������ �߰�ȣ�� �����ؼ� �Ʒ��� ���� �� �� �ִ�.
//
//		if(1==2)
//		  System.out.println("1");
//		else if(1==3)
//		  System.out.ptintln("2");
//		else
//		  System.out.println("3");
//
//		����, �κ������� �߰�ȣ{} �� �����ؼ� ���� ���� ����.
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
//		���Ͱ��� �κ������� �߰�ȣ{} �� �����ؼ� ��� �����ϴ�.
//
//		�׷���, ������ ���� �κ������δ� �߰�ȣ{} �� ����ϰ� �ִµ�,
//		��ø�� if ���̱� ������ �� ��踦 �и��� �ϱ� ���ؼ� ����� ������ ��������.
//		�ٺ������δ� ȥ���� ��������, �Ʒ��� ���� �߰�ȣ�� �������� �ʰ� ����ϴ� ���� ��Ȯ�ϴ�.
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
//		�̷��� �ϸ�, �� ������ ���̱� ������, �� ��谡 �и��ؼ� ������(��������)�� �� ��������.

		
		
		
		
///////////707(ArrayList)/////////////////////////////////			

//		ArrayList�� List �������̽��� ��ӹ��� Ŭ������ ũ�Ⱑ ���������� ���ϴ� ��������Ʈ�Դϴ�. 
//		�Ϲ����� �迭�� ���� ��������Ʈ�̸� �ε����� ������ ��ü�� �����Ѵٴ������� ���������� 
//		�ѹ� �����Ǹ� ũ�Ⱑ ������ �ʴ� �迭���� �޸� 
//		ArrayList�� ��ü���� �߰��Ǿ� ���� �뷮(capacity)�� �ʰ��Ѵٸ� 
//		�ڵ����� ������ ũ�⸸ŭ ���� �뷮(capacity)�� �þ�ٴ� Ư¡�� ������ �ֽ��ϴ�.
		
		
//		ArrayList list = new ArrayList();//Ÿ�� �̼��� Object�� ����ȴ�.
//		ArrayList<Student> members = new ArrayList<Student>();//Ÿ�Լ��� Student��ü�� ��밡��
//		ArrayList<Integer> num = new ArrayList<Integer>();//Ÿ�Լ��� intŸ�Ը� ��밡��
//		ArrayList<Integer> num2 = new ArrayList<>();//new���� Ÿ�� �Ķ���� ��������
//		ArrayList<Integer> num3 = new ArrayList<Integer>(10);//�ʱ� �뷮(capacity)����
//		ArrayList<Integer> list2 = new ArrayList<Integer>(Arrays.asList(1,2,3));//������ ���߰�
		
//		ArrayList����� ArrayList list = new ArrayList()�� ���� �� 
//		���ο� ������ ���� �ְ� ����Ҽ��� ������ �̷��� ����Ұ�� ���� �̾Ƴ��� ���ؼ��� 
//		ĳ����(Casting) ������ �ʿ��ϰ� �߸��� Ÿ������ ĳ������ �� ��쿡�� ������ �߻��ϱ⿡ 
//		���� ���� ����� ��õ���� �ʽ��ϴ�. ArrayList�� ����ҽÿ��� ArrayList�� Ÿ���� ������ִ°��� �����ϴ�. 
//		JDK 5.0���ĺ��� �ڷ����� �������� ���� ���ʸ���(Generics)��� ������ ���ԵǾ����ϴ�. 
//		ArrayLIst<String> list = new ArrayList<String>(); 
//		�̶�� �Ǿ��ִٸ� String��ü�鸸 add�Ǿ������ְ� �ٸ� Ÿ���� ��ü�� ����� �Ұ����մϴ�.
		

//		ArrayList �� �߰�
//		ArrayList<Integer> list = new ArrayList<Integer>();
//		list.add(3); //�� �߰�
//		list.add(null); //null���� add����
//		list.add(1,10); //index 1�ڿ� 10 ����
//		ArrayList<Student> list = new ArrayList<Student>();
//		Student student = new Student(name,age);
//		members.add(student);
//		members.add(new Member("ȫ�浿",15));
		
//		ArrayList�� ���� �߰��Ϸ��� ArrayList�� add(index, value) �޼ҵ带 ����ϸ� �˴ϴ�. 
//		index�� �����ϸ� ArrayList �� �ڿ� �����Ͱ� �߰��Ǹ� index�߰��� ���� �߰��ϸ� 
//		�ش� �ε������� ������ �ε������� ��� 1�� �ڷ� �з����ϴ�. 

		
//		ArrayList �� ����
//		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(1,2,3));
//		list.remove(1);  //index 1 ����
//		list.clear();  //��� �� ����
//		ArrayList�� ���� �����Ϸ��� ArrayList�� remove(index) �޼ҵ带 ����ϸ� �˴ϴ�. 
//		remove()�Լ��� ����Ͽ� Ư�� �ε����� ��ü�� �����ϸ� �ٷ� �� �ε������� ������ �ε������� ��� ������ 1�� ������ϴ�. 
//		��� ���� �����Ϸ��� clear() �޼ҵ带 ����ϸ� �˴ϴ�.
		
		
		
//		ArrayList ũ�� ���ϱ�
//		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(1,2,3));
//		System.out.println(list.size()); //list ũ�� : 3
//		ArrayList�� ũ�⸦ ���Ϸ��� ArrayList�� size() �޼ҵ带 ����ϸ� �˴ϴ�.
	
	
	
	
	
//		ArrayList �� ���
//		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(1,2,3));
//
//		System.out.println(list.get(0));//0��° index ���
//				
//		for(Integer i : list) { //for���� ���� ��ü���
//		    System.out.println(i);
//		}
//
//		Iterator iter = list.iterator(); //Iterator ���� 
//		while(iter.hasNext()){//�������� �ִ��� üũ
//		    System.out.println(iter.next()); //�� ���
//		}
//		ArrayList�� get(index) �޼ҵ带 ����ϸ� ArrayList�� ���ϴ� index�� ���� ���ϵ˴ϴ�. 
//		��ü����� ��κ� for���� ���ؼ� ������ϰ� Iterator�� ����ؼ� ����� �Ҽ��� �ֽ��ϴ�.
//
//		 
//
//		ArrayList �� �˻�
//		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(1,2,3));
//		System.out.println(list.contains(1)); //list�� 1�� �ִ��� �˻� : true
//		System.out.println(list.indexOf(1)); //1�� �ִ� index��ȯ ������ -1
//		ArrayList���� ã���� �ϴ� ���� �˻��Ϸ��� ArrayList�� contains(value) �޼ҵ带 ����ϸ� �˴ϴ�. 
//		���� ���� �ִٸ� true�� ���ϵǰ� ���� ���ٸ� false�� ���ϵ˴ϴ�. 
//		���� �ִ� index�� ã������ indexOf(value) �޼ҵ带 ����ϸ� �ǰ� ���� ���� ���ٸ� -1�� �����մϴ�.


		
		
		
		
///////////708(���ڿ� ���̱� Concat Append)/////////////////////////////////		
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
		
	

		
		
		
///////////710(���ڿ� indexOf, lastIndexOf)/////////////////////////////////			
	
//		String str = "i am sopgk";
//		
//		for(char c = 'a'; c <= 'z'; c++) {
//			for(char c1 = 'a'; c <= 'z'; c++) {	
//			System.out.print(str.indexOf(c1)+ " ");
//			}
//			System.out.println();
//			System.out.print(str.lastIndexOf(c)+ " ");
//		}
	

		
		
		
		
		
		
		
		
		
		
/////////711(����)/////////////////////////////////	
		
		
//		����[1978]
		
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
	
//		����[2581��]		
		
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

		
		
//		����[4948��]		
		
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		System.out.println("N�� �Է��� �ּ���.");
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
		
		
/////////712(����)/////////////////////////////////			

	
//	 ����[9020��] 		
//		 Scanner input = new Scanner(System.in);
//	      int i = 0;
//	      int a = 0,b = 0; //�Ҽ��� �� 
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
//	      //1. �Է��� �޴´�
//	      
//	      //2 . �Է¹��� ���� �Ҽ��� ������ ǥ���Ѵ�.
//
//	}
//	
//	 public static boolean check(int n)
//	   {
//	      //�ڱ� �ڽŰ� 1 ����� ������ ������ �ȵ�.
//	      
//	      
//	      for(int i = 2; i <= n/2; i++)
//	      {
//	         if(n%i == 0)
//	            return false;
//	      }
//	      return true;
//	   }
		
//		[1085��]				
		
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
	
	///////712(����)/////////////////////////////////			

		
//		���� 1018 ����� ������
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
		
		
	/////718(������� ��������Ʈ)/////////////////////////////////				
//		ArrayList�� ����Ͽ� ������ ����� ��������Ʈ �ҽ��ڵ�

//	}
//	//�׷���(����Ʈ) Ŭ����
//	class ListGraph{
//		private ArrayList<ArrayList<Integer>>listGraph;
//	}
//	
//	//�׷��� �ʱ�ȭ
//	public ListGraph(int intSize) {
//		this.listGraph = new ArrayList<ArraList<Integer>>();
//		 // �׷��� �ʱ�ȭ
//        // put(int x, int y) ���� �ԷµǴ� ������ ���� 0 �̻��� �����̳�
//        // ArrayList�� index�� 0 ���� �����̹Ƿ� 
//        // ArrayIndexOutOfBoundsException ������ ���� 
//        // ������ ��� ��������Ʈ�� size�� 1�� ���Ͽ� �ʱ�ȭ����
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
//    // �׷��� return
//    public ArrayList<ArrayList<Integer>> getGraph() {
//        return this.listGraph;
//    }
// 
//    // �׷����� Ư�� ��� return
//    public ArrayList<Integer> getNode(int i) {
//        return this.listGraph.get(i);
//    }
// 
//    // �׷��� �߰� (�����)
//    public void put(int x, int y) {
//        listGraph.get(x).add(y);
//        listGraph.get(y).add(x);
//    }
// 
//    // �׷��� �߰� (�ܹ���)
//    public void putSingle(int x, int y) {
//        listGraph.get(x).add(y);
//    }
//    
//    // �׷��� ��� (��������Ʈ)
//    public void printGraphToAdjList() {
//        for(int i=1; i<listGraph.size(); i++) {
//            System.out.print("���� " + i + "�� ��������Ʈ");
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
