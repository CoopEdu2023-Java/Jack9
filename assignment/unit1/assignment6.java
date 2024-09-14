import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class assignment6 {
    public static void main(String[] args) {
        Integer[] numbers = {1, 1, 2, 2, 3, 3};
        int thirdLargest = findThirdLargest(numbers);
        
        if (thirdLargest != Integer.MIN_VALUE) {
            System.out.println("The third largest number is: " + thirdLargest);
        } else {
            System.out.println("The list does not have a third distinct largest number.");
        }
    }

    public static int findThirdLargest(Integer[] numbers) {
        Set<Integer> distinctNumbers = new HashSet<>(Arrays.asList(numbers));
        List<Integer> sortedList = Arrays.asList(distinctNumbers.toArray(new Integer[0]));
        Collections.sort(sortedList, Collections.reverseOrder());

        if (sortedList.size() < 3) {
            return Integer.MIN_VALUE;  // 表示没有第三大数
        } else {
            return sortedList.get(2);
        }
    }
}
