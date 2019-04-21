package com.ulab.main;

import com.ulab.student.Course;

public class Main {

	public static void main(String[] args) {
		Course math101 = new Course(101, "MAT", "IntroDuction To Computer Science",1);
		System.out.println(math101.getDetail());
	}

}
