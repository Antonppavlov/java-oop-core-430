package ru.geekbrains.java.oop.core.assertion;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AssertTrueAndFalseExample {

    @Test
    public void checkTrue() {
        Assertions.assertTrue(true);
    }

    @Test
    public void checkTrueFail() {
        Assertions.assertTrue(false);
    }

    @Test
    public void checkFalse() {
        Assertions.assertFalse(false);
    }

    @Test
    public void checkFalseFail() {
        Assertions.assertFalse(true);
    }

    @Test
    public void checkNull() {
        String text = null;
        Assertions.assertNull(text);
    }

    @Test
    public void checkNullFail() {
        String text = "null";
        Assertions.assertNull(text);
    }

    @Test
    public void checkNotNull() {
        String text = "null";
        Assertions.assertNotNull(text);
    }

    @Test
    public void checkNotNullFail() {
        String text = null;
        Assertions.assertNotNull(text);
    }

    @Test
    public void fail() {
        Assertions.fail("Невероятно! Сработал тот самый Fail!");
    }
}
