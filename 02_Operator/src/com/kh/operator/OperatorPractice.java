package com.kh.operator;

import java.util.Scanner;

public class OperatorPractice {

	public static void main(String[] args) {
		// practice1();
		// practice2();
		// practice3();
		// practice4();
		// practice5();
		// practice6();
		// practice7();
		// practice8();
		// practice9();
		// practice10();
		practice11();
	}
	

	public static void practice11() { 
		/*  A, B, C 사원의 연봉을 입력 받고 각 사원의 연봉과 인센티브를 포함한 연봉을 계산하여 출력하고 
			인센티브 포함 급여가 3000만원 이상이면 “3000 이상”, 미만이면 “3000 미만”을 출력하세요.
 			(A 사원의 인센티브는 0.4, B 사원의 인센티브는 없으며, C 사원의 인센티브는 0.15)
 			ex)
 			A사원의 연봉 : 2500
 			B사원의 연봉 : 2900
 			C사원의 연봉 : 2600
 			A사원 연봉/연봉+a : 2500/3500.0
 						     3000 이상
			B사원 연봉/연봉+a : 2900/2900.0
 						     3000 미만
			C사원 연봉/연봉+a : 2600/2989.9999999999995
 							 3000 미만 
		 */
		Scanner sc = new Scanner(System.in);

	    System.out.print("A 사원의 연봉을 입력하세요: ");
	    double salaryA = sc.nextDouble();

	    System.out.print("B 사원의 연봉을 입력하세요: ");
	    double salaryB = sc.nextDouble();

	    System.out.print("C 사원의 연봉을 입력하세요: ");
	    double salaryC = sc.nextDouble();

	    // A, B, C 사원의 인센티브 포함 연봉 계산
	    double salaryWithBonusA = salaryA + (salaryA * 0.4); // A 사원의 인센티브: 0.4
	    double salaryWithBonusB = salaryB; // B 사원의 인센티브는 없음
	    double salaryWithBonusC = salaryC + (salaryC * 0.15); // C 사원의 인센티브: 0.15

	    // 결과 출력 및 3000 이상/미만 판별
	    System.out.println("A사원 연봉/연봉+a : " + salaryA + "/" + salaryWithBonusA);
	    System.out.println(salaryWithBonusA >= 3000 ? "3000 이상" : "3000 미만");

	    System.out.println("B사원 연봉/연봉+a : " + salaryB + "/" + salaryWithBonusB);
	    System.out.println(salaryWithBonusB >= 3000 ? "3000 이상" : "3000 미만");

	    System.out.println("C사원 연봉/연봉+a : " + salaryC + "/" + salaryWithBonusC);
	    System.out.println(salaryWithBonusC >= 3000 ? "3000 이상" : "3000 미만");
	
	}
		


		
		
		
		public static void practice1() {
			Scanner sc = new Scanner(System.in);

				System.out.print("정수 : ");
				int num = sc.nextInt();
				
				String result = num > 0 ? "양수다" : "양수가 아니다";
				System.out.print(result);
		
		}
		
		public static void practice2() {
			Scanner sc = new Scanner(System.in);

				System.out.print("정수 : ");
				int num = sc.nextInt();
				
				String result = num > 0 ? "양수다" : num == 0 ? "0이다" : "음수다";
				System.out.print(result);
		
		}

		public static void practice3() {
			Scanner sc = new Scanner(System.in);

				System.out.print("정수 : ");
				int num = sc.nextInt();
				
				String result = (num % 2 == 0) ? "짝수다" : "홀수다";
				System.out.print(result);
		
		}

		public static void practice4() {
			Scanner sc = new Scanner(System.in);

			int num1 = sc.nextInt();
				System.out.print("인원 수 : ");
			
			int num2 = sc.nextInt();
				System.out.print("사탕개수 : ");
									
				System.out.print("1인당 사탕개수 : " + (num2 / num1));
				System.out.print("남은 사탕개수 : " + (num2 % num1));
	}

		public static void practice5() {
			Scanner sc = new Scanner(System.in);

			System.out.print("이름 : ");
			String name = sc.nextLine();
			
			System.out.print("학년(숫자만) : ");
			int grade = sc.nextInt();

			System.out.print("반(숫자만) : ");
			int ban = sc.nextInt();
			
			System.out.print("번(숫자만) : ");
			int num = sc.nextInt();
			
			System.out.print("성별(M/F) : ");
			char gender = sc.next().charAt(0);
			
			System.out.print("성적(소수점 아래 둘째 자리까지): ");
	        double score = sc.nextDouble();
				
	        String result = (gender == 'M' || gender == 'm') ? "남학생" : (gender == 'F' || gender == 'f') ? "여학생" : "해당없음";

	        System.out.printf("%d학년 %d반 %d번 %s %s의 성적은 %.2f이다.\n", 
	                grade, ban, num, name, result, score);
	}
		
		public static void practice6() {
			Scanner sc = new Scanner(System.in);

			 System.out.print("나이를 입력하세요: ");
		        int age = sc.nextInt();

		        String category = (age <= 13) ? "어린이" : 
		                          (age <= 19) ? "청소년" : 
		                          "성인.";

		        System.out.println(category);
	}
		
		public static void practice7() {
			Scanner sc = new Scanner(System.in);

			System.out.print("국어 점수: ");
	        int korean = sc.nextInt();

	        System.out.print("영어 점수: ");
	        int english = sc.nextInt();

	        System.out.print("수학 점수: ");
	        int math = sc.nextInt();

	        // 합계와 평균 계산
	        int total = korean + english + math;
	        double average = total / 3.0;

	        // 합격 여부 판단 (삼항 연산자 사용)
	        String result = (korean >= 40 && english >= 40 && math >= 40 && average >= 60) 
	                        ? "합격" : "불합격";

	        // 결과 출력
	        System.out.println("합계: " + total);
	        System.out.printf("평균: %.2f\n", average);
	        System.out.println("결과: " + result);
		
		}
		
		
		public static void practice8() {
			Scanner sc = new Scanner(System.in);

			System.out.print("주민등록번호를 입력하세요 (예: 000101-1234567): ");
	        String idNumber = sc.nextLine();
	        
	        char genderCode = idNumber.charAt(7); 
	        String gender = (genderCode == '1' || genderCode == '3') ? "남자" : 
	                        (genderCode == '2' || genderCode == '4') ? "여자" : 
	                        "유효하지 않은 주민등록번호";

	        // 결과 출력
	        System.out.println("성별: " + gender);
	}
		
		public static void practice9() {
			Scanner sc = new Scanner(System.in);

			System.out.print("첫 번째 정수(num1): ");
	        int num1 = sc.nextInt();

	        System.out.print("두 번째 정수(num2): ");
	        int num2 = sc.nextInt();

	        String validCheck = (num1 < num2) ? "" : "num1은 num2보다 작아야 합니다. 프로그램을 종료합니다.";
	        System.out.println(validCheck);
	        
	        if (!(num1 < num2)) {
	            sc.close();
	            return;
	        }

	        System.out.print("확인할 정수: ");
	        int checkNum = sc.nextInt();

	        boolean result = (checkNum <= num1 || checkNum > num2);

	        System.out.println("결과: " + result);

		}
		
		public static void practice10() {
			Scanner sc = new Scanner(System.in);

			System.out.print("첫 번째 정수: ");
	        int num1 = sc.nextInt();

	        System.out.print("두 번째 정수: ");
	        int num2 = sc.nextInt();

	        System.out.print("세 번째 정수: ");
	        int num3 = sc.nextInt();

	        boolean result = (num1 == num2 && num2 == num3);

	        System.out.println("결과: " + result);
		
		}
		
}










