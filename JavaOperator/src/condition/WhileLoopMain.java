package condition;
/*
@ Date : 2015.07.09
@ Author : me
@ Story : While Loop문
*/
public class WhileLoopMain {

	public static void main(String[] args) {
		/*
		 * loop : 원단어 뜻은 순환을 의미
		 * 인덱스값을 통해 순환 횟수를 설정하고 limit값을 통해 마감 인덱스까지만 회전한다
		 * 
		 * While loop은 limit값을 알 수 있는 상황과 없는상황 두 가지버전으로 사용한다.
		 * limit값이 설정된 경우
		 */
		
		int idx = 1;
		while ( idx < 11) {
			System.out.print( idx + "\t" ); // println : 개행 print : 개행이 사라짐
			idx++; // 값이 하나씩 증가
		}

	}

}
