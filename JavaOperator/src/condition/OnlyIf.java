package condition;

public class OnlyIf {

	public static void main(String[] args) {
		
		int x = 1, y = 2;
		if ((x==1) && (y==1)){ // &&(앤퍼센트)라고 읽고 and연산자이다. &&는 둘다 참이어야 출력됨
			System.out.println("x는 1이면서 y도 2이다.");
		}
		if ((x==1) || (y==1)) { // ||(컬럼)이라고 읽고 or연산자이다. ||는 하나만 참이어도 출력됨
			System.out.println("x는 1이거나 y는 2이다.");
			
		}

	}

}
