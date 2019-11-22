package java8.bean;

import java.util.List;

public class Student implements Comparable<Student>{
	@Override
	public int hashCode() {
		return name.length();
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
	public Student(String name, int age, List<String> hobbies, int bookCount) {
		super();
		this.name = name;
		this.age = age;
		this.hobbies = hobbies;
		this.bookCount = bookCount;
	}

	private String name;
	private int age;
	private int bookCount;
	public int getBookCount() {
		return bookCount;
	}
	public void setBookCount(int bookCount) {
		this.bookCount = bookCount;
	}

	private List<String> hobbies;
public List<String> getHobbies() {
		return hobbies;
	}
	public void setHobbies(List<String> hobbies) {
		this.hobbies = hobbies;
	}
@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}
public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
public Student(){
	
}
public Student(String name){
	this.name = name;
}

public Student(String name,Integer age){
	this.name = name;
	this.age = age;
}
@Override
public int compareTo(Student o) {
	// TODO Auto-generated method stub
	return this.getName().compareTo(o.getName());
}
	
}
