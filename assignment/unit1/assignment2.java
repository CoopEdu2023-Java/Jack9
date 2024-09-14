import java.util.Scanner;

public class assignment2{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = in.nextInt();

        if (number < 2) {
            System.out.println("不是质数");
        } else if (test(number)) {
            System.out.println("是质数");
        } else {
            System.out.println("不是质数");
        }
    }
    public static boolean test(int number){
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}