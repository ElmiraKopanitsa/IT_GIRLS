package kz.kopanitsa.lesson.week7.model;
import java.util.*;

public class LinkedListRemover {
    public static void removeEven(LinkedList<Integer> list) {
        Iterator<Integer> iter = list.iterator(); // перебиваем список чисел
        while (iter.hasNext()) { // пока есть следующий элемент не равный null
            if (iter.next() % 2 == 0) { // если текущий элементы четный
                iter.remove(); // удаляем его
            }
        }
    }

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6));
        removeEven(list);
        System.out.println(list);
    }
}
