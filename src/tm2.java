import java.util.ArrayList;

public class tm2 {
    public static void main(String[] args) {
        ArrayList<Integer> fibonacciNumbers = new ArrayList<>();
        ArrayList<Integer> genap = new ArrayList<>();
        int jumlah = 0;

        int a = 0;
        int b = 1;
        int fibonacci = a + b;

        while (fibonacci <= 4500) {
            if (fibonacci >= 10) {
                fibonacciNumbers.add(fibonacci);
                if (fibonacci % 2 == 0) {
                    genap.add(fibonacci);
                    jumlah += fibonacci;
                }
            }
            a = b;
            b = fibonacci;
            fibonacci = a + b;
        }

        System.out.println("Deretan bilangan Fibonacci genap:");
        for (int number : genap) {
            System.out.print(number + " ");
        }
        System.out.println();

        System.out.println("Total Array : " + genap.size());
        System.out.println("Jumlah bilangan Fibonacci genap: " + jumlah);
    }
}
