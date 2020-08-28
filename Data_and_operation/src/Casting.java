
public class Casting {

	public static void main(String[] args) {
		
		double a= 1.1;
		double b =1;
		double b2 = (double)1;
		// 손실이 없기 때문에 자동으로 casting을 해주었다.
		System.out.println(b);
		
		//int c = 1.1;
		double d = 1.1;
		int e = (int) 1.1;
		// 0.1이 손실이 일어난다.
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
