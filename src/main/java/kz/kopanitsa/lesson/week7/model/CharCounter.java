package kz.kopanitsa.lesson.week7.model;
import java.util.*;

public class CharCounter {
    public static void countChars(String s) {
        HashMap<Character, Integer> charCounts = new HashMap<Character, Integer>(); // создаем мап, принимающий символы и числа
        for (char c : s.toCharArray()) { // проходимся по элементам из массива символов, преобразованного из строки
            if (charCounts.containsKey(c)) { // если в мапе есть ключ с таким символом
                charCounts.put(c, charCounts.get(c) + 1); // добавляем в мап символ и его значение +1
            } else { // если в мапе нет ключа с таким символом
                charCounts.put(c, 1); // добавляем в мап символ и 1
            }
        }
        for (char c : charCounts.keySet()) { // проходимся по массиву из ключей мапа
            System.out.println(c + " - " + charCounts.get(c)); // распечатываем ключ и его значение
        }
    }

    public static void main(String[] args) {
        String s = "hello world";
        countChars(s);
    }
}