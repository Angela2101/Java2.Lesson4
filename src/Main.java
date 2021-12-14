import java.util.*;

public class Main {

    public static void main(String[] args) {
        String[] words = {"orange", "apple", "banan", "raspberry", "banan", "raspberry", "banan", "apple", "pear", "pear"};

        // Задание 1
        System.out.println("Cписок уникальных слов");
        Set<String> uniq = new HashSet<>(Arrays.asList(words));
        System.out.println(uniq);
        System.out.println("");

        System.out.println("Количество уникальных слов");
        Map<String, Integer> map = new HashMap<>();
        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        System.out.println(map);
        System.out.println("");

        //Задание 2
        PhoneBook pb = new PhoneBook();

        pb.add("Bobrov", "123");
        pb.add("Sidorov", "456");
        pb.add("Petrov", "789");
        pb.add("Petrov", "789777");

        System.out.println("Список телефонов:");
        System.out.println(pb.get("Petrov"));
        System.out.println(pb.get("Bobrov"));
    }
}
