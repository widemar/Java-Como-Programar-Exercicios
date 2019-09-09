import java.util.Scanner;

public class Exercicio_2_15 {
    public static void main(String[] args) {
        //Calcula soma, produto, diferença e divisão

        Scanner sc = new Scanner(System.in);

        int num0, num1, soma, multiplicação, subtração, divisão;

        System.out.print("Digite um valor inteiro: ");
        num0 = sc.nextInt();

        System.out.print("Digite outro valor inteiro: ");
        num1 = sc.nextInt();

        soma = num0 + num1;
        multiplicação = num0 * num1;
        subtração = num0 - num1;
        divisão = num0 / num1;


        System.out.println("O resultado da soma dos números é " + soma);
        System.out.println("O resultado da multiplicação dos números é " + multiplicação);
        System.out.println("O resultado da subtração dos números é " + subtração);
        System.out.println("O resultado da divisão dos números é " + divisão);
    }
}
