import java.util.Scanner;

/**
 *  Реализуйте метод, принимающий в качестве аргумента целочисленный массив и некоторое значение. Метод ищет в массиве
 *  заданное значение и возвращает его индекс. При этом, например:
 *
 * если длина массива меньше некоторого заданного минимума, метод возвращает -1, в качестве кода ошибки.
 * если искомый элемент не найден, метод вернет -2 в качестве кода ошибки.
 * если вместо массива пришел null, метод вернет -3
 * придумайте свои варианты исключительных ситуаций и верните соответствующие коды ошибок.
 * Напишите метод, в котором реализуйте взаимодействие с пользователем. То есть, этот метод запросит искомое число у
 * пользователя, вызовет первый, обработает возвращенное значение и покажет читаемый результат пользователю. Например,
 * если вернулся -2, пользователю выведется сообщение: “Искомый элемент не найден”.
 */


public class task2 {

    public static void main(String[] args) {
        ui();
    }


    static int foundIndex(int [] array, int el){
        if (array == null) return -3;
        else if (array.length < 5) return -1;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == el) return i;
        }

        return -2;
    }


    static void ui (){
        int [] array = {1, 5, 55, 582, 862, 8456, 88214};
        int el = 0;
        boolean flag = true;

        while (flag){
            System.out.println("Введите искомое число");
            Scanner scanner = new Scanner(System.in);
            if (scanner.hasNextInt()) {
                el = scanner.nextInt();
                flag = false;
            } else System.out.println("Введено не число!");
        }

        int index = foundIndex(array, el);

        switch (index) {
            case -1 -> System.out.println("Длина массива меньше 5");
            case -2 -> System.out.println("Искомый элемент не найден");
            case -3 -> System.out.println("Вместо массива пришел null");
            default -> System.out.printf("Индекс искомого элемента %d", index);
        }

    }
}
