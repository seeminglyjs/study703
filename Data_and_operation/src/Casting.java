
public class Casting {

	public static void main(String[] args) {
		
		double a= 1.1;
		double b =1;
		double b2 = (double)1;
		// �ս��� ���� ������ �ڵ����� casting�� ���־���.
		System.out.println(b);
		
		//int c = 1.1;
		double d = 1.1;
		int e = (int) 1.1;
		// 0.1�� �ս��� �Ͼ��.
		System.out.println(e);
		
		// 123 to String
		
		String f = "123";

		int to = Integer.parseInt(f);
	
		System.out.println(f.getClass());
		
		
		int g = 1234;

		String to1 = Integer.toString(g);

		System.out.println(g);

		
	}	

}
