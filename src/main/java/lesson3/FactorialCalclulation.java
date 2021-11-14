package lesson3;

public class FactorialCalclulation {
    public static void main(String[] args) {
        System.out.println(fuctorial(16));
    }
        public static long fuctorial (long n) {
            if(n == 1){
                return 1;
            }
            return n * fuctorial(n-1);
    }
}
