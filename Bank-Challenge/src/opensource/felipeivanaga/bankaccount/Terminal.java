package opensource.felipeivanaga.bankaccount;

import java.util.Scanner;

public class Terminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor, informe os valores abaixo!");

        System.out.print("Nome do Cliente: ");
        String clientName = scanner.nextLine();

        System.out.print("Número da agência: ");
        String agency = scanner.next();

        System.out.print("Número da conta: ");
        int accountNumber = scanner.nextInt();

        System.out.print("Saldo inicial: ");
        double initialBalance = scanner.nextDouble();

        Account account = new Account(accountNumber, agency, clientName, initialBalance);
        System.out.println(account);
    }
}
