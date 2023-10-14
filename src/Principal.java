import java.util.Scanner;

public class Principal {
    static Scanner sc = new Scanner(System.in);
    private static Produto produto1;
    private static Loja loja1;

    public static void main(String[] args) throws Exception {
        
        menu();
        if(produto1.estaVencido(new Data(20, 10, 2023))){
            System.out.println("PRODUTO VENCIDO");
        } else {
            System.out.println("PRODUTO NÃO VENCIDO");
        }
        System.out.println(loja1.toString());
    }

    public static void menu() {
        System.out.println("(1) criar uma loja");
        System.out.println("(2) criar um produto");
        System.out.println("(3) sair");

        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                criarLoja();
                menu();
                break;
            case 2:
                criarProduto();
                menu();
                break;
            case 3:
                break;
            default:
                System.out.println("Opção inválida");
                menu();
                break;
        }
    }

    public static void criarLoja() {
        System.out.println("Insira o nome da Loja: ");
        String nome = sc.next();
        System.out.println("Insira a quantidade de funcionários: ");
        int quantidadeFuncionarios = sc.nextInt();
        System.out.println("Insira o salário Base do Funcionário: ");
        int salarioBaseFuncionario = sc.nextInt();

        System.out.println("Insira o nome da Rua: ");
        String nomeDaRua = sc.next();
        System.out.println("Insira o nome da Cidade: ");
        String cidade = sc.next();
        System.out.println("Insira o nome do Estado: ");
        String estado = sc.next();
        System.out.println("Insira o nome do País: ");
        String pais = sc.next();
        System.out.println("Insira o CEP: ");
        String cep = sc.next();
        System.out.println("Insira o número: ");
        String numero = sc.next();
        System.out.println("Insira o completo: ");
        String complemento = sc.next();
        Endereco endereço = new Endereco(nomeDaRua, cidade, estado, pais, cep, numero, complemento);

        System.out.println("Insira o dia de fundação: ");
        int dia = sc.nextInt();
        System.out.println("Insira o mês de fundação: ");
        int mes = sc.nextInt();
        System.out.println("Insira o ano de fundação: ");
        int ano = sc.nextInt();
        Data dataFuncação = new Data(dia, mes, ano);

        loja1 = new Loja(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereço, dataFuncação, 1);
    }

    public static void criarProduto(){
        System.out.println("Insira o nome do produto: ");
        String nome = sc.next(); 
        System.out.println("Insira o preço do produto: ");
        int preco = sc.nextInt();
        System.out.println("Insira o dia da validade: ");
        int dia = sc.nextInt();
        System.out.println("Insira o mês da validade: ");
        int mes = sc.nextInt();
        System.out.println("Insira o ano da validade: ");
        int ano = sc.nextInt();
        Data dataValidade = new Data(dia, mes, ano);
        
        produto1 = new Produto(nome, preco, dataValidade);
    }

}
