package operator;

import java.util.Scanner;

public class Calculator {
	
	public static void main(String[] args) {
		/*
		 * order
		 * ��ĳ�ʷ� �� ���� �Է¹޾Ƽ� ��Ģ���� ����� �������� �Ͻÿ�
		 * 20 + 7 = 27
		 * 20 * 7 = 140
		 */
		
		Scanner scanner = new Scanner ( System.in);
		int x = 0, y = 0, total = 0;
		
		System.out.println("���� �Է��ϼ���");
		x = scanner.nextInt(); // next�� Ŀ�� ���� ������ ������ �Ҵ��϶� ��� �ǹ�
		
		System.out.println("�ϳ��� �Է��ϼ���");
		y = scanner.nextInt();

		total = x + y;
		
		// System.out.println( x+"+"+y+"="+ (x + y)"); // total ���� �̷��� �ص���
		System.out.println("+ ��� :" + total);
		
		total = x - y;
		
		System.out.println("- ��� :" + total);
		
		total = x * y;
		
		System.out.println("* ��� :" + total);
		
		total = x / y;
		
		System.out.println("/ ��� :" + total);
		
		total = x % y;
		
		System.out.println("% ��� :" + total);
		
	}

}
