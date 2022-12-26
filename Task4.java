import java.util.Scanner;

/**
 * Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку. Пользователю должно
 * показаться сообщение, что пустые строки вводить нельзя.
 */

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку");
        String line = scanner.nextLine();
        if (line.isEmpty()) {
            throw new RuntimeException("Нельзя вводить пустую строку!");
        }
        System.out.println(line);
    }
}
