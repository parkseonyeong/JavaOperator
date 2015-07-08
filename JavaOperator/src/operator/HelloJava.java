package operator;

import java.util.Scanner;

public class HelloJava {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner ( System.in);
		int kor = 0, eng = 0, math = 0, total = 0;
		
		System.out.println("국어점수를 입력하세요");
		kor = scanner.nextInt();
		
		System.out.println("영어점수를 입력하세요");
		eng = scanner.nextInt();
		
		System.out.println("수학점수를 입력하세요");
		math = scanner.nextInt();
		
		total = kor + eng + math;
		
		System.out.println("총점 :" + total);

	}

}
