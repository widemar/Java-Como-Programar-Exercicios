import java.util.Scanner;

public class Exercicio_2_32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num0, num1, num2, num3, num4, contaPositivo = 0, contaNegativo=0, contaZeros=0;

        System.out.print("Digite um valor inteiro: ");
        num0 = sc.nextInt();

        System.out.print("Digite outro valor inteiro: ");
        num1 = sc.nextInt();

        System.out.print("Digite um valor inteiro: ");
        num2 = sc.nextInt();

        System.out.print("Digite um valor inteiro: ");
        num3 = sc.nextInt();

        System.out.print("Digite um valor inteiro: ");
        num4 = sc.nextInt();

        if (num0 > 0) {
            contaPositivo++;
        }
        if (num1 > 0) {
            contaPositivo++;
        }
        if (num2 > 0) {
            contaPositivo++;
        }
        if (num3 > 0) {
            contaPositivo++;
        }
        if (num4 > 0) {
            contaPositivo++;
        }
        if (num0<0){
            contaNegativo++;
        }
        if (num1<0){
            contaNegativo++;
        }
        if (num2<0){
            contaNegativo++;
        }
        if (num3<0){
            contaNegativo++;
        }
        if (num4<0){
            contaNegativo++;
        }
        if (num0==0){
            contaZeros++;
        }
        if (num1==0){
            contaZeros++;
        }
        if (num2==0){
            contaZeros++;
        }
        if (num3==0){
            contaZeros++;
        }
        if (num4==0){
            contaZeros++;
        }

        System.out.printf("Você digitou %d números positivos",contaPositivo);
        System.out.printf("\nVocê digitou %d números negativos",contaNegativo);
        System.out.printf("\nVocê digitou %d números iguais a zero",contaZeros);
    }
}
