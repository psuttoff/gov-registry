import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);
        Cadastro cadastro = new Cadastro();

        boolean executando = true;

        while (executando) {

            System.out.println("\n==============================");
            System.out.println("       GOV REGISTRY");
            System.out.println("==============================");
            System.out.println("1 - Cadastrar cidadão");
            System.out.println("2 - Consultar cidadão");
            System.out.println("3 - Listar cidadãos");
            System.out.println("4 - Remover cidadão");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = leitura.nextInt();
            leitura.nextLine();

            switch (opcao) {

                case 1:

                    Pessoa pessoa = new Pessoa();

                    System.out.print("Nome: ");
                    pessoa.nome = leitura.nextLine();

                    System.out.print("CPF: ");
                    pessoa.cpf = leitura.nextLine();

                    System.out.print("Idade: ");
                    pessoa.idade = leitura.nextInt();
                    leitura.nextLine();

                    if (cadastro.cadastrar(pessoa)) {
                        System.out.println("\n✅ Cidadão cadastrado com sucesso!");
                    } else {
                        System.out.println("\n❌ CPF já cadastrado.");
                    }

                    break;

                case 2:

                    System.out.print("Digite o CPF: ");
                    String cpf = leitura.nextLine();

                    cadastro.consultar(cpf);

                    break;

                case 3:

                    cadastro.listar();

                    break;

                case 4:

                    System.out.print("Digite o CPF para remover: ");
                    String cpfRemover = leitura.nextLine();

                    cadastro.remover(cpfRemover);

                    break;

                case 0:

                    executando = false;
                    System.out.println("Encerrando sistema...");

                    break;

                default:

                    System.out.println("Opção inválida.");

            }

        }

        leitura.close();

    }

}