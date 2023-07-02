package kz.kopanitsa.lesson.week6.model;

import java.util.Scanner;

public class IsEvenNumber {
    private Scanner sc = new Scanner(System.in);

    public void isEven() {
        System.out.println("Введите целое число: ");
        int number = Integer.parseInt(sc.next());
        String result = (number % 2 == 0) ? "Введенное число четное." : "Введенное число нечетное.";
        System.out.println(result);
    }
}
