
public class StringApp {

	public static void main(String[] args) {
		
		System.out.println("Hellow World"); //문자가 모여있는 것 문자열이라고 한다. 영어로는 String
		//System.out.println('Hellow World'); 자바에서 작은 따움표는 특수한 데이터 타입을 가르킨다. 케릭터를 나타냄
		//케릭터는 한글자를 나타내는 타입 스티링은 케릭터를 모아둔 데이터 타입
		
		System.out.println('h');
		System.out.println("H");
		
		System.out.println("Hellow "
				+ "World"); //헬로우랑 월드를 더해준 것이지 줄바꿈이 아니다.
		System.out.println("Hello \nWorld"); //n은 뉴라인의 약자이다. 역슬래쉬사용하자!!
		System.out.println("Hellow \"World\""); //""는 문자의 시작과 끝을 알리는 문자다
		// \뒤에 오는 문자는 escape를 시킬 수 있어 콘솔에 출력시킬 수 있다.
		
		System.out.println("안녕하세요 \"저는 장성우입니다.\"");
		

	}

}
