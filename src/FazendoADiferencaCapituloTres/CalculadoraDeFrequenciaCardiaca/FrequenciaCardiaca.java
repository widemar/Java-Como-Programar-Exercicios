package FazendoADiferencaCapituloTres.CalculadoraDeFrequenciaCardiaca;

public class FrequenciaCardiaca {
    private String nome;
    private String sobrenome;
    private Integer dia;
    private Integer mes;
    private Integer ano;

    public FrequenciaCardiaca(String nome, String sobrenome, Integer dia, Integer mes, Integer ano) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
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

    public Integer getDia() {
        return dia;
    }

    public void setDia(Integer dia) {
        this.dia = dia;
    }

    public Integer getMes() {
        return mes;
    }

    public void setMes(Integer mes) {
        this.mes = mes;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    public int idade() {
        int idade1 = 2019 - this.ano;
        return idade1;
    }

    public int frequenciaCardicacaMaxima() {
        int idade1 = 2019 - this.ano;
        int frequenciaCardiaca = 220 - idade1;
        return frequenciaCardiaca;
    }

    public void frequenciaCardiacaAlvo() {
        int idade1 = 2019 - this.ano;
        int frequenciaCardiaca = 220 - idade1;
        double frequenciaMinimaAlvo = frequenciaCardiaca * 0.50;
        double frequeciaMaximaAlvo = frequenciaCardiaca * 0.85;
        System.out.println("Sua frequência cardiaca minima alvo é de " + frequenciaMinimaAlvo);
        System.out.println("Sua frequência cardiaca máxima alvo é de " + frequeciaMaximaAlvo);
    }

    public void exibeData() {
        System.out.println("Data de nascimento " + this.dia + "/" + this.mes + "/" + this.ano);
    }
}
