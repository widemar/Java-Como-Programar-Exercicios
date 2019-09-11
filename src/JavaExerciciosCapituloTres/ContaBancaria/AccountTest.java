package JavaExerciciosCapituloTres.ContaBancaria;

import JavaExerciciosCapituloTres.ContaBancaria.Account;

import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Account conta = new Account("Widemar", 50.00);

        double retirada;
        System.out.print("Digite o quanto vc quer retirar da conta:");
        retirada = sc.nextDouble();
        conta.withdraw(retirada);

        System.out.println("Agora você possui o saldo de "+conta.balance);
    }
}
