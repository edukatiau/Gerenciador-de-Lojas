import java.util.Arrays;

public class Shopping {
    private String nome;
    private Endereco endereco;
    private Loja[] lojas;

    public Shopping(String nome, Endereco endereco, int lojasMaximo){
        this.nome = nome;
        this.endereco = endereco;
        this.lojas = new Loja[lojasMaximo];
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Loja[] getLojas() {
        return lojas;
    }

    public void setLojas(Loja[] lojas) {
        this.lojas = lojas;
    }

    @Override
    public String toString() {
        return "Shopping [nome=" + nome + ", endereco=" + endereco + ", lojas=" + Arrays.toString(lojas) + "]";
    }

    public boolean insereLoja(Loja loja){
        for(int i = 0; i < lojas.length;){
            if(lojas[i] == null){
                lojas[i] = loja;
                return true;
            }
        }
        return false;
    }

    public boolean removeLoja(String nomeLoja){
        for(int i = 0; i < lojas.length;){
            if(lojas[i].getNome() == nomeLoja){
                lojas[i] = null;
                return true;
            }
        }
        return false;
    }

    public int quantidadeLojasPorTipo(String tipoLoja){
        int count = 0;
        if(tipoLoja.equals("Cosmetico, Vestuario, Bijuteria, Alimentacao ou Informatica")){
            for(int i = 0; i < lojas.length;){
                if(lojas[i].getClass().getName().equals(tipoLoja)){
                    count++;
                }
            }
            return count;
        }
        return -1;
    }

    public Informatica lojaSeguroMaisCaro(){
        double maiorSeguro = 0.0;
        Informatica lojaMaiorSeguro = null;
        for(int i = 0; i < lojas.length;){
            if(lojas[i].getClass().getName().equals("Informatica")){
                if(((Informatica) lojas[i]).getSeguroEletronicos() > maiorSeguro){
                    maiorSeguro = ((Informatica) lojas[i]).getSeguroEletronicos();
                    lojaMaiorSeguro = (Informatica) lojas[i];
                }
            }
        } 
        if(lojaMaiorSeguro != null){
            return lojaMaiorSeguro;
        } else{
            return null;
        }
    }
}
