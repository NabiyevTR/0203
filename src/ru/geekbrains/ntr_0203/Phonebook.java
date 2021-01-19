package ru.geekbrains.ntr_0203;

import java.util.ArrayList;
import java.util.List;

public class Phonebook {

    private class Entry {
        String surname;
        String telephoneNumber;

        public Entry(String surname, String telephoneNumber) {
            this.surname = surname;
            this.telephoneNumber = telephoneNumber;
        }
    }

    private final List<Entry> phoneBook = new ArrayList<>();

    public void add(String surname, String telephoneNumber) {
        phoneBook.add(new Entry(surname, telephoneNumber));
    }


    public List<String> get(String surname) {
        List<String> phoneNumbers = new ArrayList<>();
         phoneBook.stream().forEach(e -> {
            if (e.surname.equals(surname)) {
                phoneNumbers.add(e.telephoneNumber);
            }
        });
        return phoneNumbers;
    }
}
