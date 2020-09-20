package ru.geekbrains.java.oop.core.annotations;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

//@Disabled(value = "Отключен до 26 сентября")
public class DisplayExample {

    @Test
    public void checkSumCorrect() {
        Assertions.assertEquals(2, 1 + 1);
    }

    @Disabled(value = "Отключен до 26 сентября")
    @Test
    public void checkSumException() {
        Assertions.assertEquals(3, 1 + 1);
    }
}
