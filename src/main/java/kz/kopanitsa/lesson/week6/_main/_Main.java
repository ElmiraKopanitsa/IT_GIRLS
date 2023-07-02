package kz.kopanitsa.lesson.week6._main;

import kz.kopanitsa.lesson.week6.model.DayOfWeek;
import kz.kopanitsa.lesson.week6.model.Factorial;
import kz.kopanitsa.lesson.week6.model.IsEvenNumber;
import kz.kopanitsa.lesson.week6.model.WhatWeather;

public class _Main {
    public static void main(String[] args) {
        // задание №1
        WhatWeather whatWeather = new WhatWeather();
        whatWeather.getWhatWeather();
        // задание №2
        IsEvenNumber isEvenNumber = new IsEvenNumber();
        isEvenNumber.isEven();
        // задание №3
        DayOfWeek sunday = new DayOfWeek();
        sunday.dayOfWeek();
        // задание №4
        int result = 1;
        while (result < 257) {
            result *= 2;
            System.out.print(result + " ");
        }
        int number = 1;
        do {
            number *= 2;
            System.out.print(number + " ");
        }
        while (number < 257);

        // задание №5
        Factorial factorial = new Factorial();
        System.out.println(factorial.getFactorial());
    }
}
