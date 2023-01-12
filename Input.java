import java.util.Scanner;

public class Input {
    static String input(String text) {
        System.out.println(text);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
