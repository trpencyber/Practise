package number_practise;

public class factorial {

    static int factorial(int n) {
        if(n == 0) {
            return 1;          // fill this
        }
        return n * factorial(n-1);  // ✅ correct!
    }

    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
}