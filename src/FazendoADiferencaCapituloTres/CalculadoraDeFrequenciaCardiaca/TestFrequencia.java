package FazendoADiferencaCapituloTres.CalculadoraDeFrequenciaCardiaca;

import java.util.Scanner;

public class TestFrequencia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        String nome;
        System.out.print("Digite seu nome: ");
        nome = sc.nextLine();

        String sobrenome;
        System.out.print("Digite seu sobrenome: ");
        sobrenome = sc.nextLine();

        int dia;
        System.out.print("Digite o dia que você nasceu: ");
        dia = sc.nextInt();

        int mes;
        System.out.print("Digite o mes que você nasceu: ");
        mes = sc.nextInt();

        int ano;
        System.out.println("Digite o ano que você nasceu: ");
        ano = sc.nextInt();


        FrequenciaCardiaca fq = new FrequenciaCardiaca(nome, sobrenome, dia, mes, ano);

        System.out.println("Seu nome é " + nome + " " + sobrenome);
        fq.exibeData();
        System.out.println(nome + " tem " + fq.idade() + " anos de idade");
        System.out.println("Possui uma frequência cardiaca de " + fq.frequenciaCardicacaMaxima() + " batimentos por minuto");
        fq.frequenciaCardiacaAlvo();


    }
}
