package com.ulab.main;

import java.util.Date;


public class Main {

	public static void main(String[] args) {
		Student tony = new Student();
		tony.setDOB(9, 3, 1997);
		tony.show();
		Faculty tng = new Faculty();
		tng.setDOB(25, 12, 1995);
		tng.show();
	}

}
