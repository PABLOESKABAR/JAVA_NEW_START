package Programming_with_classes_4;
/*Создайте класс Test1 двумя переменными. Добавьте метод вывода на экран и методы изменения этих
переменных. Добавьте метод, который находит сумму значений этих переменных, и метод, который находит
наибольшее значение из этих двух переменных.
 */
public class Task1 {
    public static void main(String[] args) {
        System.out.println(Test1.max(12, 2));

       // Test1.printVer(44, 334);
    }
    class Test1{
        protected int x = 5;
        protected int y = 4;
        static void printVer(int a, int b){
            System.out.println("Veribles" + a + " " + b);
        }
        static int summ(int a, int b){
            return a+b;
        }
        static int max(int a, int b){
            if (a>b){
                return a;
            }else{
                return b;
            }

        }

    }
}
