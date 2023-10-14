public class Loja {
    private String nome;
    private int quantidadeFuncionarios;
    private int salarioBaseFuncionario;
    private Endereco endereço;
    private Data dataFundação;

    public Loja(String nome, int quantidadeFuncionarios, int salarioBaseFuncionario, Endereco endereço, Data dataFundação) {
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = salarioBaseFuncionario;
        this.endereço = endereço;
        this.dataFundação = dataFundação;
    }

    public Loja(String nome, int quantidadeFuncionarios, Endereco endereço, Data dataFundação) {
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = -1;
        this.endereço = endereço;
        this.dataFundação = dataFundação;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidadeFuncionarios() {
        return quantidadeFuncionarios;
    }

    public void setQuantidadeFuncionarios(int quantidadeFuncionarios) {
        this.quantidadeFuncionarios = quantidadeFuncionarios;
    }

    public int getSalarioBaseFuncionario() {
        return salarioBaseFuncionario;
    }

    public void setSalarioBaseFuncionario(int salarioBaseFuncionario) {
        this.salarioBaseFuncionario = salarioBaseFuncionario;
    }

    public Endereco getEndereco() {
        return endereço;
    }

    public void setEndereco(Endereco endereço) {
        this.endereço = endereço;
    }

    public Data getDataFundacao() {
        return dataFundação;
    }

    public void setDataFundacao(Data dataFundação) {
        this.dataFundação = dataFundação;
    }

    @Override
    public String toString() {
        return "Loja [nome=" + nome + ", quantidadeFuncionarios=" + quantidadeFuncionarios + ", salarioBaseFuncionario="
                + salarioBaseFuncionario + ", endereço=" + endereço + ", dataFundação=" + dataFundação + "]";
    }

    public int gastosComSalario() {
        if (salarioBaseFuncionario != -1) {
            return salarioBaseFuncionario * quantidadeFuncionarios;
        } else {
            return -1;
        }
    }

    public char tamanhoDaLoja() {
        if (quantidadeFuncionarios < 10) {
            return 'P';
        } else if (10 <= quantidadeFuncionarios && quantidadeFuncionarios <= 30) {
            return 'M';
        } else {
            return 'G';
        }
    }
}
