package Q4;

public class Student implements Comparable<Student> {
    String name;
    int rn, totalMark;

    Student(String name, int rn, int totalMark) {
        this.name = name;
        this.rn = rn;
        this.totalMark = totalMark;
    }

    @Override
    public int compareTo(Student o) {
        if (this.name == o.name && this.rn == o.rn && this.totalMark == o.totalMark)
            return 0;
        else
            return -1;
    }

    public static void findStudent(Student arr[], Student target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].compareTo(target) == 0)
                System.out.println("Student details present at:" + i);
        }
    }

    public static void main(String[] args) {

        Student s1 = new Student("ayona", 03, 30);
        Student s2 = new Student("sid", 26, 29);
        Student s3 = new Student("sonu", 33, 35);
        Student s4 = new Student("mayank", 44, 33);
        Student s5 = new Student("shub", 32, 31);

        Student target = new Student("shubh", 26, 29);

        Student students[] = { s1, s2, s4, s3, s5 };

        findStudent(students, target);
    }

}