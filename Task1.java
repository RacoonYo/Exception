import java.util.InputMismatchException;
import java.util.Scanner;

/** Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), и возвращает введенное
 * значение. Ввод текста вместо числа не должно приводить к падению приложения, вместо этого, необходимо повторно
 * запросить у пользователя ввод данных.
 */


public class Task1 {
    public static void main(String[] args) {
        boolean flag = true;
        while (flag) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите дробное число (разделитель: ,)");
            try {
                System.out.println(scanner.nextFloat());
                flag = false;
            } catch (InputMismatchException e) {
                System.out.println("Введено не число!");;
            }
        }
    }
}