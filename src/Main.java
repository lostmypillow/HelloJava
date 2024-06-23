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


        Scanner scanner = new Scanner(System.in);
        System.out.println("wat is ur name");
        String name = scanner.nextLine();
        System.out.println("Hello " + name);

        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("you are " + age + " years old");

        double friends = 10;
        friends --;
        System.out.println(friends);
    }
}
