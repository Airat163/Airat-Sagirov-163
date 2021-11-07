package lesson2;

public class SecondProgram {

    public static void main(String[] args) {
        System.out.println("Привет, мир!");

        int summa1 = calculate(65, 38);
        System.out.println(summa1);

        int summa2 = calculate(33, 7);
        System.out.println(summa2);

        int summa3 = Newcalculate(3, 5, 8);
        System.out.println(summa3);

        // формула Ома
        int summa4 = FormulaOma(240, 40);
        System.out.println(summa4);
    }

    public static int calculate(int arg1, int arg2) {
        int result = arg1 + arg2;
        return result;
    }

    public static int Newcalculate(int arg3, int arg4, int arg5) {

        int result = arg3 + arg4 - arg5 * 3;
        return result;
    }

    // Формула ома:  I= U/R
    public static int FormulaOma(int U, int R) {
        int I = U/R;
        return I;
    }
}