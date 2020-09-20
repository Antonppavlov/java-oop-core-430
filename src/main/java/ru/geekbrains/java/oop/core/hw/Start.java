package ru.geekbrains.java.oop.core.hw;

//1. Написать метод, на вход которому подается двумерный строковый массив размером 4х4.
// При подаче массива другого размера необходимо бросить исключение MyArraySizeException.

//2. Далее метод должен пройтись по всем элементам массива, преобразовать в int и просуммировать.
// Если в каком-то элементе преобразование не удалось (например, если в ячейке лежит символ или текст вместо числа),
// надо бросить исключение MyArrayDataException с детализацией, в какой ячейке неверные данные.

//3. В методе main() вызвать полученный метод, обработать возможные исключения MySizeArrayException и MyArrayDataException и вывести результат расчета.
public class Start {
    public static void main(String[] args) {

        /*
        Проверка что метод возвращает MyArraySizeException если массив не 4х4
        */
        String[][] checkMyArraySizeException = new String[3][4];
        try {
            convertIntAndSum(checkMyArraySizeException);
        } catch (MyArraySizeException exception) {
            exception.printStackTrace();
        }


        /*
        Проверка что метод возвращает MyArrayDataException если в массиве есть не обрабатываемые Integer
        */
        String[][] twoDimensionalStringArray = new String[4][4];
        String[] one = {"1", "2", "3", "4"};
        String[] two = {"5", "6", "7", "8"};
        String[] three = {"9", "10", "11", "12"};
        String[] fourException = {"13", "14", "Приветики15", "16"};
        twoDimensionalStringArray[0] = one;
        twoDimensionalStringArray[1] = two;
        twoDimensionalStringArray[2] = three;
        twoDimensionalStringArray[3] = fourException;

        try {
            convertIntAndSum(twoDimensionalStringArray);
        } catch (MyArraySizeException | MyArrayDataException exception) {
            exception.printStackTrace();
        }


       /*
        Проверка что метод корректно отрабатывает при корректных данных
        */
        String[] four = {"13", "14", "15", "16"};
        twoDimensionalStringArray[3] = four;

        System.out.println(convertIntAndSum(twoDimensionalStringArray));

    }

    private static int convertIntAndSum(String[][] twoDimensionalStringArray) {
        checkArray(twoDimensionalStringArray);
        int sum = 0;
        for (int x = 0; x < twoDimensionalStringArray.length; x++) {
            String[] lineInArray = twoDimensionalStringArray[x];
            for (int y = 0; y < lineInArray.length; y++) {
                try {
                    sum += Integer.parseInt(lineInArray[y]);
                } catch (NumberFormatException exception) {
                    throw new MyArrayDataException("В ячейке " + x + "x" + y + " " + exception.getMessage());
                }
            }
        }

        return sum;
    }

    private static void checkArray(String[][] twoDimensionalStringArray) {
        if (!(twoDimensionalStringArray.length == 4 & twoDimensionalStringArray[0].length == 4)) {
            throw new MyArraySizeException(
                    "Ожидаемый размер массива 4х4, " +
                            "реальный: " + twoDimensionalStringArray.length + "x" + twoDimensionalStringArray[0].length);
        }
    }
}
