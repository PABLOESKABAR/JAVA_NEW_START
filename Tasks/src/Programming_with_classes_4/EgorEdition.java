package Programming_with_classes_4;
import java.util.Random;
public class EgorEdition {


    public class Main {
        private static Student arr [] = new Student[10];//инициируем создание массива для списка студентов
        private static Random random = new Random();//создаём объект типа Random
        private static final int size = 10;//приватная неизменная переменная типа интеджер

        public static void main(String[] args) {
            Initialize();//вызов метода
            recordData();//вызов метода
            printSatisfied();//вызов метода
        }

        private static void Initialize(){
            arr = new Student[size];//зачем то инициируем создание ещё одного массива???
            for (int i = 0; i < arr.length; i++){//переборка всех элементов массива студентов
                Student student = new Student();//создаём объект student
                student.name = " Студент: ";//присваиваем имя переменной name в объекте student
                student.num = 1 + random.nextInt(10 - 6);//рандомайзер в диапазоне от 6 до 10
                for (int j = 0; j < arr[i].grade.length; i++){
                    if(i % 2 == 0){
                        student.grade[j] = random.nextInt(9) + 1;
                    } else {
                        student.grade[j] = random.nextInt(10) + 1;
                    }
                }
                student[i] = student;
            }
        }

        public static void recordData(){
            int num = 6+ random.nextInt(10 - 6);
            for (int i = 0; i < arr.length; i++) {
                arr[i] = new Student("Студент:",3, new int [num]);
            }
        }

        public static void printSatisfied(){
            for (int i = 0; i < arr.length; i++) {
                boolean isSatisfied = true;
                for (int j = 0; j < arr[i].grade.length; i++){
                    if(arr[i].grade[j] < 9){
                        isSatisfied = false;
                        break;
                    }
                }
                if(isSatisfied){
                    System.out.println(arr[i].name + arr[i].num);
                }
            }
        }

        static class Student{
            private String name;
            private int num;
            private int[] grade = new int[5];

            public Student(String name, int num, int[] grade) {
                this.name = name;
                this.num = num;
                this.grade = grade;
            }

            public Student(){

            }

            public String toString(){
                return this.name + this.num;
            }
        }
    }
}
