package Q1;

public class Student<shubh> {
	T name, rollNo, age;

	public Student(shubh name, shubh rollNo, T age) {
		this.name = name;
		this.rollNo = rollNo;
		this.age = age;
	}

	public String toString() {
		return "Name: " + name + ", Roll No: " + rollNo + ", Age: " + age;
	}
}