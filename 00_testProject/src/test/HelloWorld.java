package test;

public class HelloWorld {
	
	public static void main(String[] args) {
	// 이클립스에서 실행 : 재생창 버튼 누르거나 컨트롤 + F11
	// 자바 주석 맛 보기
	// 확대는 컨트롤 + [+] / 축소는 컨트롤 + [-] 백스페이스 옆에 있는 +, - 키를 입력하면 된다.
		System.out.println("@@@@@@@@@");
		System.out.println("@@@@뒷줄@@@");
		System.out.println("확대는 ctrl + [+] / 축소는 ctrl + [-]");
		System.out.println(3 + 5);
		
		String name; 
		name = "윤석준";
		
		char gender = '남';
		
		String str1 = "기차" + 123 + 45 + "출발";
		String str2 = 123 + 45 + "기차" + "출발";
		System.out.println(str1);
		System.out.println(str2);
		
		char ch = 'A';
		int chNum = (int)ch; // 강제 형변환 적용 (1)
		// -----------------------------------------------------
		float f = 1.09f;
		int num = (int)f; // 강제 형변환 적용 (2)
	}

}




