public class Alimentacao extends Loja {
    private Data dataAlvara;

    public Alimentacao(String nome, int quantidadeFuncionarios, int salarioBaseFuncionario, Endereco endereço,
            Data dataFundação, Data dataAlvara) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereço, dataFundação);
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
