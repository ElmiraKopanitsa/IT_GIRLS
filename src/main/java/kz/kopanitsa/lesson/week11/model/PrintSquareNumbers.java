package kz.kopanitsa.lesson.week11.model;

public class PrintSquareNumbers implements Runnable {
    private int number;

    public PrintSquareNumbers(Integer number) {
        this.number = number;
    }
    @Override
    public void run() {
        System.out.println("Поток " + Thread.currentThread().getName() + ": квадрат " + number + " равен " + number*number);
    }
}

