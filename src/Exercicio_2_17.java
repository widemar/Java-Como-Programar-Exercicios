import java.util.Scanner;

public class Exercicio_2_17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num0, num1, num2, soma, multiplicacao, media;

        System.out.print("Digite um valor inteiro: ");
        num0 = sc.nextInt();

        System.out.print("Digite outro valor inteiro: ");
        num1 = sc.nextInt();

        System.out.print("Digite outro valor inteiro: ");
        num2 = sc.nextInt();

        soma = num0 + num1 + num2;
        multiplicacao = num0 * num1 * num2;
        media = num0 + num1 + num2 / 3;

        System.out.println("O resultado da soma é " + soma);
        System.out.println("O resultado da multiplicação é " + multiplicacao);
        System.out.println("A média é de " + media);

        if (soma > multiplicacao && soma > media) {
            System.out.println("O resultado da soma é maior");
        } else if (multiplicacao > soma && multiplicacao > media) {
            System.out.println("O resultado da multiplicação é maior");
        } else if (media > soma && media > multiplicacao) {
            System.out.println("O resultado da média é maior");
        }
        if (soma < multiplicacao && soma < media) {
            System.out.println("O resultado da soma é menor");
        } else if (multiplicacao < soma && multiplicacao < media) {
            System.out.println("O resultado da multiplicação é menor");
        } else if (media < soma && media < multiplicacao) {
            System.out.println("O resultado da média é menor");
        }


    }
}
