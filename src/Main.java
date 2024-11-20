//Password Generator
import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        // initialise variables
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        char[] letters = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};

        char[] symbols = {'!', '#', '$', '%', '&', '(', ')', '*', '+'};

        char[] numbers = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};

        ArrayList<Character> password = new ArrayList<Character>();


        System.out.println("Welcome to the password generator");

        // add random letters, numbers and symbols for the password
        System.out.println("How many letters would you like in your password?");
        int let_num = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < let_num; i++) {
            password.add(letters[random.nextInt(letters.length)]);
        }

        System.out.println("How many symbols would you like in your password?");
        int sym_num = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < sym_num; i++) {
            password.add(symbols[random.nextInt(symbols.length)]);
        }

        System.out.println("How many numbers would you like in your password");
        int num_num = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < num_num ; i++) {
            password.add(numbers[random.nextInt(numbers.length)]);
        }

        // shuffle sequence of characters in the password
        Collections.shuffle(password);
        System.out.println(password);

        String final_pass = "";

        // Turn password into string and print it out
        for (int i = 0; i < password.size(); i++) {
            final_pass += password.get(i);
        }

        System.out.println("Your password is: " + final_pass);
    }
}
