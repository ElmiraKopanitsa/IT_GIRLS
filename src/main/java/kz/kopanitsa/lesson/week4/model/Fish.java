package kz.kopanitsa.lesson.week4.model;

import kz.kopanitsa.lesson.week4.sevice.Swim;

public class Fish implements Swim {
    @Override
    public void swim() {
        this.itFish();
        System.out.println("Я плаваю, потому что я рыба.");
    }

    private void itFish() {
        System.out.println("Я живу в воде и у меня есть плавники.");
    }
}
