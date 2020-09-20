package ru.geekbrains.java.oop.core.assertion;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AssertEqualsExample {

    @Test
    public void checkSumCorrect() {
        Assertions.assertEquals(2, 1 + 1);
    }

    @Test
    public void checkSumException() {
        Assertions.assertEquals(3, 1 + 1);
    }
}
