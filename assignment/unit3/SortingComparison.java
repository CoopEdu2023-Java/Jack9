import java.util.Arrays;
import java.util.Random;

public class SortingComparison {
    public static void main(String[] args) {
        int size = 1000000;  // 数组大小
        int[] array = new int[size];
        Random rand = new Random();

        // 随机填充数组
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(size);
        }

        // 复制数组，保证每种排序算法使用相同的输入
        int[] bubbleSortArray = Arrays.copyOf(array, array.length);
        int[] selectionSortArray = Arrays.copyOf(array, array.length);
        int[] quickSortArray = Arrays.copyOf(array, array.length);

        // 冒泡排序
        long startTime = System.currentTimeMillis();
        bubbleSort(bubbleSortArray);
        long endTime = System.currentTimeMillis();
        System.out.println("冒泡排序耗时: " + (endTime - startTime) + " 毫秒");

        // 选择排序
        startTime = System.currentTimeMillis();
        selectionSort(selectionSortArray);
        endTime = System.currentTimeMillis();
        System.out.println("选择排序耗时: " + (endTime - startTime) + " 毫秒");

        // 快速排序（Arrays.sort()）
        startTime = System.currentTimeMillis();
        quickSort(quickSortArray, 0, quickSortArray.length - 1);
        endTime = System.currentTimeMillis();
        System.out.println("快速排序耗时: " + (endTime - startTime) + " 毫秒");
    }

    // 冒泡排序实现
    public static void bubbleSort(int[] arr) {
        boolean swapped;
        for (int i = 0; i < arr.length - 1; i++) {
            swapped = false;
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // 交换arr[j]和arr[j + 1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            // 如果在这一轮没有发生交换，说明数组已经有序，提前退出
            if (!swapped) break;
        }
    }

    // 选择排序实现
    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIdx]) {
                    minIdx = j;  // 找到最小值的下标
                }
            }
            // 交换找到的最小值和当前的i位置的值
            int temp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = temp;
        }
    }

      // method to find the partition position
  static int partition(int array[], int low, int high) {
    
    // choose the rightmost element as pivot
    int pivot = array[high];
    
    // pointer for greater element
    int i = (low - 1);

    // traverse through all elements
    // compare each element with pivot
    for (int j = low; j < high; j++) {
      if (array[j] <= pivot) {

        // if element smaller than pivot is found
        // swap it with the greater element pointed by i
        i++;

        // swapping element at i with element at j
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
      }

    }

    // swap the pivot element with the greater element specified by i
    int temp = array[i + 1];
    array[i + 1] = array[high];
    array[high] = temp;

    // return the position from where partition is done
    return (i + 1);
  }

  static void quickSort(int array[], int low, int high) {
    if (low < high) {

      // find pivot element such that
      // elements smaller than pivot are on the left
      // elements greater than pivot are on the right
      int pi = partition(array, low, high);
      
      // recursive call on the left of pivot
      quickSort(array, low, pi - 1);

      // recursive call on the right of pivot
      quickSort(array, pi + 1, high);
        }
    }
}
