package lesson4;

import java.util.*;

public class Task1 {
    public static void main(String[] args) {
        String[] words = {"один", "два", "три", "три", "два", "четыре", "три", "четыре", "пять", "ноль"};

        // сколько раз встречается каждое слово
        Map<String, Integer> map = new HashMap<>();
        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        System.out.println(map);
        System.out.println("*** ********* ***");

        // список уникальных слов, из которых состоит массив (дубликаты не считать)
        Set<String> uniq = new HashSet<>(Arrays.asList(words));
        System.out.println(uniq);
        System.out.println("*** ********* ***");

        // телефонный справочник в случае с повтором фамилии (однофамильцы) выводит все номера телефонов
        Phonebook pb = new Phonebook();

        pb.add("Familiya1", "8-985-758-63-24");
        pb.add("Familiya1", "8-985-425-68-32");
        pb.add("Familiya2", "8-985-247-01-23");
        pb.add("Familiya1", "8-985-247-71-23");
        pb.add("Familiya2", "8-985-000-01-23");

        System.out.println(pb.get("Familiya1"));
    }
}