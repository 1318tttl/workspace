package com.kh;

public class PersonInfo { 
	
    public static void main(String[] args) { // public void 사이에 static 빠짐
        String name = "홍길동"; // "" 빠졌음
        int age = 25; // 문자로 인식되니 ""없애야 함
        double height = 175.5; // ,를 .으로 변경
        char bloodType = 'O'; // "" → ''로 변경

        System.out.println("이름: " + name);
        System.out.println("나이: " + age);
        System.out.println("키: " + height);
        System.out.println("혈액형: " + bloodType);
    }
}


