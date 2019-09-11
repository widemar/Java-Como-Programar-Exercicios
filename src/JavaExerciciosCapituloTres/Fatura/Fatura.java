package JavaExerciciosCapituloTres.Fatura;

public class Fatura {
    private String numero;
    private String descricao;
    private Integer quantidade;
    private Double preco;

    public Fatura(String numero, String descricao, Integer quantidade, Double preco) {
        this.numero = numero;
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }
    public Double calculaFatura (){
        if (this.quantidade<=0){
            this.quantidade=0;
        }
        if (this.preco<=0){
            this.preco =0.0;
        }
        double resultado = this.quantidade*this.preco;
        return resultado;



    }
}
