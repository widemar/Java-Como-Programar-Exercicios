package JavaExerciciosCapituloTres.Empregado;

import java.util.Scanner;

public class EmpregadoTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Empregado emp = new Empregado("Widemar", "Silva", 5000.00);
        Empregado emp2 = new Empregado("Valdeci", "Crispim", 980.00);

        System.out.println("O salario anual de " + emp.getNome() +
                " é de R$" + emp.salarioAnual() + " reais");
        System.out.println("O salario anual de " + emp2.getNome() +
                " é de R$" + emp2.salarioAnual() + " reais");


        System.out.println("O salario anual com acrescimo de 10% de " + emp.getNome() +
                " vai para R$" + emp.salarioAnualComAcrescimos() + " reais");

        System.out.println("O salario anual com acrescimo de 10% de " + emp2.getNome() +
                " vai para R$" + emp2.salarioAnualComAcrescimos() + " reais");


    }
}
