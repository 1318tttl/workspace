package com.kh.operator;

import java.util.Scanner;	

public class Triple {
	/*
	   * 삼항연산자 (항이 3개인 연산자)
	    	조건식 ? 조건식이 참(true)인 경우 결과값/식 : 조건식이 거짓(false)인 경우 결과값/식
	*/
	
	
	public static void main(String[] args) {
		// method1();
		method2(); 
	}
	
	public static void method2() {
		/*
		   사용자에게 두 개의 정수와 + 또는 - 값을 입력받아
		   연산결과를 출력
		   입력 예) 10 20 +
		   		   단! + 또는 - 외의 문자가 입력되었을 경우 "입력이 잘못되었습니다"를 출력
		*/
		Scanner sc = new Scanner(System.in);
		
		System.out.println("아래와 같이 입력 시 연산결과를 확인할 수 있습니다");
		System.out.println("예) 10 20 + => 10+20+30의 결과 확인");
		
							   // 버퍼: 비어있음 
		int n1 = sc.nextInt(); // 입력: 10 20 + 버퍼: 10 20 + \n
							   // n1 = 10;	   버퍼: 20 + \n

		int n2 = sc.nextInt(); // 버퍼: 20+\n
							   // n2 = 20;	   버퍼: +\n
		char op = sc.next().charAt(0);	// 버퍼: +\n
										// op = +; 버퍼: \n 
		
		String result = "" + (op == '+' ? n1 + n2 : (op == '-'? n1 - n2 : "입력이 잘못되었습니다"));
		System.out.printf("%d %c %d = %s\n", n1, op, n2, result);
				
		/* 
		 	.nextLine() // => /n 
		 	그외 .next(), .nextInt(), ...// 공백
		
		10 20 + /n
		.next() // 10
		.next() // 20
		.next() // +
		*/
	}
	
	public static void method1() {
		/* 입력한 값이 x인 경우 "종료합니다" 출력
		   그렇지 않으면 "계속 진행합니다" 출력 
		*/
		Scanner sc = new Scanner(System.in);
		
		System.out.print("종료를 원할 경우 x를 입력하세요 : ");
		// String str = sc.next();
		// char ch = str.charAt(0);
		char ch = sc.next().charAt(0);

		String result = (ch == 'x' || ch == 'X') ? "종료합니다" : "계속 진행합니다";
		// 왼쪽의 결과가 true이면 오른쪽은 실행하지 않음
		System.out.print(result);
	
	}

}









