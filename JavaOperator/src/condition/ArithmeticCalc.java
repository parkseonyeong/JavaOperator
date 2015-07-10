package condition;

import java.util.Scanner;

/*
@ Date : 2015.07.09
@ Author : me
@ Story : 사칙연산 계산 프로그램
*/
public class ArithmeticCalc {

	public static void main(String[] args) {
		/*
		 * 오더 : 사칙연산 기호 입력받기
		 * 사칙연산 계산기 (덧셈,뺄셈,곱셈,나눗셈(몫:(), 나머지값:()) 
		 * 출력결과
		 * === 심플 계산기 ===
		 * 5 * 5 = 25
		 * 5 + 5 = 10
		 * 6 ÷ 5 = 1 (1)
		 * 5 - 6 = -1 
		 */

		Scanner scanner = new Scanner ( System.in);
		String opcode = "";
		int x = 0, y = 0;
		
		System.out.println("계산을 시작합니다.");
		
		System.out.println("첫번째 값을 입력하세요.");
		x = scanner.nextInt();
		
		System.out.println("두번째 값을 입력하세요.");
		y = scanner.nextInt();
		
		System.out.println("기호를 입력하세요( +, -, /, * )");
		opcode = scanner.next();
		
		if( opcode.equals("+")) {
			System.out.println( x + y +"입니다."); }
		else if ( opcode.equals("-")) {
			System.out.println( x - y +"입니다."); }
		else if ( opcode.equals("*")) {
			System.out.println( x * y +"입니다."); }
		else if ( opcode.equals("/")) {
			System.out.println( x / y +"입니다. 나머지값은 : " + x % y + "입니다."); }
		else {
			System.out.println("입력된 값이 올바르지 않습니다."); }
	}
		
}

