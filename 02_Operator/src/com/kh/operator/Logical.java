package com.kh.operator;

import java.util.Scanner;	

public class Logical {	
	/*
	 	논리연산자 (이항연산자)
	 	: 두 개의 논리값을 연산 ( true / false )
	 	: 결과값도 논리값

	  	* 종류 : &&, ||
	  		- A && B : A, B 모두 true값이어야 결과값이 true.
	  		  true && true => true
	  		  true && false => false
	  		  false && true => false
	  		  false && false => false
	  		  
	  		- A || B : A 또는 B 둘 중 하나라도 true이면 결과값이 true.
	  		  true || true => true
	  		  true || false => true
	  		  false || true => true
	  		  false || false => false
	  	-------------------------------------------------------	  
		* 주의사항
		  - SCE (Short-Circuit Evaluation)
		   * && 연산자 : 앞(왼쪽)의 조건이 false이면 뒤(오른쪽)의 조건은 실행되지 않는다.
		   * || 연산자 : 앞(왼쪽)의 조건이 true이면 뒤(오른쪽)의 조건은 실행되지 않는다.
	*/
	
	public static void main(String[] args) {
		// method1();
		   method2();
	}
	public static void method2() {
		// 입력받은 문자가 소문자인지를 확인
		// 'a' : 97 ~ 'z' : 122
		Scanner sc = new Scanner(System.in);

		System.out.print("문자를 입력하세요 : ");
		/*
		String str = sc.next();
		char ch = str.charAt(0);
		*/ 
		char ch = sc.next().charAt(0);
		
		boolean result = (ch >= 97) && (ch <= 122);
		boolean r2 = (ch >= 'a') && (ch <= 'z');
		
		System.out.println("입력받은 값이 소문자인가? : " + result);
		System.out.println("입력받은 값이 소문자인가? : " + r2);
	}
		
	
	public static void method1() {
		// 입력받은 값이 1 ~ 10 사이의 값인지 확인
		Scanner sc = new Scanner(System.in);

		System.out.print("숫자를 입력하세요 : ");
		int a1 = sc.nextInt();
		
		boolean result1 = (1 <= a1) && (a1 <= 10);
		System.out.printf("입력된 값은 1 ~ 10사이의 값인가?" + result1);
		
		boolean result2 = (1 > a1) || (a1 > 10);
		System.out.println("입력된 값은 1 ~ 10범위를 벗어나는가?" + result2);
	}
}













