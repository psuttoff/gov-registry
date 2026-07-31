public class Cadastro {

    public boolean cadastrar(Pessoa pessoa){

        if(pessoa.nome != null && pessoa.cpf != null){
            return true;
        }

        return false;

    }
}