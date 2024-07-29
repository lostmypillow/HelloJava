package lost;
import java.util.Scanner;

public class HelloJava {
    public static void main(String[] args) {
        double a = 3.14;
        double b = 22.0;
        double c = a * b * b;

        System.out.println(c);
        System.out.println("Once upon a time");
        System.out.println("there was");
        System.out.println("a program");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write a message: ");
        String message = scanner.nextLine();
        System.out.println("u wrote " + message);
        String next_message = scanner.nextLine();
        scanner.close();
        System.out.println("well well " + next_message);
        int value = 10;
        System.out.println(value);
        value = 4;
        System.out.println(value);
    }
    }
