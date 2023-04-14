// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0};

    public static int getByIndex(int index) {
        if (index >= 0 && index < arr.length)
            return arr[index];
        return -1;
    }



    public static void main(String[] args) {
        System.out.println(getByIndex(100));
    }
}