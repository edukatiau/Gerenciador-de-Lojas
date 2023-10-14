public class Alimentacao extends Loja {
    private Data dataAlvara;

    public Alimentacao(String nome, int quantidadeFuncionarios, int salarioBaseFuncionario, Endereco endereço,
            Data dataFundação, Data dataAlvara, int limiteProdutos) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereço, dataFundação, limiteProdutos);
        this.dataAlvara = dataAlvara;
    }

    public Data getDataAlvara() {
        return dataAlvara;
    }

    public void setDataAlvara(Data dataAlvara) {
        this.dataAlvara = dataAlvara;
    }

    @Override
    public String toString() {
        return "Alimentacao [dataAlvara=" + dataAlvara + "]";
    }
}
