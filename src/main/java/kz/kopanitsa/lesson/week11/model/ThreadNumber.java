package kz.kopanitsa.lesson.week11.model;

public class ThreadNumber implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i <= 10; i++) {
            System.out.println(Thread.currentThread().getName() + " ---> " + i);
            try {
                Thread.sleep(1000); // Для наглядности задержка
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
