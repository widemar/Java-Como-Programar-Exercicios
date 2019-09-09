package JavaExercicios;

import java.util.Scanner;

public class Exercicio_2_5 {
    public static void main(String[] args) {
        //O programa a seguir irá calcular o produto de 3 inteiros.

        Scanner input = new Scanner(System.in);

        int x, y, z, result;

        System.out.print("Digite o primeiro número inteiro:");
        x = input.nextInt();

        System.out.print("Digite o segundo número inteiro:");
        y = input.nextInt();

        System.out.print("Digite o terceiro número inteiro:");
        z = input.nextInt();

        result = x * y * z;

        System.out.printf("Product is %d", result);
    }
}
