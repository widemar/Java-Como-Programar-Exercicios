package JavaExercicios;

import java.util.Scanner;

public class Exercicio_2_25 {
    public static void main(String[] args) {
        //Impar ou Par

        Scanner sc = new Scanner(System.in);

        int num0;

        System.out.print("Digite um número inteiro: ");
        num0 = sc.nextInt();

        if (num0 % 2 == 0) {
            System.out.println("O número digitado é par");
        } else {
            System.out.println("O número digitado é ímpar");
        }
    }
}
