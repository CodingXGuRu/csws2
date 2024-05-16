import java.util.Random;
import java.lang.management.ManagementFactory;
import java.lang.management.MemoryMXBean;

public class q6 {
    public static void main(String[] args) {
        MemoryMXBean memoryMXBean = ManagementFactory.getMemoryMXBean();
        Random random = new Random();

        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            String obj = new String("Object_" + i);
            System.out.println("Timestamp: " + (System.currentTimeMillis() - startTime) + " ms");
            System.out.println(
                    "Total Memory: " + memoryMXBean.getHeapMemoryUsage().getCommitted() / (1024 * 1024) + " MB");
            System.out.println("Free Memory: " + memoryMXBean.getHeapMemoryUsage().getUsed() / (1024 * 1024) + " MB");
            System.out.println("--------------------------------------------------");
            try {
                Thread.sleep(random.nextInt(100));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
