import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

    Scanner leitura = new Scanner(System.in);

    Pessoa pessoa = new pessoa();

    System.out.println("===== CADASTRO DE CIDADÃO ======");

    System.out.println("Nome: ");
    pessoa.nome = leitura.nextLine();

    System.out.println("CPF: ");
    pessoa.cpf = leitura.nextLine();

    System.out.println("Idade: ");
    pessoa.idade = leitura.nextInt();

    Cadastro cadastro = new Cadastro();

    boolean cadastrou = cadastro.cadastrar(pessoa);

    if(cadastrou){
        System.out.println("Cidadão cadastrado com sucesso!");
    }

    else{
        System.out.println("Erro ao cadastrar cidadão.");
    }

    leitura.close();

    }
}