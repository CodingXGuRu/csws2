package Q5;

public class Main {
    public static void main(String[] args) {

        college c1 = new college("IIT", "Bhubaneswar");
        college c2 = new college("MUJ", "Bombay");

        student s1 = new Student("Sk", 06, c1);
        student s2 = new Student("mayank", 58, c2);

        s1.displayStudentInfo();
        System.out.println();
        s2.displayStudentInfo();

    }

}