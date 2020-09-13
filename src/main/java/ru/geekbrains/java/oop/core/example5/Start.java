package ru.geekbrains.java.oop.core.example5;

public class Start {
    public static void main(String[] args) {
        double sqrt = 0;
        try {
            sqrt = sqrt(-9);
        } catch (CanCalculateTheSquareNegativeNumberException e) {
            System.out.println("Рассчет не произошел по причине CanCalculateTheSquareNegativeNumberException");
        }

        System.out.println(sqrt);
    }


    public static double sqrt(double in) throws CanCalculateTheSquareNegativeNumberException {
        if (in < 0.0) {
            throw new CanCalculateTheSquareNegativeNumberException("Нельзя вычислить корень квадратный из отрицательного числа");
        }
        return Math.sqrt(in);
    }

}
