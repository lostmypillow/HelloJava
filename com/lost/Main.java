package lost;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        int x = 123;
        String x ="hello";
        String y = "moo";
        String temp;
        temp = x;
        x = y;
        y = temp;
        System.out.println("meow");
        System.out.println("x: " + x);
        System.out.println("y: " + y);

        System.out.println("wat is ur name");
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        
        System.out.println("Hello " + name);
        System.out.println("enter a number");
        int age = scanner.nextInt();

        scanner.nextLine();
        System.out.println("you are " + age + " years old");

        double friends = 10;
        friends --;
        System.out.println(friends);

        // Create a tool for reading user input and name it scanner

        // Print "Write a message: "
        System.out.println("Write a message: ");

        // Read the string written by the user, and assign it
        // to program memory "String message = (string that was given as input)"
        String message = scanner.nextLine();

        // Print the message written by the user
        System.out.println(message);
        


        String text = "contains text";
        int wholeNumber = 123;
        double floatingPoint = 3.141592653;
        boolean trueOrFalse = true;

        System.out.println("Text variable: " + text);
        System.out.println("Integer variable: " + wholeNumber);
        System.out.println("Floating-point variable: " + floatingPoint);
        System.out.println("Boolean: " + trueOrFalse);

        floatingPoint = 1; // Works

        floatingPoint = 10; // Also works

        double pi = 3.14;
        double radius = 22.0;
        double surfaceArea = pi * radius * radius;

        System.out.println(surfaceArea);

        String valueAsString = "42";
//        int intvalue = Integer.valueOf(valueAsString);
        int intValue = Integer.parseInt(valueAsString);

        System.out.println(intValue);

//        double doublevalue = Double.valueOf(valueAsString);
        double doubleValue = Double.parseDouble(valueAsString);
        System.out.println(doubleValue);


        System.out.println("Write a boolean ");
//        boolean value = Boolean.valueOf(scanner.nextLine());
        boolean value = Boolean.parseBoolean(scanner.nextLine());
        scanner.close();
        System.out.println("You wrote " + value);
        
    }
}
