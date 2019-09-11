package JavaExerciciosCapituloTres.ContaBancaria;

import JavaExerciciosCapituloTres.ContaBancaria.Account;

import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Account conta = new Account("Widemar", 50.00);
        Account conta2 = new Account("Valdeci", 100.00);


        double retirada;
        System.out.print("Digite o quanto vc quer retirar da conta:");
        retirada = sc.nextDouble();
        conta.withdraw(retirada);

        double retirada2;
        System.out.print("Digite o quanto vc quer retirar da conta:");
        retirada2 = sc.nextDouble();
        conta2.withdraw(retirada2);

        Account.exibeConta(conta);
        Account.exibeConta(conta2);
    }
}
