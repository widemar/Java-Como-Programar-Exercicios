package FazendoADiferenca;

import java.util.Scanner;

public class CalculadoraIMC {
    public static void main(String[] args) {
        double peso,altura,imc;

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite seu peso em KG: ");
        peso = sc.nextDouble();

        System.out.print("Digite sua altura em metros: ");
        altura = sc.nextDouble();

        imc = peso/(altura*altura);

        System.out.printf("Você tem o IMC de %1.2f",imc);
        System.out.println("\n");

        if (imc<18.5){
            System.out.println("Abaixo do Peso");
        }
        else if (imc>=18.5 && imc<=24.9){
            System.out.println("Peso Normal");
        }
        else if (imc>=25 && imc<=29.9){
            System.out.println("Sobrepeso");
        }
        else if (imc>=30 && imc<=34.9){
            System.out.println("Obesidade Grau I");
        }
        else if (imc>=35 && imc<=39.9){
            System.out.println("Obesidade Grau II");
        }
        else if(imc>=40) {
            System.out.println("Obesidade Grau III");
        }

    }
}
