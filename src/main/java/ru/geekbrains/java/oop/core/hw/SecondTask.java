package ru.geekbrains.java.oop.core.hw;

/*
Написать простой класс Телефонный Справочник, который хранит список фамилий и телефонных номеров.
В него с помощью метода add() можно добавлять записи, а с помощью get() — искать номер телефона по фамилии.
Для одной фамилии может быть несколько телефонов (однофамильцы):
тогда при запросе такой фамилии должны выводиться все номера.
 */

public class SecondTask {
    public static void main(String[] args) {
        PhoneBook phonebook = new PhoneBook();

        phonebook.add("Иванов", "89213736655");
        phonebook.add("Иванов", "+79115556655");
        phonebook.add("Иванов", "+74954433221");
        phonebook.add("Сидоров", "89115222334");
        phonebook.add("Петров", "89064422114");
        phonebook.add("Петров", "89064422114");
        phonebook.add("Петров", "89064422113");

        System.out.println(phonebook.get("Иванов"));
        System.out.println(phonebook.get("Сидоров"));
        System.out.println(phonebook.get("Петров"));
    }
}
