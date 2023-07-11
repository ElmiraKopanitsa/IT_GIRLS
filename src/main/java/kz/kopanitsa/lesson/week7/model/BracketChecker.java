package kz.kopanitsa.lesson.week7.model;
import java.util.*;

public class BracketChecker {
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>(); // создаем стек, который принимает символы
        for (char c : s.toCharArray()) { // проходимся по элементам массива символов, преобразованного из строки
            if (c == '(' || c == '[' || c == '{') { // если символ - открывающаяся скобка
                stack.push(c); // добавляем его в стек
            } else if (c == ')' && !stack.isEmpty() && stack.peek() == '(') { // если символ - закрывающаяся скобка и стек не пустой и в нем есть такая же открывающаяся скобка
                stack.pop(); // удаляем символ из стека (ранее добавленную открывающуюся скобку)
            } else if (c == ']' && !stack.isEmpty() && stack.peek() == '[') {
                stack.pop();
            } else if (c == '}' && !stack.isEmpty() && stack.peek() == '{') {
                stack.pop();
            } else {
                return false;
            }
        }
        return stack.isEmpty(); // возвращает true, если стек пустой
    }

    public static void main(String[] args) {
        String s1 = "()";
        String s2 = "()[]{}";
        String s3 = "(]";
        String s4 = "([)]";
        System.out.println(isValid(s1)); // true
        System.out.println(isValid(s2)); // true
        System.out.println(isValid(s3)); // false
        System.out.println(isValid(s4)); // false
    }
}