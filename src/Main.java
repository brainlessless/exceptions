// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

class ArrayException extends Exception {
    public ArrayException(String message){
        super(message);

    };
}
class Card{
    public String name;
    public double money;

    {
        name = "SBER";
        money = 1000;
    }

    public void addMoney(double money) throws Exception {
        if (money<=0) {
            throw new Exception("Not enough money!");
        }
        this.money+=money;
    }

}

public class Main {


    public static int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0};

//    public static int getByIndex(int index) throws ArrayException {
//        if (index >= 0 && index < arr.length) {
//            throw new ArrayException("Error!");
//        }
//            return arr[index];
//
//    }

    public static int delenie(int value, int index) throws Exception {
        if (index < 0 || index > arr.length)
            throw new ArrayException("Out of index!");
//            throw new Exception("Out of index!");
        if (arr[index] == 0)
            throw new Exception("Division by zero is not allowed!");


        return value / arr[index];
    }


    public static void main(String[] args) throws Exception {

//        Card card = new Card();
//        System.out.println(card.name + "card : " + card.money + " RUR");
//        card.addMoney(-100);
//        System.out.println(card.name + "card : " + card.money + " RUR");



        try {

            System.out.println(delenie(10, 101010));

        }
        catch (Exception exception) {
            System.out.println(exception.getMessage());
        }







    }
}