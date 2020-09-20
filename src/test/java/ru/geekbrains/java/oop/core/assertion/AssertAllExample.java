package ru.geekbrains.java.oop.core.assertion;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AssertAllExample {
    @Test
    public void checkSumCorrect() {
        //Получи с веба
        String expectedLogin = "Super User";
        String fio = "Зубенко Николай Петрович";
        String proff = "Мафиози";


        Assertions.assertAll("Данные пользователя",
                () -> Assertions.assertEquals(expectedLogin, "Super User"),
                () -> Assertions.assertEquals(fio, "Зубенко Николай Иванович"),
                () -> Assertions.assertEquals(proff, "Доктор")
        );
    }

}
