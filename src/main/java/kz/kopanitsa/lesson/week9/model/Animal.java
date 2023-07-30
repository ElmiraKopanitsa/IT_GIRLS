package kz.kopanitsa.lesson.week9.model;

import java.util.List;
import java.util.Optional;

public class Animal {
    public String name;
    public Integer age;

    public Animal(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return name + " " + age;
    }

    public static Optional<Animal> findAnimal (List<Animal> animals, String name) {
        Optional<Animal> foundAnimal = animals.stream().filter(animal -> animal.getName().equalsIgnoreCase(name)).findAny();
        if (foundAnimal.isPresent()) {
            return foundAnimal;
        } else {
            throw new IllegalArgumentException("В списке отсутствует " + name);
        }
    }

    public static long countAnimal (List<Animal> animals, int age) {
        return animals.stream().filter(animal -> animal.getAge() > 4).count();
    }
}
