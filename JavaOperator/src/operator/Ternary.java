package operator;
/*
@ Date : 2015.07.08
@ Author : me
@ Story : ���� ������ ����
*/

public class Ternary {

	public static void main(String[] args) {
		
		int left = 1, right = 0, result = 0;
		boolean bool = true; // true�� 1, false�� 0
		/*
		 * ���� �����ڴ� if-else �� ���๮���� ���ǽ�(bool)�� true�̸� left���� ����ϰ�
		 * false�� right ���� ����Ѵ�
		 */
		result = bool ? left : right;
		System.out.println("��,���� ��� :" + result);

	}

}
