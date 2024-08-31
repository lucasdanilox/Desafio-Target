import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número para verificar se pertence à sequência de Fibonacci: ");
        int number = scanner.nextInt();

        if (isFibonacci(number)) {
            System.out.println(number + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println(number + " não pertence à sequência de Fibonacci.");
        }

        scanner.close();
    }

    public static boolean isFibonacci(int number) {
        if (number < 0) {
            return false;
        }

        int a = 0;
        int b = 1;

        if (number == a || number == b) {
            return true;
        }

        while (b < number) {
            int next = a + b;
            a = b;
            b = next;

            if (b == number) {
                return true;
            }
        }

        return false;
    }
}