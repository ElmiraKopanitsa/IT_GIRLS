package kz.kopanitsa.lesson.week11.model;

public class ThreadForPrintEvenNumbers implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 10; i += 2) {
            System.out.println(i);
        }
    }
}
