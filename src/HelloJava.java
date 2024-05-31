import java.util.Scanner;

public class HelloJava {
    public static void main(String[] args) {
System.out.println("Once upon a time");
System.out.println("there was");
System.out.println("a program");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write a message: ");
        String message = scanner.nextLine();
        System.out.println("u wrote " + message);
    }
    }
