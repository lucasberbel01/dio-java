import java.util.Objects;

public class Usuario {
    //a classe usuario é o modelo, ela serve apenas para definir qual dados o modelo vai ter
    // e quais as regras fazem ela ser valida


    public static final String USER = "user";
    public static final String ADMIN = "admin";

    private String tipoUsuario;
    private String nome;
    private String senha;


    public Usuario(String tipoUsuario, String nome, String senha) {
        setTipoUsuario(tipoUsuario);
        setNome(nome);
        setSenha(senha);
    }

    public String getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(String tipoUsuario) {
        if(!tipoUsuario.equals(USER) && !tipoUsuario.equals(ADMIN)){
            throw new TipoDeUsuarioInvalidoException("Tipo de usuario invalido!");
        }
        this.tipoUsuario = tipoUsuario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if(nome == null || nome.isBlank()){
            throw new IllegalArgumentException("Nome inválido");
        }
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        if(senha.length() < 7){
            throw new SenhaInvalidaException("a senha deve conter pelo menos 7 caracteres");
        }
        this.senha = senha;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Usuario usuario = (Usuario) o;
        return Objects.equals(nome, usuario.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome);
    }

    @Override
    public String toString() {
        return "Usuario: " + nome +
                " Tipo: " + tipoUsuario +
                " Senha: " + senha;
    }
}
