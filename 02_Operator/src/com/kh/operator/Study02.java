package com.kh.operator;

import java.util.Scanner;

public class Study02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("==== 입력한 값의 제곱한 결과를 표시 ====");
		System.out.print(" : ");
		int num = sc.nextInt();
		
		System.out.println("결과 => " + num*num);
	}


}
