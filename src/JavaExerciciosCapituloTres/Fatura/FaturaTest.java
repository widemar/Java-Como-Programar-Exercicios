package JavaExerciciosCapituloTres.Fatura;

import java.util.Scanner;

public class FaturaTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Fatura ft = new Fatura("01","Lavar as mãoes",5,5.0);

        String numero;
        System.out.print("Digite o número da sua fatura: ");
        numero = sc.nextLine();
        ft.setNumero(numero);

        String descricao;
        System.out.print("Digite a descrição do Produto: ");
        descricao = sc.nextLine();
        ft.setDescricao(descricao);

        int quantidade;
        System.out.print("Digite a quantidade de itens que deseja comprar: ");
        quantidade = sc.nextInt();
        ft.setQuantidade(quantidade);

        double preco;
        System.out.print("Digite o preço do item: ");
        preco = sc.nextDouble();
        ft.setPreco(preco);

        System.out.println("O número da sua fatura é: "+ft.getNumero());
        System.out.println("Descrição "+ft.getDescricao());
        System.out.println("A quantidade de itens comprados foi de "+ft.getQuantidade()+" Itens");
        System.out.println("O preço do produto é de R$"+ft.getPreco()+" reais");
        System.out.println("O preço da fatura é de R$"+ft.calculaFatura()+" reais");


    }
}
