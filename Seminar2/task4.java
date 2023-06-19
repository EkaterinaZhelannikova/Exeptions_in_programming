/*
Разработайте программу, которая выбросит Exception, когда пользователь
вводит пустую строку. Пользователю должно показаться сообщение, что пустые
строки вводить нельзя.
*/

package Seminar2;

import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        try {
            System.out.println("Вы ввели строку: " + getString());
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

    }

    public static String getString() {
        Scanner inputScanner = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String userString = inputScanner.nextLine();
        if (userString == "") {
            throw new RuntimeException("Строка не должна быть пустой!");
        }
        return userString;
    }
}
