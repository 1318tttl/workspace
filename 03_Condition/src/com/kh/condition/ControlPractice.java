package com.kh.condition;

import java.util.Scanner;

public class ControlPractice {

	private static Object ID;

	public static void main(String[] args) {
		// practice1();
		// practice2();
		// practice3();
		practice4();
		// practice5();
	}

	public static void practice4() {
		/*
		 * 수업 자료(5page)에서 if문으로 되어있는 봄, 여름, 가을, 겨울 예제를 switch문으로 바꿔서 출력하세요. ex 1. 1~12
		 * 사이의 정수 입력 : 8 8월은 여름입니다.
		 * 
		 * ex 2. 1~12 사이의 정수 입력 : 99 99월은 잘못 입력된 달입니다.
		 */

		Scanner sc = new Scanner(System.in);

		// 사용자 입력
		System.out.print("1~12 사이의 정수 입력: ");
		int month = sc.nextInt();

		// 계절 변수
		String season = "";

		// switch문을 사용한 계절 판단
		switch (month) {
		case 12:
		case 1:
		case 2:
			System.out.println(season = "겨울");
			break;
		case 3:
		case 4:
		case 5:
			System.out.println(season = "봄");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println(season = "여름");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println(season = "가을");
			break;
		default:
			System.out.println(month + "월은 잘못 입력된 달입니다.");
			System.out.println(month + "월은 " + season + "입니다.");
		}
	}


	public static void practice5() {
		/*
		 * 아이디, 비밀번호를 정해두고 로그인 기능을 작성하세요. 로그인 성공 시 “로그인 성공”, 아이디가 틀렸을 시 “아이디가 틀렸습니다.“,
		 * 비밀번호가 틀렸을 시 “비밀번호가 틀렸습니다.”를 출력하세요. ex 1. ex 2. ex 3. 아이디 : myId아이디 : myId아이디
		 * : my 비밀번호 : myPassword12 비밀번호 : myPassword 비밀번호 : myPassword12 로그인 성공비밀번호가
		 * 틀렸습니다. 아이디가 틀렸습니다.
		 */
		// 상수 : 아이디, 비밀번호
		final String id = "myId";
		final String PASSWD = "myPassword12";

		Scanner sc = new Scanner(System.in);

		System.out.print("아이디 : ");
		String userId = sc.next();

		System.out.print("비밀번호 : ");
		String userPwd = sc.next();

		// 문자열 값을 비교하는 메소드: 문자열.equals(변수_또는_문자열값) => true/false
		if (userId.equals("myId") && userPwd.equals(PASSWD)) {
			System.out.println("로그인 성공");
		} else {

			// if (userId != ID) {
			if (!userId.equals(id)) {
				System.out.println("아이디가 틀렸습니다");
				// } else if (userPwd != PASSWD) {
			} else if (!userPwd.equals(PASSWD)) {
				System.out.println("비밀번호가 틀렸습니다.");
			} else {
				System.out.println("가입된 정보가 없습니다");

			}
		}
	}

	public static void practice3() {
		Scanner sc = new Scanner(System.in);
		/*
		 * 국어, 영어, 수학 세 과목의 점수를 키보드로 입력 받고 합계와 평균을 계산하고 합계와 평균을 이용하여 합격 / 불합격 처리하는 기능을
		 * 구현하세요.
		 * 
		 * (합격 조건 : 세 과목의 점수가 각각 40점 이상이면서 평균이 60점 이상일 경우)
		 * 
		 * 합격 했을 경우 과목 별 점수와 합계, 평균, “축하합니다, 합격입니다!”를 출력하고 불합격인 경우에는 “불합격입니다.”를 출력하세요.
		 */

		// 점수 입력받기 (국영수 세과목점수)
		System.out.print("국어 점수를 입력하세요: ");
		int kor = sc.nextInt();

		System.out.print("영어 점수를 입력하세요: ");
		int eng = sc.nextInt();

		System.out.print("수학 점수를 입력하세요: ");
		int math = sc.nextInt();

		// 합계 및 평균 계산
		int sum = kor + eng + math;
		double average = sum / 3.0;

		// 합격/불합격 조건 확인
		if (kor >= 40 && eng >= 40 && math >= 40 && average >= 60) {

			// 합격인 경우
			System.out.println("\n축하합니다, 합격입니다!");
			System.out.println("국어 점수:" + kor);
			System.out.println("영어 점수:" + eng);
			System.out.println("수학 점수:" + math);
			System.out.println("합계:    " + sum);
			System.out.printf("평균: %.2f\n", average); // 평균은 소수점 2자리까지 출력

		} else { // 불합격인 경우
			System.out.println("\n불합격입니다.");
		}
	}

	public static void practice2() {
		/*
		 * 키보드로 정수를 입력 받은 정수가 양수이면서 짝수일 때만 “짝수다”를 출력하고 짝수가 아니면 “홀수다“를 출력하세요. 양수가 아니면
		 * “양수만 입력해주세요.”를 출력하세요.
		 * 
		 * ex. 숫자를 한 개 입력하세요 : -8 양수만 입력해주세요.
		 */
		Scanner sc = new Scanner(System.in);

		// 숫자입력 받기
		System.out.print("숫자를 한 개 입력하세요: ");
		int num = sc.nextInt();

		// 조건 검사
		if (num > 0) { // 양수인지 확인
			if (num % 2 == 0) {
				System.out.println("짝수다");
			} else {
				System.out.println("홀수다");
			}
		} else { // 양수가 아닌 경우
			System.out.println("양수만 입력해주세요.");
		}

	}

	public static void practice1() {
		/*
		 * 아래 예시와 같이 메뉴를 출력하고 메뉴 번호를 누르면 “OO메뉴입니다“를, 종료 번호를 누르면 “프로그램이 종료됩니다.”를출력하세요.
		 * 
		 * ex. 1. 입력 2. 수정 3. 조회 4. 삭제 7. 종료
		 */
		Scanner sc = new Scanner(System.in);
		int menu;

		while (true) {
			// 메뉴 출력
			System.out.println("1. 입력");
			System.out.println("2. 수정");
			System.out.println("3. 조회");
			System.out.println("4. 삭제");
			System.out.println("7. 종료");
			System.out.print("메뉴 번호를 입력하세요: ");

			// 메뉴 번호 입력 받기
			menu = sc.nextInt();

			// 메뉴 번호에 따른 처리
			switch (menu) {
			case 1:
				System.out.println("입력 메뉴입니다.");
				break;
			case 2:
				System.out.println("수정 메뉴입니다.");
				break;
			case 3:
				System.out.println("조회 메뉴입니다.");
				break;
			case 4:
				System.out.println("삭제 메뉴입니다.");
				break;
			case 7:
				System.out.println("프로그램이 종료됩니다.");
				break;
			default:
				System.out.println("없는 메뉴에요. 다시 선택해주세요");
			}
		}
	}
}