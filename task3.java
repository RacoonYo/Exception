/**
 * Реализуйте метод, принимающий в качестве аргумента целочисленный двумерный массив. Необходимо посчитать и вернуть
 * сумму элементов этого массива. При этом накладываем на метод 2 ограничения: метод может работать только с квадратными
 * массивами (кол-во строк = кол-ву столбцов), и в каждой ячейке может лежать только значение 0 или 1. Если нарушается
 * одно из условий, метод должен бросить RuntimeException с сообщением об ошибке.
 */

public class task3 {

    public static void main(String[] args) {
        int [][] array = {{1, 0, 1, 0},{1, 0, 1, 0},{1, 1, 1, 1},{1, 1, 1, 0}};
        System.out.printf("Сумма элементов массива = %d", sumArrayEl(array));
    }


    static int sumArrayEl(int [][] array) {
        int sumEl = 0;
        int numOfLine = array.length;

        for (int [] line : array){
            if (line.length != numOfLine) throw new RuntimeException("не квадратный массив");

            for (int el : line) {
                if (el != 1 && el != 0) throw new RuntimeException("элементы не равны 0 либо 1");
                sumEl += el;
            }
        }

        return sumEl;
    }
}
