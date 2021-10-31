package first;

import java.util.Scanner;

public class task_1_1_1 {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        System.out.println("Введите значение а");
        double a = console.nextInt();
        System.out.println("Введите значение b");
        double b = console.nextInt();
        System.out.println("Введите значение c");
        double c = console.nextInt();
        double z = (((a-3)*b)/2)+c;
        System.out.println("Значение z = " + z);

    }
}
