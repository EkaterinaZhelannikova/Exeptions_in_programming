/*
Дан следующий код, исправьте его там, где требуется
public static void main(String[] args) throws Exception {
   try {
       int a = 90;
       int b = 3;
       System.out.println(a / b);
       printSum(23, 234);
       int[] abc = { 1, 2 };
       abc[3] = 9;
   } catch (Throwable ex) {
       System.out.println("Что-то пошло не так...");
   } catch (NullPointerException ex) {
       System.out.println("Указатель не может указывать на null!");
   } catch (IndexOutOfBoundsException ex) {
       System.out.println("Массив выходит за пределы своего размера!");
   }
}
public static void printSum(Integer a, Integer b) throws FileNotFoundException {
   System.out.println(a + b);
}
*/

package Seminar2;

public class task3 {
    public static void main(String[] args) throws Exception {
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = { 1, 2 };
            abc[1] = 9;
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        } catch (Throwable ex) {
            System.out.println("Что-то пошло не так...");
        }
    }

    public static void printSum(Integer a, Integer b) {
        System.out.println(a + b);
    }

}

/*
 * 1. Перемещено исключение Throwable в конец исключений, для вызова
 * исключений, которые являются наследниками этого класса.
 * 2. Исправлен индекс в выражении abc[3] = 9 на abc[1] = 9, т.к. срабатывает
 * исключение IndexOutOfBoundsException.
 * 3. В методе printSum заданное исключение FileNotFoundException не
 * подходит под содержание метода, т.к. метод не работает с файлами.
 * 4. NullPointerException - исключение, которое ни к чему неприменимо.
 */
