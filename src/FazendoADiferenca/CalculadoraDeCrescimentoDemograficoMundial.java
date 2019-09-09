package FazendoADiferenca;

public class CalculadoraDeCrescimentoDemograficoMundial {
    public static void main(String[] args) {
        long pMundialAtual = 7729103000L;
        double taxaCrescimentoAnual = 0.012;

        long população2021 = (long)(pMundialAtual*taxaCrescimentoAnual+pMundialAtual);
        long população2022 = (long)(pMundialAtual*taxaCrescimentoAnual+população2021);
        long população2023 = (long)(pMundialAtual*taxaCrescimentoAnual+população2022);
        long população2024 = (long)(pMundialAtual*taxaCrescimentoAnual+população2023);
        long população2025 = (long)(pMundialAtual*taxaCrescimentoAnual+população2024);

        System.out.println("População Estimada em 2021 é de "+população2021);
        System.out.println("População Estimada em 2022 é de "+população2022);
        System.out.println("População Estimada em 2023 é de "+população2023);
        System.out.println("População Estimada em 2024 é de "+população2024);
        System.out.println("População Estimada em 2025 é de "+população2025);

    }
}
