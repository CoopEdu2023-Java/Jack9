import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class assignment4_3_3 {
    public static List<Integer> sleepSortAndPrint(int[] nums) throws InterruptedException {
        List<Integer> sortednumbers = new ArrayList<>();
        List<Thread> threads = new ArrayList<>();
        for (int num : nums) {
            Thread t = new Thread(() -> {
                try {
                    Thread.sleep(num); // Sleep for a duration based on the number
                    System.out.println(num);
                    sortednumbers.add(num);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
            t.start();
            threads.add(t);
        }
        for(Thread t : threads){
            t.join();
        }
        return sortednumbers;
    }

    public static void main(String[] args) throws InterruptedException {
        int[] nums = {3, 1, 4, 1, 5, 9};
        List<Integer> numbers = sleepSortAndPrint(nums);
        System.out.println(numbers);
    }
}
