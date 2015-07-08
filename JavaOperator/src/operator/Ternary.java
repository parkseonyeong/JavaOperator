package operator;
/*
@ Date : 2015.07.08
@ Author : me
@ Story : 삼항 연산자 문법
*/

public class Ternary {

	public static void main(String[] args) {
		
		int left = 1, right = 0, result = 0;
		boolean bool = true; // true면 1, false면 0
		/*
		 * 삼항 연산자는 if-else 의 단축문으로 조건식(bool)이 true이면 left값을 출력하고
		 * false면 right 값을 출력한다
		 */
		result = bool ? left : right;
		System.out.println("참,거짓 결과 :" + result);

	}

}
