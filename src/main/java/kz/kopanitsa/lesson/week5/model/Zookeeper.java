package kz.kopanitsa.lesson.week5.model;

public class Zookeeper {
    public void makeSound(Animal animal) {
        System.out.println("Сейчас я слышу: ");
        animal.sound();
    }

    public void UseBreathe(Animal animal) {
        System.out.println("\nЯ смотритель и я ухаживаю за животным пока оно дышит.");
        animal.breathe();
    }

}
