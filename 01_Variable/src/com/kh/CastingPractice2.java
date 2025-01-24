package com.kh;

import java.util.Scanner;

public class CastingPractice2 {
	public static void main(String[] args) { 
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 : ");
		double Ko = sc.nextDouble();
		
		System.out.print("영어 : ");
		double En = sc.nextDouble();
		
		System.out.print("수학 : ");
		double Ma = sc.nextDouble();
		
		System.out.println("총점 : " + (int)(Ko + En + Ma));
		System.out.println("평균 : " + (int)((Ko + En + Ma) / 3)); 
		
	}
}
