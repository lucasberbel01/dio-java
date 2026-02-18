public class UsuarioService {
    /*service é o cerebro
     Ela responde perguntas como:

    Posso cadastrar esse usuário?

    O nome já existe?

    Qual erro mostrar se algo der errado?

    entao no service eu monto toda a logica e validacao


     */

    private UsuarioRepository repository = new UsuarioRepository();

    public void cadastrar(String tipo, String nome, String senha) {

        if (repository.buscarPorNome(nome) != null) {

            throw new RuntimeException("Usuário já existe");
        }

        Usuario usuario = new Usuario(tipo, nome, senha);
        repository.salvar(usuario);
    }

    public void listarUsuarios() {

        repository.listar().forEach(System.out::println);
    }

    public void removerUsuario(String nome) {
        boolean removido = repository.deletar(nome);
        if (!removido) {
            throw new RuntimeException("O usuário não existe!");
        }
    }

}
