import java.util.Scanner;

public class ChallengeTwo {
    public static void main(String[] args) {
        // Write a program that will ask you your name.
        // It will then display ‘Hello Name’ where ‘Name’ is the name you have entered.

        System.out.println("What is your name? ");
        Scanner reader = new Scanner(System.in);
        String name = reader.nextLine();
        System.out.println("Hello " + name);

    }
}
