package condition;

public class WhileLoopMain2 {

	public static void main(String[] args) {
		int idx = 0;
		while (true) { // 무한루프 사용 선언
			idx++;
			System.out.print( idx +"\t" );
			
			if ( idx == 10) {
				break;
			}
		}

	}

}
