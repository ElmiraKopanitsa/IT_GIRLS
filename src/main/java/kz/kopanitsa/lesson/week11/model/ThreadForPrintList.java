package kz.kopanitsa.lesson.week11.model;

import java.util.List;

public class ThreadForPrintList implements Runnable {
    private List<Integer> numbers;
    private boolean isEven;

    public ThreadForPrintList(List<Integer> numbers, boolean isEven) {
        this.numbers = numbers;
        this.isEven = isEven;
    }

    @Override
    public void run() {
        for(int number : numbers) {
            if ((number % 2 == 0 && isEven) || (number % 2 != 0 && !isEven)) {
                System.out.println("Поток "+ Thread.currentThread().getName() + " : число " + number);
            }
        }
    }
}
