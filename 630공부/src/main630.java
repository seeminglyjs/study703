
public class main630 {

	public static void main(String[] args) {
//		indexOf() �� Ư�� ���ڳ� ���ڿ��� �տ������� ó�� �߰ߵǴ� �ε����� ��ȯ�ϸ�
//		���� ã�� ������ ��� "-1"�� ��ȯ�մϴ�.
//
//		 
//		������ �ſ� �����ϴ�

		        String indexOfTestOne = "Hello world";

		        String indexOfTestTwo = "         Hello world         ";     

		 

		        System.out.println( indexOfTestOne.indexOf("o") );  // 4

		        System.out.println( indexOfTestOne.indexOf("x") );  // -1

		        System.out.println( indexOfTestOne.indexOf("o",5) );  // 7

		        System.out.println( indexOfTestTwo.indexOf("o") );  // 13

		        System.out.println( indexOfTestTwo.indexOf("el") );  // 10



	}

}
