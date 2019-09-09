package JavaExercicios;

import java.util.Scanner;

public class Exercicio_2_28 {
    public static void main(String[] args) {
        //Diâmetro, circuferância e área de um círculo

        Scanner sc = new Scanner(System.in);

        double raio;

        System.out.print("Digite o raio de um circulo com valor inteiro:");
        raio = sc.nextInt();

        System.out.printf("O diâmetro do circulo é de %1.2f cm²",2*raio);
        System.out.printf("\nA circuferência do circulo é de %1.2f cm²",2*Math.PI*raio);
        System.out.printf("\nO area do circulo é de %1.2f cm²",Math.PI*raio*raio);


    }
}
