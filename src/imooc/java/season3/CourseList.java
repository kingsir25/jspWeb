package imooc.java.season3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CourseList {
	static List<Course> courses 	= new ArrayList<Course>();
	static void printCourse(){
		System.out.println("ÐòºÅ\t¿Î³ÌID\t¿Î³ÌÃû");
		Collections.sort(courses,new CourseComparator());
		int i = 0;
		for(Course cr : courses) {
			i=i+1;
			System.out.println(String.valueOf(i) + "\t" + cr.id+ "\t" + cr.name+ "\t" + cr.hashCode());
		}
	}

}
