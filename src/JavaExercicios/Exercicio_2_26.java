package JavaExercicios;

import java.util.Scanner;

public class Exercicio_2_26 {
    public static void main(String[] args) {
        //Multiplos
        Scanner sc = new Scanner(System.in);

        int num0, num1;

        System.out.print("Digite um valor inteiro: ");
        num0 = sc.nextInt();

        System.out.print("Digite outro valor inteiro: ");
        num1 = sc.nextInt();

        if (num0 % num1 == 0 || num1 % num0 == 0) {
            System.out.println("O número " + num1 + " é multiplo de " + num0);
        } else {
            System.out.println("Os números não são multiplos");
        }
    }
}
