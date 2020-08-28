
public class main630 {

	public static void main(String[] args) {
//		indexOf() 는 특정 문자나 문자열이 앞에서부터 처음 발견되는 인덱스를 반환하며
//		만약 찾지 못했을 경우 "-1"을 반환합니다.
//
//		 
//		사용법은 매우 간단하다

		        String indexOfTestOne = "Hello world";

		        String indexOfTestTwo = "         Hello world         ";     

		 

		        System.out.println( indexOfTestOne.indexOf("o") );  // 4

		        System.out.println( indexOfTestOne.indexOf("x") );  // -1

		        System.out.println( indexOfTestOne.indexOf("o",5) );  // 7

		        System.out.println( indexOfTestTwo.indexOf("o") );  // 13

		        System.out.println( indexOfTestTwo.indexOf("el") );  // 10



	}

}
