package operator;

import java.util.Scanner;

public class Calculator {
	
	public static void main(String[] args) {
		/*
		 * order
		 * 스캐너로 두 값을 입력받아서 사칙연산 결과가 나오도록 하시오
		 * 20 + 7 = 27
		 * 20 * 7 = 140
		 */
		
		Scanner scanner = new Scanner ( System.in);
		int x = 0, y = 0, total = 0;
		
		System.out.println("값을 입력하세요");
		x = scanner.nextInt(); // next는 커서 다음 문장을 변수에 할당하라 라는 의미
		
		System.out.println("하나더 입력하세요");
		y = scanner.nextInt();

		total = x + y;
		
		// System.out.println( x+"+"+y+"="+ (x + y)"); // total 없이 이렇게 해도됨
		System.out.println("+ 결과 :" + total);
		
		total = x - y;
		
		System.out.println("- 결과 :" + total);
		
		total = x * y;
		
		System.out.println("* 결과 :" + total);
		
		total = x / y;
		
		System.out.println("/ 결과 :" + total);
		
		total = x % y;
		
		System.out.println("% 결과 :" + total);
		
	}

}
