package loop;
/*
@ Date : 2015.07.10
@ Author : me
@ Story : For문을 활용한 1~10 합
*/
public class ForLoopSum {

	public static void main(String[] args) {
		
		int sum = 0; // 누적결과값을 출력하는 변수
		for (int i = 1; i <= 10; i++) {
			sum += i; // i값이 1씩 증가
			
		}
		System.out.println("1부터 10까지 합 :" + sum);

	}

}
