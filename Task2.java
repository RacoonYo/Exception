/**
 *  Если необходимо, исправьте данный код
 */

public class Task2 {
    public static void main(String[] args) {
        Integer [] intArray = {1, 2, 3, 4, 5, 8, 9, 0, 555, 552, 552443};

        try {
                        int d = 0;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArrayIndexOutOfBoundsException | ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }
    }
}
