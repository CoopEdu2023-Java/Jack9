

class PolynomialSum {

    public static double iterativePolynomial(double[] a, int n, double x) {
        double sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += a[i] * Math.pow(x, i);
        }
        return sum; 
    }

    public static void main(String[] args) {
        double[] a = {1, 2, 3};
        int n = 2;
        double x = 2;

        double result = iterativePolynomial(a, n, x);
        System.out.println("result : " + result);
    }
}

// class PolynomialSum1 { //递归

//     public static double recursivePolynomial(double[] a, int n, double x) {
//         if(n == 0) {
//             return a[0];
//         }else{
//             return a[n] * Math.pow(x, n) + recursivePolynomial(a, n-1, x);
//         }
//     }

//     public static void main(String[] args) {
//         double[] a = {1, 2, 3}; 
//         int n = 2;
//         double x = 2;

//         double result = recursivePolynomial(a, n, x);
//         System.out.println("result : " + result);
//     }
// }
