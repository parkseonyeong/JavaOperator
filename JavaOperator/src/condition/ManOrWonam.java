package condition;

import java.util.Scanner;

/*
@ Date : 2015.07.10
@ Author : me
@ Story : if-else (큰 수 구하기)
*/
public class ManOrWonam {

	public void ssn() {
		// 선언부
		Scanner scanner = new Scanner(System.in);
		String msg="";
		// 연산부
		/*
		 * 1,3번은 남자 
		 * 2,4번은 여자
		 * 5번 외국인
		 * 잘못 입력한값입니다
		 */
		System.out.println("주민번호를 입력하세요 (800101-1234567)");
		String ssn = scanner.next();
		
		char ch = ssn.charAt(7); // charAt(n)은 n번째글자 하나만 출력해서 값을 리턴해준다. ex) 이 경우에는 값이 2
		
		switch (ch) {
		case '1': case '3': msg = "남자"; break;
		case '2': case '4': msg = "여자"; break;
		case '5': msg = "외국인"; break;
		
		default: msg ="잘못 입력한 값"; break;
		}
		// 출력부
		System.out.println("입력하신 ssn은 "+msg+"입니다");

	}

}
