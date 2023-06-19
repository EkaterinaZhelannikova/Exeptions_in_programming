/*
 * Реализуйте метод, принимающий в качестве аргументов
 * два целочисленных массива, и возвращающий новый массив,
 * каждый элемент которого равен частному элементов
 * двух входящих массивов в той же ячейке. Если длины массивов
 * не равны, необходимо как-то оповестить пользователя.
 * Важно: При выполнении метода единственное исключение,
 * которое пользователь может увидеть - RuntimeException
 */

package Seminar1;

public class task3 {
    public static float[] quotientOfArrays(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            throw new RuntimeException("Длины массивов не равны");
        }
        float[] quotientOfArray = new float[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            quotientOfArray[i] = arr1[i] / arr2[i];
        }
        return quotientOfArray;
    }
}
