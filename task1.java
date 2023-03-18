import java.util.HashMap;
import java.util.Map;

//Создать структуру для хранения Номеров паспортов и Фамилий сотрудников организации.
//
//        123456 Иванов
//
//        321456 Васильев
//
//        234561 Петрова
//
//        234432 Иванов
//
//        654321 Петрова
//
//        345678 Иванов
//
//        Вывести данные по сотрудникам с фамилией Иванов.
public class task1 {
    public static void main(String[] args) {
        Map<Integer, String> passportsData = new HashMap<>();
        passportsData.put(321456, "Васильев");
        passportsData.put(234561, "Петрова");
        passportsData.put(234432, "Иванов");
        passportsData.put(654321, "Петрова");
        passportsData.put(345678, "Иванов");
        for (var number : passportsData.entrySet()) {
            if (number.getValue().equals("Иванов"));
            System.out.printf("%s - %d\n", number.getValue(), number.getKey());
        }
    }
}
