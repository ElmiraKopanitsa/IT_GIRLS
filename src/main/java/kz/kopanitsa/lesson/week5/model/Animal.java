package kz.kopanitsa.lesson.week5.model;

public abstract class Animal {
    public abstract void sound ();

    public void breathe() {
        System.out.println("Я животное, поэтому я дышу.");
    }
}
