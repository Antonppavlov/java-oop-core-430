package ru.geekbrains.java.oop.core.annotations;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

public class RepeatedExample {

    @RepeatedTest(value = 5)
    public void checkSumCorrect() {
        Assertions.assertEquals(2, 1 + 1);
    }

    @Test
    public void checkSumException() {
        Assertions.assertEquals(3, 1 + 1);
    }
}
