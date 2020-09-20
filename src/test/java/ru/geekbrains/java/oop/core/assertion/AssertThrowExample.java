package ru.geekbrains.java.oop.core.assertion;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class AssertThrowExample {

    @Test
    public void checkAssertThrows() {
        Assertions.assertThrows(
                FileNotFoundException.class,
                () -> new Scanner(new File("src/test/resources/file_t1est.txt"))
        );
    }

    @Test
    public void checkAssertThrowsFail() {
        Assertions.assertThrows(
                FileNotFoundException.class,
                () -> new Scanner(new File("src/test/resources/file_test.txt"))
        );
    }
}
