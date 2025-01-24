package com.kh.condition;

import java.util.Scanner;

public class Switch {
	public static void main(String[] args) { 
		// method1();
		// method2();
		// method3();
		method4();
	}
	
	public static void method4() {
		/* 
		   "월"을 입력받아 해당 월의 말일이 며칠까지인지 출력
		   
		   월을 입력하세요 : XX
		   XX월은 XX일까지입니다.
	
		   * 1,3,5,7,8,10,12 => 31
		   * 4,6,9,11        => 30
		   * 2               => 28
		    ------------------------
		*/	
		Scanner sc = new Scanner(System.in);
        System.out.print("월을 입력하세요 : ");
        int month = sc.nextInt();
        
 
		switch(month) {
			case 1 :
			case 3 :
			case 5 :
			case 7 :
			case 8 :
			case 10 :
			case 12 :
				System.out.println(month + " 월은 31일까지입니다");
				break;
				
			case 4 : case 6 : case 9 : case 11 :
				System.out.println(month + " 월은 30일까지입니다");
				break;
				
			case 2 :
				System.out.println(month + " 월은 28일까지입니다");
				break;
				
			default:
				System.out.println("1 ~ 12월까지자료를 입력하세요");
			
	}
}

	
	
	public static void method3() {
		/* 
		   ○ 과일을 구매 프로그램 ○
		    - 사용자가 구매하고자 하는 과일을 입력하면 해당가격을 출력
		    출력 => {과일이름}의 가격은 {과일가격}원입니다.
		    ------------------------
		    사과 : 15000
		    포도 : 30000
		    귤  : 8000
		    ------------------------
		*/	
		Scanner sc = new Scanner(System.in);
        System.out.print("과일이름 :  ");
        String Fruit = sc.nextLine();
		
		switch(Fruit) {
			case "사과": // fruit == 사과 | frult.equals("사과")
				System.out.print("사과의 가격은 15000원입니다.");
				break;
				
			case "포도": // fruit == 포도 | frult.equals("포도")
				System.out.print("포도의 가격은 30000원입니다.");
				break;
				
			case "귤": // oprange == 오렌지| frult.equals("오렌지")
				System.out.print("귤의 가격은 8000원입니다.");
				break;
				
			default:
				System.out.print("해당 과일과격은 알 수 없습니다.");
				break;
			
	
	}

	
	
		
		/* System.out.print("1 ~ 3 사이의 정수 입력 : ");
		int col2 = sc.nextInt();
		
		switch (col2) {
			case 1: 
				System.out.println("빨간색");
				break;
		
			case 2: 
				System.out.println("노란색");
				break;
		
			case 3: 
				System.out.println("초록색");
				break;
				
		default: 
			System.out.println("잘못 입력하였습니다.");
		
		}	
		*/
		
	/* public static void method2() {
		Scanner sc = new Scanner(System.in);
		int col2 = sc.nextInt();
		
		if (col2 == 1) { 
			System.out.println("빨간색"); 
			} else if (col2 == 2) {
				System.out.println("파란색");
			} else if (col2 == 3) {
				System.out.println("초록색");
			} else { 
				System.out.println("잘못 입력하였습니다.");
			}
		}	
	*/ 
	}
}

