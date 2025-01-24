package com.kh.operator;

public class Arithmetic {

	/*
	 * 산술연산자 (이항연산자) => +, -, *, /, % 우선순위 : *, /, %, >, +, =
	 */
	public static void main(String[] args) {
		// method1();
		method2();

	}

	public static void method1() {
		int n1 = 10;
		int n2 = 3;

		System.out.println("n1 + n2 = " + (n1 + n2));
		System.out.println("n1 - n2 = " + (n1 - n2));

		System.out.println("n1 * n2 = " + (n1 * n2));
		System.out.println("n1 / n2 = " + (n1 / n2));
		System.out.println("n1 % n2 = " + (n1 % n2));

		// 나머지 연산자 (%) -> 짝수/홀수 판별
		// (변수 % 2 == 0) --> 짝수
		// (변수 % 2 == 0) --> 홀수
		System.out.printf("n1의 값은 짝수인가? %b\n", (n1 % 2 == 0)); // true
		System.out.printf("n2의 값은 짝수인가? %b\n", (n1 % 2 == 0)); // false
	}

	public static void method2() {
		int a = 5;
		int b = 10;

		int c = (++a) + b; // c: 16
		int d = c / a; // d: "16 / 6" => 2 (몫을 구함)
		int e = c % a; // e: "16 / 6" => 4 (나머지를 구함)
		int f = e++; // f => 11
		int g = (--b) + (d--); // g: => 9 + 2 = 11 (b와 d 값이 -1 감소됨)
		int h = 2; // h => 2
		int i = (a++) + b / (--c / f) * (g-- - d) % (++e + h);
		// i: 6 + 9 / 15 / 4 * 11 - 1 % 6 + 2 => 15 / 3 * 10 % 8
		// i 최종값: 12
		System.out.printf("a: %d, b: %d, c: %d, d: %d\n ", a, b, c, d);
		System.out.printf("e: %d, f: %d, g: %d, h: %d, i: %d\n", e, f, g, h, i);
	}

}
