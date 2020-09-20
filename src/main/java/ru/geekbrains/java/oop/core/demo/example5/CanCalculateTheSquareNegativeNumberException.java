package ru.geekbrains.java.oop.core.demo.example5;

public class CanCalculateTheSquareNegativeNumberException extends Exception {
    public CanCalculateTheSquareNegativeNumberException() {
    }

    public CanCalculateTheSquareNegativeNumberException(String message) {
        super(message);
    }

    public CanCalculateTheSquareNegativeNumberException(String message, Throwable cause) {
        super(message, cause);
    }

    public CanCalculateTheSquareNegativeNumberException(Throwable cause) {
        super(cause);
    }

    public CanCalculateTheSquareNegativeNumberException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
