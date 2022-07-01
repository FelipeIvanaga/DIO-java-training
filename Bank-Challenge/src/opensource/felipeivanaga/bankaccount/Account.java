package opensource.felipeivanaga.bankaccount;

public class Account {
    final private int number;
    final private String agency;
    private String clientName;
    private double balance;

    public Account(int number, String agency, String clientName, double balance) {
        this.number = number;
        this.agency = agency;
        this.setClientName(clientName);
        this.setBalance(balance);
    }


    @Override
    public String toString() {
        return "Olá ".concat(this.getClientName())
                     .concat(", obrigado por criar uma conta em nosso banco, sua agência é ")
                     .concat(this.agency).concat(", conta ").concat(String.valueOf(this.number))
                     .concat(" e seu saldo ")
                     .concat(String.format("%.2f", this.getBalance())).concat(" já está disponível para saque.");
    }


    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
