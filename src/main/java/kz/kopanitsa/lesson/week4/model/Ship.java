package kz.kopanitsa.lesson.week4.model;

import kz.kopanitsa.lesson.week4.sevice.Swim;

public class Ship implements Swim {
    @Override
    public void swim() {
        this.itShip();
        System.out.println("Я плавая, потому что я корабль.");
    }

    private void itShip() {
        System.out.println("Меня построили люди, чтобы плавать по воде.");
    }
}
