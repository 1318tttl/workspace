package com.kh.operator;

import java.util.Scanner;	

public class Practice {

	public static void main(String[] args) {
		// example01();
		// example02();
		example03();
		
	}
	
	public static void example03() { 
		Scanner sc = new Scanner(System.in);
		/*
		   산술연산자 활용 예제_
		   키와 몸무게를 입력받아 BMI를 계산하여 출력
		   - BMI : 몸무게 / (키(m) * 키(m));
		   - BMI 판정기준
		   		- 18.5 이하 : 저체중
		   		- 18.5 < BMI <= 22.9 : 정상
		   		- 23.0 <= BMI <= 24.9 : 과체중
		   		- 25 < BMI : 비만
		   
		   출력 예) "BMI 지수는 20.5로 정상입니다."	
		*/
		System.out.print("키 입력(cm) : ");
		double h1 = sc.nextDouble(); 
		// 키 입력 
		h1 *= 0.01;
		
		System.out.println("몸무게 입력(kg) : ");
		double h2 = sc.nextDouble(); 
		double BMI = h2 / (h1 * h1); 
		String result = BMI <= 18.5 ? "저체중" :
						18.5 < BMI && BMI <= 22.9 ? "정상" :
						23.0 < BMI && BMI <= 24.9 ? "과체중" : "비만";
		
		System.out.printf("BMI 지수는 %.2f로 %s입니다\n", BMI, result);
		
	}
	
	/* [1] 복합 대입 연산자
	  	   : 대입 연산자와 다른 연산자를 조합하여 하나의 연산자처럼 사용되는 연산자
	  	   
	  	   n1 += 10;
	  	   => n1 = n1 + 10;
	  	   
	   [2] 비교연산자, 논리연산자
	   	   : 결과값이 참(true) 또는 거짓(false)
	   	   : 이항연산자
	*/
 	/* SCE => &&, || 
	         연산자가 수행될 때 두 항을 모두 실행하지 않더라도 
	         결과를 알 수 있는 경우 
	     * && : 앞 조건이 false일 때 뒤의 조건이 수행하지 않음 
	     * || : 앞 조건이 true일 때 뒤의 조건이 수행하지 않음
	*/
	
	public static void example01() { 
		Scanner sc = new Scanner(System.in);
		/*
		   사용자로부터 숫자를 입력받아 그 값에 7L을 더한 결과를 출력
		   => 숫자를 입력받을 때 타입을 short 자료형 사용 (.nextShort())
		*/
		
		System.out.print("숫자 입력 : ");
		short d1 = sc.nextShort();
		
		d1 += 7L; 
		// d1 += 7L;	"0.0f -> float"
		// d1 = d1 + 7L;
		 
		System.out.println("입력 값 : " + d1 + ", 7L을 더한 값 : " + (d1));
		// => 복합대입연산자를 사용하지 않은 경우
		// d1 = (short)(d1 + (short)7L);
		// d1 = d1 (short) + 7L (long)
		
	}
	
	public static void example02() { 
		Scanner sc = new Scanner(System.in);
		/* 나이를 입력받아 초등학생, 중학생, 고등학생을 구분하여 출력 
		   (그 외에는 "알수없음")
		   - 초등학생 : 8세 ~ 13세
		   - 중등학생 : 14세 ~ 16세
		   = 고등학생 : 17세 ~ 19세
		*/
		
		System.out.print("나이를 입력하세요 : ");
			int stu = sc.nextInt();
			
		String result = "알수없음"; 	// "알수없음" 값으로 초기화
			result = 8 <= stu && stu <= 13 ? "초등학생" : result;
			result = 14 <= stu && stu <= 16 ? "중학생" : result;
			result = 17 <= stu && stu <= 19 ? "중학생" : result;
		
		System.out.println("결과: " + result);
		
		/* 형님이 보여준 if문
		   if((8 <= stu && stu <= 13);
		 	  result = "초등학생 : " + stu;
			else if (14 <= stu && stu <= 16); 
			  result = "중학생 : " + stu; 
			else if (17 <= stu && stu <= 19); 
			  result = "고등학생 : " + stu;
			else result = "알수없음";
		*/
				 
			 		
		/* 형님의 풀이
		   String result = (8 <= stu && stu <= 13) ? "초등학생" :
			(14 <= stu && stu <= 16) ? "중학생" :
			(17 <= stu && stu <= 19) ? "고등학생"	:	  
			"알수없음"; 
			
			System.out.println(result);
		*/
		
		int num = 10;
		int i = 3;
		boolean result2;
		
		result2 = ((num += 15) < 0) && ((i*=2) > 2);
		System.out.println("===== && 연산결과 ====");
		System.out.println("result2: " +result2);
		System.out.println("i: " +i);
		System.out.println("num: "+num);
		// => result2 : false, i: 3, num: 25
		
		result2 = ((num += 15) < 0 || ((i*=2) > 2));
		System.out.println("===== || 연산결과 ====");
		System.out.println("result2: " +result2);
		System.out.println("i: " +i);
		System.out.println("num: "+num);
		// => result2 : true, i: 6, num: 40
	}
}
	














