import java.util.Arrays;

public class Loja {
    private String nome;
    private int quantidadeFuncionarios;
    private int salarioBaseFuncionario;
    private Endereco endereço;
    private Data dataFundação;
    private Produto[] estoqueProdutos;

    public Loja(String nome, int quantidadeFuncionarios, int salarioBaseFuncionario, Endereco endereço, Data dataFundação, int limiteProdutos) {
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = salarioBaseFuncionario;
        this.endereço = endereço;
        this.dataFundação = dataFundação;
        this.estoqueProdutos = new Produto[limiteProdutos];
    }

    public Loja(String nome, int quantidadeFuncionarios, Endereco endereço, Data dataFundação, int limiteProdutos) {
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = -1;
        this.endereço = endereço;
        this.dataFundação = dataFundação;
        this.estoqueProdutos = new Produto[limiteProdutos];
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

    public Produto[] getEstoqueProdutos() {
        return estoqueProdutos;
    }

    public void setEstoqueProdutos(Produto[] estoqueProdutos) {
        this.estoqueProdutos = estoqueProdutos;
    }

    @Override
    public String toString() {
        return "Loja [nome=" + nome + ", quantidadeFuncionarios=" + quantidadeFuncionarios + ", salarioBaseFuncionario="
                + salarioBaseFuncionario + ", endereço=" + endereço + ", dataFundação=" + dataFundação
                + ", estoqueProdutos=" + Arrays.toString(estoqueProdutos) + "]";
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

    public void imprimeProdutos(){
        System.out.println(Arrays.toString(estoqueProdutos));
    }

    public boolean insereProduto(Produto produto){
        for(int i = 0; i < estoqueProdutos.length;){
            if(estoqueProdutos[i] == null){
                estoqueProdutos[i] = produto;
                return true;
            }
        }
        return false;
    }

    public boolean removeProduto(String nomeProduto){
        for(int i = 0; i < estoqueProdutos.length;){
            if(estoqueProdutos[i].getNome().equals(nomeProduto)){
                estoqueProdutos[i] = null;
                return true;
            }
        }
        return false;
    }
}
