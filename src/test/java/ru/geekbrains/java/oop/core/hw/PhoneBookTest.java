package ru.geekbrains.java.oop.core.hw;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

public class PhoneBookTest {

    @Test
    public void checkMethodAdd() {
        PhoneBook phonebook = new PhoneBook();

        phonebook.add("Иванов", "89213736655");
        phonebook.add("Иванов", "+79115556655");
        phonebook.add("Иванов", "+74954433221");

        Set<String> expectedPhoneNumber = new HashSet<>();
        expectedPhoneNumber.add("89213736655");
        expectedPhoneNumber.add("+79115556655");
        expectedPhoneNumber.add("+74954433221");

        Assertions.assertEquals(
                expectedPhoneNumber,
                phonebook.get("Иванов")
                );
    }
}
