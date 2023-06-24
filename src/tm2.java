import java.util.ArrayList;
import java.util.List;

public class tm2 {

        public static void main(String[] args) {
            int start = 10;
            int end = 4500;

            List<Integer> deretFibonacci = generateDeretFibonacci(end);

            List<Integer> Fibonacci = filterNumbers(deretFibonacci);

            System.out.println("Deret bilangan Fibonacci genap:");
            for (int num : Fibonacci) {
                System.out.print(num + " ");
            }

            int totalSum = TotalSum(Fibonacci);

            System.out.println("\nTotal bilangan Fibonacci genap: " + totalSum);
        }

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

        public static List<Integer> filterNumbers(List<Integer> deret) {
            ArrayList<Integer> Numbers = new ArrayList<>();
            for (int num : deret) {
                if (num % 2 == 0) {
                    Numbers.add(num);
                }
            }
            return Numbers;
        }

        public static int TotalSum(List<Integer> numbers) {
            int sum = 0;
            for (int num : numbers) {
                sum += num;
            }
            return sum;
        }


}
