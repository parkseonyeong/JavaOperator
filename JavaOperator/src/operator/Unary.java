package operator;
/*
 	@ Date : 2015.07.08
 	@ Author : me
 	@ Story : ���� ������ ����
 */
public class Unary {

	public static void main(String[] args) {
		/*
		 * ���׿�����
		 * i++(����������) �Ǵ� ++i (����������)
		 */
		
		int i = 5, j = 0, x = 5, y = 0; //���������� ����Ʈ������ �ʱ�ȭ
		
		// �������� �������� �о�� �� �����Ѵ�
		j = i++;
		System.out.println("j�� ���� :\t"+ j +"�Դϴ�"); // /t�� ��ĭ���, /n�� ���ٶ��
		
		// ��������  x�� ���� ������Ű�� �����Ѵ�
		// i = i + 1;
		y = ++x;
		System.out.println("y�� �� :\t " + y);

	}

}
