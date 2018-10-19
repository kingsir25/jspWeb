package imooc.java.season3;

import java.util.Comparator;

public class CourseComparator implements Comparator<Course> {

	@Override
	public int compare(Course o1, Course o2) {
		// TODO Auto-generated method stub
		int rtn = o1.hashCode() - o2.hashCode();
		return rtn;
	}

}
