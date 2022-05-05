package ru.skypro;

public class Main {

    public static void main(String[] args) {
        //Задача 1
        String firstName = "Ivanov";
        String middleName = "Ivan";
        String lastName = "Ivanovich";
        String fullName = firstName + " " + middleName + " " + lastName;
        System.out.println("Employee's full name - " + fullName);
        //Задача 2
        String s1 = fullName.toUpperCase();
        System.out.println("Employee's full name data for filling out the report - " + s1);
        //Задача 3
        String fullName1 = "Ivanov Semyon Semyonovich";
        fullName1 = fullName1.replace('y', 'i');
        System.out.println("Employee's full name data - " + fullName1);

    }
}
