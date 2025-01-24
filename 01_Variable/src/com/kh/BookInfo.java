package com.kh;

public class BookInfo { 
	
    public static void main(String[] args) { // public void 사이에 static 빠짐
   
    	String title = "Java의 정석"; 
        String author = "남궁성"; 
        int pageCount = 1022; // 문자로 인식되니 ""없애야 함
        boolean isAvailable = false; //

        System.out.println("책 제목: " + title);
        System.out.println("저자: " + author);
        System.out.println("페이지 수: " + pageCount);
        System.out.println("대출 가능 여부: " + isAvailable); 

    /*  
     	int result = ((25 * 5) + (36 - 4) - 72) / 5;
    	System.out.println(result);
    */
        
    /*  int result = ((25 * 5) + (36 - 4) - 72) / 5;
    	System.out.println(result);
    	
    	int a = 20;
    	int b = 50;
    	boolean a = (a > b) && (a < 10); 
    	boolean b = ((a += 10) > 20) || (b += 10 < 10);
    	 
    	System.out.println(a);	// a의 값은? 	30
    	System.out.println(b);	// b의 값은?	50
    */ 
        
    }
}
    
