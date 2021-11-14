package lesson3;

public class StandardPrimitives {
    public static void main(String[] args) {

        double a, b, c;
        double x1, x2;
        a = 1;
        b = -13;
        c = 36;

        double Discrimenant = b * b - 4 * a * c;

        if (a == 0) {
            System.out.println("Первый коэффицент не может быть 0");
        } else if (Discrimenant < 0) {
            System.out.println("Нет действительных решений уравнения");
        } else if (Discrimenant == 0) {
            x1 = (-b) / (2 * a);
            System.out.printf("Уравнение имеет один единственный корень x1 = %s",x1);
        } else if (Discrimenant > 0) {
             x1 = (-b + Math.sqrt(Discrimenant)) / (2 * a);
             x2 = (-b - Math.sqrt(Discrimenant)) / (2 * a);
            System.out.printf("Уравнение имеет два единственных корня x1 = %s, x2 = %s",x1,x2);
        }

    }
}

