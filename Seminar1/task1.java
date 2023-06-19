/*Реализуйте 3 метода,чтобы в каждом из них получить разные исключения*/

package Seminar1;

public class task1 {

    public static void main(String[] args) {
        System.out.println(divisionByZero(10, 0));
        int[] arr = new int[10];
        System.out.println(wrongArrayLength(arr, 12));
        notNullPrint(null);
    }

    public static int divisionByZero(int a1, int a2) {
        if (a2 == 0) {
            throw new ArithmeticException("На ноль делить нельзя!");
        }
        return a1 / a2;
    }

    public static int[] wrongArrayLength(int[] arr, int index) {
        if (index > arr.length - 1) {
            throw new ArrayIndexOutOfBoundsException("Такого индекса нет в массиве");
        }
        arr[index] = 10;
        return arr;
    }

    public static void notNullPrint(String s) {
        if (s == null) {
            throw new NullPointerException("текст, не Null");
        }
        System.out.println("Inside method print: " + s);
    }
}
