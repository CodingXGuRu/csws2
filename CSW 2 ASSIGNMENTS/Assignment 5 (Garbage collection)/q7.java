import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.lang.management.ManagementFactory;
import java.lang.management.MemoryMXBean;
import java.lang.management.MemoryUsage;

public class q7 {
    public static void main(String[] args) {
        MemoryMXBean memoryMXBean = ManagementFactory.getMemoryMXBean();
        Runtime runtime = Runtime.getRuntime();
        List<Student> students = new ArrayList<>();

        for (int i = 0; i < 10000; i++) {
            students.add(new Student("Student_" + i, "Course_" + i));
            System.out.println("Timestamp: " + System.currentTimeMillis());
            System.out.println("Total Memory: " + runtime.totalMemory() / (1024 * 1024) + " MB");
            System.out.println("Free Memory: " + runtime.freeMemory() / (1024 * 1024) + " MB");
            System.out
                    .println("Used Memory: " + (runtime.totalMemory() - runtime.freeMemory()) / (1024 * 1024) + " MB");
            System.out.println("--------------------------------------------------");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.gc();
    }
}

class Student {
    private String name;
    private String course;

    public Student(String name, String course) {
        this.name = name;
        this.course = course;
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("Student " + name + " has been garbage collected.");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
}
