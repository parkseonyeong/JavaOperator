package operator;

import java.util.Scanner;

public class TimeSeperator {

	public static void main(String[] args) {
		/*
		 * �Է¹��� �ʸ� �ð� �� �ʷ� ȯ���ϴ� ���α׷�
		 */
		Scanner scanner = new Scanner(System.in);
		
		int input = 0, second = 0, minute = 0, hour = 0;
		
		System.out.println("���ϰ��� �ϴ� �ð�(��) �Է�");
		input = scanner.nextInt();
		// �Է¹��� �ʰ� 500�̶�� �Ѵٸ� 500�ʸ� 60���� ���� �������� ��(%)
		// �� ���꿡�� ���� ��(/)�� �ٽ� 60���� ���� �������� ��
		// �� ���꿡�� ���� ���� �ð�
		
		System.out.println("�Է¹��� ��\t"+input);
		second = input % 60;
		minute = ( input / 60) % 60;
		hour = (input / 60) / 60;
		
		System.out.println("�Է��Ͻ� "+input+"�ʴ� "+hour+"�ð� "+minute+"�� "+second+"���Դϴ�");
	}

}
