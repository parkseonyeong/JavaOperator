package operator;

import java.util.Scanner;

public class HelloJava {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner ( System.in);
		int kor = 0, eng = 0, math = 0, total = 0;
		
		System.out.println("���������� �Է��ϼ���");
		kor = scanner.nextInt();
		
		System.out.println("���������� �Է��ϼ���");
		eng = scanner.nextInt();
		
		System.out.println("���������� �Է��ϼ���");
		math = scanner.nextInt();
		
		total = kor + eng + math;
		
		System.out.println("���� :" + total);

	}

}
