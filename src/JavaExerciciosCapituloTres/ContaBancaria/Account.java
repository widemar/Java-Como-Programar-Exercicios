package JavaExerciciosCapituloTres.ContaBancaria;

public class Account {
    private String name;
    double balance;


    public Account(String name, double balance) {
        this.name = name;


        if (balance > 0.0)
            this.balance = balance;
    }


    public void deposit(double depositAmount) {
        if (depositAmount > 0.0)
            balance = balance + depositAmount;
    }


    public void withdraw(double retirada) {
        if (retirada < balance) {
            balance = balance - retirada;
        } else {
            System.out.println("Withdrawal amount exceeded account balance");

        }
    }


    public double getBalance() {
        return balance;
    }


    public void setName(String name) {
        this.name = name;
    }


    public String getName() {
        return name;
    }

    public static void exibeConta(Account contaExibida) {

        System.out.println("Seu nome é " + contaExibida.name + " e você possui um saldo de R$" + contaExibida.balance+" reais");
    }
}
