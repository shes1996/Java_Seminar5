
//Даны 2 строки, написать метод, который вернет true, если эти строки являются изоморфными и false, если нет.
//        Строки изоморфны, если одну букву в первом слове можно заменить на некоторую букву во втором слове, при этом
//
//        1. повторяющиеся буквы одного слова меняются на одну и ту же букву с сохранением порядка следования.
//        (Например, add - egg изоморфны)
//        2. буква может не меняться, а остаться такой же. (Например, note - code)
//        Пример 1:
//        Input: s = "foo", t = "bar"
//       Output: false
//        Пример 2:
//        Input: s = "paper", t = "title"
//        Output: true
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите первое слово: ");
        String firstWord = input.nextLine();
        System.out.println("Введите второе слово: ");
        String secondWord = input.nextLine();
        input.close();
        System.out.println(isIsomorf(firstWord, secondWord, 1));
    }
    public static Boolean isIsomorf(String str1, String str2, int flag){
        if (str1.length() != str2.length()) return false;
        else {
            Map<Character, Character> newMap = new HashMap<>();
            for (int i = 0; i < str1.length(); i++) {
                if (newMap.containsKey(str1.charAt(i)) && str2.charAt(i) != newMap.get(str1.charAt(i))){
                    return false;
                }
                    else newMap.put(str1.charAt(i), str2.charAt(i));
            }
            if (flag == 1) return isIsomorf(str2, str1, 0);
            return true;
        }
    }
}
