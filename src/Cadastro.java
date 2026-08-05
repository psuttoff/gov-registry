import java.util.ArrayList;

public class Cadastro {

    ArrayList<Pessoa> pessoas = new ArrayList<>();

    public boolean cadastrar (Pessoa pessoa) {

        for (Pessoa p : pessoas) {

            if (p.cpf.equals(pessoa.cpf)) {
                return false;
            }
        }

            pessoas.add(pessoa);
            return true;
        }

        public void consultar(String cpf) {

        for (Pessoa p : pessoas) {

            if(p.cpf.equals(cpf)) {

                System.out.println("\n ====== CIDADÃO ENCONTRADO =======");
                System.out.println("Nome: " + p.nome);
                System.out.println("CPF: " + p.cpf);
                System.out.println("Idade: " + p.idade);
                return;
                }
            }
        }

    }
