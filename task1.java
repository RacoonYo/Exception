public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    static int checkArrayLength(int [] array) {
        int arrLength = array.length;
        if (arrLength >= 5) return arrLength;
        else return -1;
    }

}