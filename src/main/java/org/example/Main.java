package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1:");

        Student[] students = new Student[4];

        students[0] = new Student("Liliya", "Morozenko", "M112-3 ", 4.5);
        students[1] = new Aspirant("Alina", "Zubenko", "M118-3 ", 5.0, "Last-mile Logistics");
        students[2] = new Student("Alice", "Ovdienko", "M123-2 ", 3.0);
        students[3] = new Aspirant("Vlad", "Pylypenko", "N32-5-1 ", 5.0, "Information System in Logistics");

        for (Student student : students) {
            student.info();
            System.out.println(student.getScholarship());
        }
        System.out.println("Task 2:");
        Pow pow1 = (number, pow) ->
        {
            int result = 1;
            for (int i = 0; i < pow; i++) {
                result *= number;
            }
            return result;
        };
        int number = 8;
        int pow = 2;
        int result = pow1.pow(number, pow);
        System.out.println(number + "^" + pow + "=" + result);
    }
}