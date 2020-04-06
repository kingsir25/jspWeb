package imooc.java.season3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class SelectTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Course[] courses  = 	{ new Course("A001", "JAVA"), new Course("A002", "COBOL"), new Course("A003", "Python")};
		Student[] students  = 	{ new Student("2018006", "����"), new Student("2018002", "����"), new Student("2018003", "����")};
		//
		CourseList.courses.addAll(Arrays.asList(courses));
		CourseList.printCourse();
		//
		Map<String, Student> stMap = new HashMap<String, Student>(); 
		for(Student st:students) {
			stMap.put(st.id, st);
		}
		StudentMap.students.putAll(stMap);
		StudentMap.printStudents();
		
		Scanner console = new Scanner(System.in);
//		System.out.println("������ѧ��ID:");
//		String strKey = console.next();
//		while(!strKey.equals("")){
//			//String strKey = String.valueOf(i);
//			if(StudentMap.students.containsKey(strKey)) {
//				System.out.println(StudentMap.students.get(strKey).name);
////				Set<Student> coursesSet = new HashSet<Student>();
////				coursesSet.addAll(new HashSet(CourseList.courses));
//				StudentMap.students.get(strKey).cousrses.addAll(new HashSet(CourseList.courses));
//				StudentMap.printCourses();
//				strKey = console.next();
//			}
//		}
		
		System.out.println("������ѧ������:");
		String strValue = console.next();
		while(!strValue.equals("")){
			//String strKey = String.valueOf(i);
			if(StudentMap.students.containsValue(new Student(null, strValue))) {
				System.out.println(strValue + "�����б���");
				
			}else {
				System.out.println(strValue + "�б��в����ڣ�");
			}
			strValue = console.next();
		}
	}

}
