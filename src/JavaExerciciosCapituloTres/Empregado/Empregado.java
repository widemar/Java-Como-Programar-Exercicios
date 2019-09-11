package JavaExerciciosCapituloTres.Empregado;

public class Empregado {
    private String nome;
    private String sobrenome;
    private Double salarioMensal;

    public Empregado(String nome, String sobrenome, Double salarioMensal) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        if (salarioMensal > 0) {
            this.salarioMensal = salarioMensal;
        }

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public Double getSalarioMensal() {
        return salarioMensal;
    }

    public void setSalarioMensal(Double salarioMensal) {
        this.salarioMensal = salarioMensal;
    }

    public Double salarioAnual() {

        return this.salarioMensal * 12;
    }

    public Double salarioAnualComAcrescimos() {
        return ((this.salarioMensal * 0.10) + this.salarioMensal) * 12;
    }
}
