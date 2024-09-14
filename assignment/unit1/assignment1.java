package assignment.unit1;

public class assignment1 {
        public static void main(String[] args) {
            String a = "hello";
            String b = "hello";
    
            if (areStringsEqual(a, b)) {
                System.out.println("The strings are the same.");
            } else {
                System.out.println("The strings are different.");
            }
        }
    
        public static boolean areStringsEqual(String a, String b) {
            return a.equals(b);
        }
    }
    
    
