package lesson4;

public class SquareRoot {
    public static void main(String[] args) {
        System.out.println(sqrt(60));
    }
   public static double sqrt(double number)
    {
        double t = 0.00001; //точность результата
        double s = number;

        while ((s - number / s) > t)
        {
            s = (s + number / s) / 2;
        }
        return s;
    }
}
