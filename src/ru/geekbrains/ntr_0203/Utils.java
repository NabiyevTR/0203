package ru.geekbrains.ntr_0203;

import java.lang.reflect.Array;
import java.util.*;

public class Utils {
    public static List<String> getUniqueWords(String[] wordsArray) {
        return new ArrayList<String>(
                new HashSet<String>(Arrays.asList(wordsArray))
        );
    }

    public static HashMap<String, Integer> getWordsMap(String[] wordsArray) {
        HashMap<String, Integer> map = new HashMap<>();
        for (String word : wordsArray) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        return map;
    }
}
