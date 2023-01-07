/**
 * .Реализуйте метод, принимающий в качестве аргумента целочисленный массив. Если длина массива меньше некоторого
 * заданного минимума, метод возвращает -1, в качестве кода ошибки, иначе - длину массива.
 */

public class task1 {

    static int checkArrayLength(int [] array) {
        int arrLength = array.length;
        if (arrLength >= 5) return arrLength;
        else return -1;
    }

}