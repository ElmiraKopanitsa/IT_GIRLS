package kz.kopanitsa.lesson.week8.model;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class DifferentSort {

    public void BubbleSort (Student[] students) {
        for (int i = 0; i < students.length - 1; i++) {
            for(int j = 0; j < students.length - i - 1; j++) {
                if(students[j + 1].getAverageScore() < students[j].getAverageScore()) {
                    Double containerAverageScore = students[j].getAverageScore();
                    String containerLastName = students[j].getLastName();
                    students[j].setAverageScore(students[j + 1].getAverageScore());
                    students[j].setLastName(students[j + 1].getLastName());
                    students[j + 1].setAverageScore(containerAverageScore);
                    students[j+1].setLastName(containerLastName);
                }
            }
        }
    }

    public void quickSort(String[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high);
            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    private int partition(String[] arr, int low, int high) {
        String pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j].compareTo(pivot) <= 0) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return i + 1;
    }

    private void swap(String[] arr, int i, int j) {
        String temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public void mergeSort(String[] arr) {
        if (arr == null || arr.length <= 1) {
            return;
        }

        int middle = arr.length / 2;
        String[] left = Arrays.copyOfRange(arr, 0, middle);
        String[] right = Arrays.copyOfRange(arr, middle, arr.length);

        mergeSort(left);
        mergeSort(right);

        merge(arr, left, right);
    }

    private void merge(String[] arr, String[] left, String[] right) {
        int i = 0, j = 0, k = 0;
        while (i < left.length && j < right.length) {
            if (left[i].length() < right[j].length()) {
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
            }
        }
        while (i < left.length) {
            arr[k++] = left[i++];
        }
        while (j < right.length) {
            arr[k++] = right[j++];
        }
    }

    public void insertionSort(List<String> words) {
        for (int i = 1; i < words.size(); i++) {
            String currentWord = words.get(i);
            int j = i - 1;
            while (j >= 0 && countVowels(words.get(j)) > countVowels(currentWord)) {
                words.set(j + 1, words.get(j));
                j--;
            }

            words.set(j + 1, currentWord);
        }
    }

    private int countVowels(String word) {
        int count = 0;
        for (char ch : word.toLowerCase().toCharArray()) {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        return count;
    }

    public void selectionSort(String[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (getComplexity(arr[j]) < getComplexity(arr[minIndex])) {
                    minIndex = j;
                }
            }
            swap(arr, i, minIndex);
        }
    }

    private int getComplexity(String formula) {
        int complexity = 0;
        for (char c : formula.toCharArray()) {
            if (isOperator(c)) {
                complexity++;
            }
        }
        return complexity;
    }

    private boolean isOperator(char c) {
        return c == '+' || c == '-' || c == '*' || c == '/';
    }
}
