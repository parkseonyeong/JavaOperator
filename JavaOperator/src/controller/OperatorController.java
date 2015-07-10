package controller;

import condition.ArithmeticCalc;
import condition.ManOrWonam;
import condition.SwitchAvg;

public class OperatorController {
	public static void main(String[] args) {
		SwitchAvg avg2 = new SwitchAvg(); // 2015.07.10 Switch문
		//avg2.calc();
		
		ManOrWonam manOrWonam = new ManOrWonam();
		manOrWonam.ssn(); // ssn()은 클래스의 이름이다
	}

}
