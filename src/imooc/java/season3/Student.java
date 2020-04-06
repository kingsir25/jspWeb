package imooc.java.season3;

import java.util.HashSet;
import java.util.Set;

public class Student {
	String id;
	String name;
//	Course[] courses;
	Set<Course> cousrses;
	Student(String id, String name) {
		this.id=id;
		this.name=name;
		this.cousrses = new HashSet<Course>();
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	Student() {}

}
