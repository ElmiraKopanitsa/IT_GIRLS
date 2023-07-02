package kz.kopanitsa.lesson.week5.model;

public class Monkey extends Animal{

    @Override
    public void sound() {
        System.out.println("Я обезьяна издаю как можно больше звуков, чтобы однажды как и ты научиться говорить.");
    }

    @Override
    public void breathe() {
        super.breathe();
        System.out.println("Однако, чаще я храплю после вкусного обеда.");
    }
}
