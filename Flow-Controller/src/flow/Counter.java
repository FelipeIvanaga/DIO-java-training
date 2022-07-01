package flow;

import java.util.Scanner;

public class Counter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro parametro");
        int start = scanner.nextInt();

        System.out.println("Digite o segundo parametro");
        int end = scanner.nextInt();

        try {
            count(start, end);
        } catch (InvalidParamsException exception) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }
    }

    static void count(int start, int end) throws InvalidParamsException {
        if (start > end) {
            throw new InvalidParamsException();
        }
        int max = end - start;
        for (int i = 1; i <= max; i++) {
            System.out.println("Imprimindo o número ".concat(String.valueOf(i)));
        }
    }
}
