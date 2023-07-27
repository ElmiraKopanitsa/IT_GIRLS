package kz.kopanitsa.lesson.week8._main;

import kz.kopanitsa.lesson.week8.model.DifferentSort;
import kz.kopanitsa.lesson.week8.model.Student;

import java.util.ArrayList;
import java.util.List;

public class _Main {

    public static void main (String[] args) {
        Student[] students = {
                new Student("Иванов", 4.5),
                new Student("Петров", 3.7),
                new Student("Сидоров", 4.2),
                new Student("Козлов", 5.0),
                new Student("Смирнов", 3.9)
        };
        DifferentSort sort = new DifferentSort();
        sort.BubbleSort(students);
        for (Student student : students) {
            System.out.println(student.lastName + " " + student.averageScore);
        }

        String[] fruits = {"apple", "orange", "grape", "banana"};
        sort.quickSort(fruits, 0, fruits.length-1);
        for (String fruit : fruits) {
            System.out.print(fruit + " ");
        }

        System.out.println();

        String[] words = {"cat", "orange", "elephant", "bird"};
        sort.mergeSort(words);
        for (String word : words) {
            System.out.print(word + " ");
        }

        System.out.println();

        List<String> words2 = new ArrayList<>(List.of("cat", "orange", "elephant", "bird"));
        sort.insertionSort(words2);
        System.out.println(words2);

        System.out.println();

        String[] formulas = {"5+6+32=43", "1+1=2", "(3+5)*4*21=483", "((21-20)*(32-30))/2=1"};
        sort.selectionSort(formulas);
        for (String formula : formulas) {
            System.out.print(formula + " ");
        }
    }
}
