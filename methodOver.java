public class methodOver {

    // Addition of 2 numbers
    int sum(int number1, int number2) {
        return number1 + number2;
    }

    // Addition of 3 numbers
    int sum(int number1, int number2, int number3) {
        return number1 + number2 + number3;
    }

    // Concatenation of 2 strings
    String sum(String name1, String name2) {
        return name1 + " " + name2;
    }

    public static void main(String[] args) {

        methodOver obj = new methodOver();

        System.out.println("The addition of 2 numbers -> " + obj.sum(500, 600));
        System.out.println("The addition of 3 numbers -> " + obj.sum(10, 20, 30));
        System.out.println("The concatenation -> " + obj.sum("Sunny", "Leony"));
    }
}
