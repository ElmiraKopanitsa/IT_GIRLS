package kz.kopanitsa.lesson.week6.model;

import java.util.Scanner;

public class WhatWeather {
    private Scanner sc = new Scanner(System.in);

    public void getWhatWeather () {
        System.out.println("Введите температуру: ");
        String stringTemperature = sc.next();
        int temperature = Integer.parseInt(stringTemperature);
        if (temperature < 0) {
            System.out.println("Сейчас очень холодно");
        } else if (temperature == 0 | temperature <= 16) {
            System.out.println("Сейчас прохладно");
        } else {
            System.out.println("Отличный летний денек!");
        }
    }
}
