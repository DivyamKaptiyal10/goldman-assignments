package java8.bean;

import java.util.List;

public class Student {
	public Student(String name, int age, List<String> hobbies) {
		super();
		this.name = name;
		this.age = age;
		this.hobbies = hobbies;
	}

	private String name;
	private int age;
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
	
}
