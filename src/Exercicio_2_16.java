import java.util.Scanner;

public class Exercicio_2_16 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num0, num1;

        System.out.print("Digite um valor inteiro: ");
        num0 = sc.nextInt();

        System.out.print("Digite outro valor inteiro: ");
        num1 = sc.nextInt();

        if (num0 > num1) {
            System.out.println("O número " + num0 + " é maior");
        } else if (num0 == num1) {
            System.out.println("Os números são iguais");
        } else {
            System.out.println("O número " + num1 + " é maior");
        }
    }
}
