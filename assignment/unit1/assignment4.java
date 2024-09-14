import java.util.Scanner;

public class assignment4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the height (number of rows): ");
        int n = scanner.nextInt();
        
        // 打印上半部分
        for (int i = 1; i <= n; i++) {
            // 打印空格
            for (int j = n - i; j > 0; j--) {
                System.out.print(" ");
            }
            // 打印星号
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println(); // 换行
        }

        // 打印下半部分
        for (int i = n - 1; i > 0; i--) {
            // 打印空格
            for (int j = n - i; j > 0; j--) {
                System.out.print(" ");
            }
            // 打印星号
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println(); // 换行
        }

        scanner.close();
    }
}
