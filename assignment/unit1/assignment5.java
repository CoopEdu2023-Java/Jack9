public class assignment5 {

    public static void main(String[] args) {
        printMultiplicationTable(9); // 这里可以根据需要更改乘法表的最大数字
    }

    public static void printMultiplicationTable(int max) {
        for (int i = 1; i <= max; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " * " + i + " = " + (i * j) + "\t");
            }
            System.out.println(); // 换行
        }
    }
}
