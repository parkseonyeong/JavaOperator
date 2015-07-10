package condition;

import java.util.Scanner;

public class BigNumber {

	public static void main(String[] args) {
		/*
		 * 오더
		 * 학생3명의 점수를 입력받아서 1등을 출력할 것
		 * 결과)
		 * 1등은 98점입니다
		 * 힌트 : a와 b를 비교, a와 c를비교, b와 c를 비교한다
		 */
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("a학생의 점수를 입력하세요:");
		int a = scanner.nextInt();
		
		System.out.println("b학생의 점수를 입력하세요:");
		int b = scanner.nextInt();
		
		System.out.println("c학생의 점수를 입력하세요:");
		int c = scanner.nextInt();
		
		if ( a >= b && a >= c )
		{
			System.out.println("a학생은"+a+"점으로 1등입니다.");
		}
		else if ( a <= b && b >= c )
		{
			System.out.println("b학생은"+b+"점으로 1등입니다.");
		}
		else 
		{
			System.out.println("c학생은"+c+"점으로 1등입니다..");
		}
		

	}

}
