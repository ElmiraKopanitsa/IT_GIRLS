package kz.kopanitsa.lesson.week4._main;

import kz.kopanitsa.lesson.week4.model.Fish;
import kz.kopanitsa.lesson.week4.model.Ship;
import kz.kopanitsa.lesson.week4.sevice.SwimAction;

public class Main {
    public static void main(String[] args) {
        Fish fish = new Fish();
        Ship ship = new Ship();
        SwimAction swimAction = new SwimAction();

        swimAction.swim(fish);
        swimAction.swim(ship);
    }
}