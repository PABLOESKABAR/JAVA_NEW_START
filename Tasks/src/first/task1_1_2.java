package first;
import java.util.Scanner;
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class task1_1_2 {
    public static void main(String[] args) {


        Scanner console = new Scanner(System.in);
        System.out.println("Введите значение а");
        double a = console.nextInt();
        System.out.println("Введите значение b");
        double b = console.nextInt();
        System.out.println("Введите значение c");
        double c = console.nextInt();
        double z = (b + sqrt(pow(b, 2)+4*a*c))/(2*a) - (pow(a, 3)*c) + (sqrt(b));
        System.out.println("Значение z = " + z);
    }
}
