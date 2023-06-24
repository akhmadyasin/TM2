import java.util.ArrayList;
import java.util.List;

public class tm2 {

        public static void main(String[] args) {
            int start = 10;
            int end = 4500;

            // Menghasilkan deret Fibonacci hingga mencapai batas end
            List<Integer> deretFibonacci = generateDeretFibonacci(end);

            // Menyaring bilangan Fibonacci genap
            List<Integer> Fibonacci = filterNumbers(deretFibonacci);

            // Menampilkan deret bilangan Fibonacci genap
            System.out.println("Deret bilangan Fibonacci genap:");
            for (int num : Fibonacci) {
                System.out.print(num + " ");
            }

            // Menghitung jumlah bilangan Fibonacci genap
            int totalSum = TotalSum(Fibonacci);

            // Menampilkan total jumlah bilangan Fibonacci genap
            System.out.println("\nTotal bilangan Fibonacci genap: " + totalSum);
        }

        // Menghasilkan deret Fibonacci hingga mencapai batas n
        public static List<Integer> generateDeretFibonacci(int n) {
            List<Integer> deretFibonacci = new ArrayList<>();
            deretFibonacci.add(0);
            deretFibonacci.add(1);

            while (deretFibonacci.get(deretFibonacci.size() - 1) < n) {
                int nextNum = deretFibonacci.get(deretFibonacci.size() - 1) +
                        deretFibonacci.get(deretFibonacci.size() - 2);
                deretFibonacci.add(nextNum);
            }

            return deretFibonacci;
        }

        // Menyaring bilangan genap dari deret Fibonacci
        public static List<Integer> filterNumbers(List<Integer> deret) {
            ArrayList<Integer> Numbers = new ArrayList<>();
            for (int num : deret) {
                if (num % 2 == 0) {
                    Numbers.add(num);
                }
            }
            return Numbers;
        }

        // Menghitung jumlah bilangan dalam suatu list
        public static int TotalSum(List<Integer> numbers) {
            int sum = 0;
            for (int num : numbers) {
                sum += num;
            }
            return sum;
        }


}
