package kz.kopanitsa.lesson.week5.model;

public class Snake extends Animal{

    @Override
    public void sound() {
        System.out.println("Я змея и меня слышат только наследники Слизерина");
    }

    @Override
    public void breathe() {
        System.out.println("Я змея и вы не замечаете, как я дышу.");
    }
}
