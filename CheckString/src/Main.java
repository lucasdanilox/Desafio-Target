import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma string para verificar a presença da letra 'a': ");
        String input = scanner.nextLine();

        int count = countLetterA(input);

        if (count > 0) {
            System.out.println("A letra 'a' (ou 'A') aparece " + count + " vez(es) na string.");
        } else {
            System.out.println("A letra 'a' (ou 'A') não aparece na string.");
        }

        scanner.close();
    }

    public static int countLetterA(String str) {
        if (str == null || str.isEmpty()) {
            return 0;
        }

        int count = 0;
        char[] chars = str.toCharArray();

        for (char c : chars) {
            if (c == 'a' || c == 'A') {
                count++;
            }
        }

        return count;
    }
}
