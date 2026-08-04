import java.util.ArrayList;

public class Cadastro {

    ArrayList<Pessoa> pessoas = new ArrayList<>();

    public boolean cadastrar (Pessoa pessoa) {

        for (Pessoa p : pessoas){

        if (p.cpf.equals(pessoa.cpf)) {
            return false;}

            pessoas.add(pessoa);
            return true;
        }
    }
}