package com.kh;

import java.util.Scanner;

public class CastingPractice1 {

	public static void main(String[] args) { 
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("문자 : ");	// "문자 : " 내용을 콘솔창에 출력
		// char i1 = sc.next().charAt(0);
		String i1 = sc.next();          // 문자열을 입력받아 i1이라는 변수에 저장
		
		// 문자(char) => 정수(int) 타입으로 변환하여 출력
		char ch = i1.charAt(0);	// 문자열변수 i1에 저장된 값 중 첫번째 글자를 추출
		
		// System.out.print(i1 + "unicode : " + (int)i1);
		
		// {입력받은값} unicode : {정수값}" 형식으로 출력
		// println 메소드
		System.out.println(ch + " unicode : " + (int)ch);
		// printf 메소드
		System.out.printf("%c unicode : %d\n", ch, (int)ch);
		
	}

}
