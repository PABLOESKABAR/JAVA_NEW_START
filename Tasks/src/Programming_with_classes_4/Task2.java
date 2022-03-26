package Programming_with_classes_4;
/*Создйте класс Test2 двумя переменными. Добавьте конструктор с входными параметрами.
Добавьте конструктор, инициализирующий члены класса по умолчанию. Добавьте set- и get-
методы для полей экземпляра класса.
 */

public class Task2 {
    public static void main(String[] args) {
    Test2 obj = new Test2(1, 3);
    }
    static class Test2{
        int x;
        int y;
        private Test2(){
            x = 123;
            y = 44345;
        }
        private Test2(int x, int y){
            this.x = x;
            this.y = y;
        }
        public int get_x() {
            return x;
        }
        public void set_x(int x) {
            this.x = x;
        }
        public int get_y(){
            return y;
        }
        public void set_y(int y){
            this.y = y;
        }
    }

}
