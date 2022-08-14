package Lesson4.task1;

import java.util.*;

public class Main {
    public static void main(String[] args){
        List<String> words = Arrays.asList(
                "привет", "мой", "мой", "друг", "друг",
                "как", "твои", "твои", "дела", "расскажи",
                "пожалуйста", "пожалуйста"
        );

        Set<String> unique = new HashSet<String>(words);

        System.out.println("Первоначальный массив:");
        System.out.println(words.toString());
        System.out.println("Уникальные слова:");
        System.out.println(unique.toString());
        System.out.println("Как часто встречаются:");
        for (String key : unique) {
            System.out.println(key + ": " + Collections.frequency(words, key));
        }
    }
}
