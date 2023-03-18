//Написать программу, определяющую правильность расстановки скобок в выражении.
//
//        Пример 1: a+(d*3) - истина
//
//        Пример 2: [a+(1*3) - ложь
//
//        Пример 3: [6+(3*3)] - истина

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;
public class task3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите первое выражение");
        String str = input.nextLine();
        input.close();
        System.out.println(isTrue(str));
    }
    public static boolean isTrue(String str){
        Map<Character, Character> vocabulary = new HashMap<>();
        vocabulary.put(')', '(');
        vocabulary.put(']', '[');
        vocabulary.put('}', '{');
        Stack<Character> newStack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            if (vocabulary.containsValue(str.charAt(i))){
                newStack.push(str.charAt(i));
            }
            if (vocabulary.containsKey(str.charAt(i))){
                if ((newStack.isEmpty() || vocabulary.get(str.charAt(i)) != newStack.pop())) return false;
            }
        }
        return newStack.isEmpty();
    }
}
