package imooc.java.season3;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class StudentMap {
	static Map<String, Student> students = new HashMap<String, Student>();

	static void printStudents() {
		System.out.println("序号\t学生ID\t学生名");
		int i = 0;
		for (Student st : students.values()) {
			i = i + 1;
			System.out.println(String.valueOf(i) + "\t" + st.id + "\t" + st.name);
		}
	}

	static void printCourses() {
		for (Student st : students.values()) {

			if (st.cousrses.isEmpty()) {
				System.out.println("学生：" + st.name + "选修课程无");
			} else {
				System.out.println("学生：" + st.name + "选修课程有：");
				for (Course cr : st.cousrses) {
					System.out.println(cr.name);
				}
			}
		}
	}
}
