package lesson5;

import java.util.Scanner;

public class Phibanachi {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
       {
            System.out.print("Введите число для вычисления значения в последовательности Фибоначчи: ");
            int value = in.nextInt();
            Phib(value);
        }

    }
        public static void Phib(int number) {
        int f1 = 1;
        int f2 = 1;
        int f3;
        System.out.print("Ваш результат = ");
        System.out.print(f1 + " " + f2 + " ");

        for (int a = 3; a <= number; a++) {
            f3 = f1 + f2;
            System.out.print(f3 + " ");
            f1 = f2;
            f2 = f3;
        }
        }
}
