package kz.kopanitsa.lesson.week11.model;

import java.util.Random;

public class Car implements Runnable {
    private  String name;
    private int position;
    int distance;

    public Car(String name, int distance) {
        this.name = name;
        this.position = 0;
        this.distance = distance;
    }

    public String getName() {
        return name;
    }

    public int getPosition() {
        return position;
    }

    public int getDistance() {
        return distance;
    }

    @Override
    public void run() {
        Random random = new Random();
        int speed;

        while (getPosition() < getDistance()) {
            speed = random.nextInt(5) + 1;
            position += speed;
        }
    }
}
