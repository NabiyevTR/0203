package ru.geekbrains.ntr_0203;

import static ru.geekbrains.ntr_0203.Utils.*;

public class Main {

    public static void main(String[] args) {

        //Задание № 1
        String[] wordArray  =  {
	        "abstract",
            "finally",
            "protected",
            "volatile",
            "yield",
            "super",
            "synchronised",
            "this",
            "void",
            "try",
            "class",
            "catch",
            "super",
            "finally",
            "yield",
            "abstract",
            "abstract",
            "super",
            "try",
            "abstract"
    };

        // Уникальные слова
        System.out.println(getUniqueWords(wordArray));

        // Подсчет, сколько каждое слово встречается раз
        System.out.println(getWordsMap(wordArray));

        //Задание № 2

        Phonebook phonebook = new Phonebook();
        phonebook.add("Ivanov", "+7(495)-123-35-56");
        phonebook.add("Ivanov", "+7(495)-123-35-58");
        phonebook.add("Petrov", "+7(499)-125-35-58");
        phonebook.add("Sidorov", "+7(499)-199-35-58");
        phonebook.add("Sidorov", "+7(499)-299-35-58");

        System.out.println(phonebook.get("Sidorov"));
    }
}
