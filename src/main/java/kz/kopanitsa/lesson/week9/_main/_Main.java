package kz.kopanitsa.lesson.week9._main;

import kz.kopanitsa.lesson.week9.model.Animal;

import java.util.*;
import java.util.stream.Collectors;

import static kz.kopanitsa.lesson.week9.model.Animal.countAnimal;
import static kz.kopanitsa.lesson.week9.model.Animal.findAnimal;

public class _Main {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal("cow", 1));
        animals.add(new Animal("pig", 2));
        animals.add(new Animal("cat", 3));
        animals.add(new Animal("dog", 4));
        animals.add(new Animal("duck", 5));
        animals.add(new Animal("tiger", 6));
        animals.add(new Animal("zebra", 7));
        animals.add(new Animal("elephant", 8));
        animals.add(new Animal("hippo", 9));
        animals.add(new Animal("horse", 10));

        // Если в коллекции есть лев, то выведите его возраст, если нет - выбросите исключение IllegalArgumentException
        try {
            Optional<Animal> lion = findAnimal(animals, "lion");
            if (lion.isPresent()) {
                Animal lion1 = lion.get();
                System.out.println("Возраст льва - " + lion1.getAge() + " лет.");
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
        // Выведите на экран всех животных из коллекции в порядке возрастания их возраста
        List<Animal> animalsSort = animals.stream().sorted(Comparator.comparingInt(Animal::getAge)).collect(Collectors.toList());
        for (Animal animal : animalsSort) {
            System.out.println(animal.getName() + " - " + animal.getAge() + " years old");
        }
        // Посчитайте сколько животных в коллекции, у которых возраст больше 4
        long countAnimal = countAnimal(animals, 4);
        System.out.println("В списке " + countAnimal + " животных страше 4 лет. ");
        //Создайте Map из коллекции животных. Ключ - название животного, значение - экземпляр животного.
        // Выведите все пары ключ-значение в консоль
        Map<String, List<Animal>> animalsMap = animals.stream()
                .collect(Collectors.groupingBy(Animal::getName));

        animalsMap.forEach((key, value) -> System.out.println("Key: " + key + ", Value: " + value.toString()));
        // Выведите названия всех животных одной строкой (используйте reduce())
        String allNames = animals.stream()
                .map(Animal::getName)
                .reduce("", (accumulator, name) -> accumulator.isEmpty() ? name : accumulator + ", " + name);

        System.out.println(allNames);
    }
}
