package condition;

/*
@ Date : 2015.07.08
@ Author : me
@ Story : If문  if(condition) = 조건문
*/
public class AntiPatternOnlyIf {

	public static void main(String[] args) {
		/*
		 * 구문(statment)
		 * 자바 연산식은 3가지 종류의 구문으로 나뉜다
		 * 1.조건문 
		 * 	if, if-else, switch
		 * 2.반복문
		 * 	while, do-while, for
		 * 3.기타
		 * 	continue, break, return
		 */
		int x = 1, y = 2;
		if ( x == y) {  // 숫자값의 비교연산자 ==
			System.out.println("숫자 x와 y의 값은 같다");
		}
		if ( x != y) { // !는 부정(not)낫 이꼬르
			System.out.println("숫자 x와 y의 값은 다르다");
		}
		if ( x > y) {
			System.out.println("숫자 x는 y보다 크다");
		}
		if ( x < y) {
			System.out.println("숫자 x는 y보다 작다");
		}
		if ( x >= y) {
			System.out.println("숫자 x는 y보다 크거나 같다");
		}
		if ( x <= y) {
			System.out.println("숫자 x는 y보다 작거나 같다");
		}
		/*
		 * 한 구문은 반드시 하나의 결과만을 리턴하게끔 코딩해야 한다. 
		 * 따라서  Only If문을 코딩할때는 개발자가 한 문장만 출력한다는 확신이 있을때 다룬다
		 */
	}

}
