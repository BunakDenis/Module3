package global.goit.edu.Module3;

import java.util.Scanner;

public class PassportFormCreator {

    public static void createForms() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Your Name");
        String name = scanner.next();
        System.out.println("Enter Your Surname");
        String surname = scanner.next();
        System.out.println("Enter Your Age");
        int age = scanner.nextInt();
        age *= 10;
        System.out.println(name + " " + surname + " " + age);
        System.out.println(name.toUpperCase());
        System.out.println(surname.toUpperCase());
        System.out.println(age);
        scanner.close();

    }

    public static void main(String[] args) {
        createForms();
    }

}
