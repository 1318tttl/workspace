package com.kh;

public class Cast {

	/*
	  * 형변환 : 값의 자료형을 바꾸는 것
	 	  컴퓨터에서 값을 처리하는 규칙 (형변환이 필요한 시점/상황)
			1) 대입연산자 : 왼쪽과 오른쪽이 같은 자료형이어야 함
						 => 다른 자료형의 값을 대입하고자 할 때 형변환이 필수!
						 
				자료형 변수명 = (자료형)값;
			
			2) 같은 자료형끼리만 연산 가능!
			
				결과값 = 값1 + 값2;
				=> 값1, 값2 모두 같은 자료형이어야 함!
				   결과값도 같은 자료형이어야 함
	*/
	
	public static void main(String[] args) {
		
		// autoCasting();
		forceCasting();
		
	}
	
	public static void forceCasting() {
		/*
		 	강제 형변환 :  자동 형변환이 되지 않는 경우, 직접 형변환을 해주는 것
		 				 큰 범위의 자료형에서 작은 범위의 자료형으로 변환이 필요할 때
		 				 
		 	(변환할자료형)변환할대상
		 	 => 변환대상 : 값, 변수, ...
		*/
		// 실수형 d1 변수에 4.0 이라는 값을 저장
		double d1 = 4.0;
		// 정수형 i1 변수에 50이라는 값을 저장
		int i1 = 50;
		
		// d1 변수와 i1 변수의 합을 정수형 result변수에 저장
		int result;
		// result = (int)d1 + i1;
		// * 4.0 (double) + 50 (int) => 4 (int) + 50 (int) => 54 (int) 
		result = (int)(d1 + i1);
		// * 4.0 (double) + 50 (int) => 4.0 (double) + 50.0 (double)
		// 	 => 54.0 (double) => 54 (int)
		
		// ------------------------------------------------------------
		
		// * 강제 형변환 시 데이터 손실이 발생될 수 있음!
		int i2 = 290;
		byte i3 = (byte)i2;	// i3 (byte) = i2 (int) => 강제 형변환 필요!
		// byte 범위 : -128 ~ 127
		
		System.out.println("i3 : " + i3); // => 34
	}
	
	public static void autoCasting() {
		/*
		 자동 형변환 : 값의 범위가 작은 자료형에서 큰 자료형으로 자동 형변환
		 byte(1B) - short(2B) - int(4B) - long(8B) 
		 			char(2B) 
		 - float(4b) : 소수점 7자리까지 표현하며 "int"보다 범위가 큼
		 - double(8b) 
		*/
		// 정수형 변수 i1 에 12라는 값을 저장
		int i1 = 12;
		// 실수형 변수 d1 에 i1의 값을 저장
		double d1 = i1;	// i1(int) => (double)
						// 	   12  => 12.0
		
		System.out.println("d1 : " + d1);
		int i2 = 15;
		double d2 = 3.3;
		
		double result = i2 + d2;	// i2 (int) => (double)
									//		15	=> 15.0
					// i2 + d2 => (int) + (double) => (double) + (double)
		
		System.out.println("result : " + result);
		
		
	}

}



















