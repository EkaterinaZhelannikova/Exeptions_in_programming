/*
 * Реализуйте метод, который запрашивает у пользователя ввод
 * дробного числа (типа float), и возвращает введенное значение.
 * Ввод текста вместо числа не должно приводить к падению
 * приложения, вместо этого, необходимо повторно запросить
 * у пользователя ввод данных.
 */

package Seminar2;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        inputNumber();
    }

    public static float inputNumber() {
        try {
            Scanner x = new Scanner(System.in);
            System.out.println("Введите дробное число:");
            float num = x.nextFloat();
            System.out.println(num);
            return num;
        } catch (Exception e) {
            System.out.println("Неверный формат данных!");
            inputNumber();
            return 0;
        }
    }

}
