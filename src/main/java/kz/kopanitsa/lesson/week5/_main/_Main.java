package kz.kopanitsa.lesson.week5._main;

import kz.kopanitsa.lesson.week5.model.Bear;
import kz.kopanitsa.lesson.week5.model.Monkey;
import kz.kopanitsa.lesson.week5.model.Snake;
import kz.kopanitsa.lesson.week5.model.Zookeeper;

public class _Main {

    public static void main (String[] args) {
        Zookeeper zookeeper = new Zookeeper();
        Bear bear = new Bear();
        Snake snake = new Snake();
        Monkey monkey = new Monkey();

        zookeeper.makeSound(bear);
        zookeeper.makeSound(snake);
        zookeeper.makeSound(monkey);
        zookeeper.UseBreathe(bear);
        zookeeper.UseBreathe(snake);
        zookeeper.UseBreathe(monkey);
    }

}
