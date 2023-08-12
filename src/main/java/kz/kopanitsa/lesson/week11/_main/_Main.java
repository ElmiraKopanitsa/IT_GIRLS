package kz.kopanitsa.lesson.week11._main;

import kz.kopanitsa.lesson.week11.model.*;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class _Main {
    public static void main (String[] args) {
        // Напишите программу, которая создает два потока, каждый из которых выводит на экран числа от 1 до 10.
        // Но при этом первый поток должен выводить только четные числа, а второй - только нечетные.
        Thread evenNumbers = new Thread(new ThreadForPrintEvenNumbers());
        Thread oddNumbers = new Thread(new ThreadForPrintOddNumbers());

        evenNumbers.start();
        oddNumbers.start();

        // Напишите программу, которая создает два потока и выводит на экран числа от 1 до 10,
        // сначала из первого потока, затем из второго потока.
        // Каждое число должно быть выведено в формате "Поток X: число Y",
        // где X - номер потока (1 или 2), а Y - число от 1 до 10.
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        Thread thread1 = new Thread(new ThreadForPrintList(numbers, false));
        Thread thread2 = new Thread(new ThreadForPrintList(numbers, true));

        thread1.start();
        thread2.start();

        // Создайте программу, которая считает сумму квадратов первых N натуральных чисел, используя многопоточность.
        int N = 9;
        int i = 0;
        while (i < (N + 1)) {
            Thread iThread = new Thread(new PrintSquareNumbers(i));
            iThread.start();
            i++;
        }

        // Создайте программу, которая будет имитировать гонки на машине.
        // У вас есть две машины, каждая из которых может двигаться со случайной скоростью
        // в диапазоне от 1 до 5 метров в секунду.
        // Заезд должен начинаться одновременно для обеих машин, и победитель определяется той машиной,
        // которая пройдет заранее заданное расстояние.
        Car car1 = new Car("Car1", 1000);
        Car car2 = new Car("Car2", 1000);

        Thread threadCar1 = new Thread(car1);
        Thread threadCar2 = new Thread(car2);

        threadCar1.start();
        threadCar2.start();

        try {
            threadCar1.join();
            threadCar2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        if (car1.getPosition() >= car1.getDistance() && car2.getPosition() >= car2.getDistance()) {
            System.out.println("Ничья.");
        } else if (car1.getPosition() >= car1.getDistance()) {
            System.out.println(car1.getName() + " победил!");
        } else {System.out.println(car2.getName() + " победил!");}

        // Напишите программу на Java, которая создает два потока: "Поток 1" и "Поток 2".
        // Каждый поток должен выводить своё имя в консоль 10 раз с интервалом в 1 секунду.
        // при этом "Поток 1" должен начать свою работу первым и закончить последним,
        // а "Поток 2" - наоборот: начать последним и закончить первым.

        Thread threadNumber1 = new Thread(new ThreadNumber());
        Thread threadNumber2 = new Thread(new ThreadNumber());

        threadNumber1.start();
        threadNumber2.start();

    }
}
