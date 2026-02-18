import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class UsuarioRepository {
    //onde e como o modelo fica armazanado
    // aqui eu digo somente o que os metodos devem fazer
    // cadastrar, remover, listar, sem se preocupar com logica, se o usuario existe ou nao


    private final Set<Usuario> usuarios = new TreeSet<>(Comparator.comparing(Usuario::getNome)); // ordena por nome

    public void salvar(Usuario user){
        usuarios.add(user);
    }

    public Set<Usuario> listar(){
        return Set.copyOf(usuarios); //faz uma copia para ninguem conseguir apagar o original
    }


    public Usuario buscarPorNome (String nome){
        return usuarios.stream()
                .filter(u->u.getNome().equals(nome)) //filtra pelo nome
                .findFirst() // encontra o primeiro (unico porque so existe 1 com o mesmo nome)
                .orElse(null); //se nao encontrar retorna null
    }

    public boolean deletar(String nome) {

        return usuarios.removeIf(u -> u.getNome().equals(nome));
    }


}
