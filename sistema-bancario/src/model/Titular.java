package model;

public class Titular {
    private int id;
    private String nome;
    private String email;
    private double saldo;

    public Titular(String nome, String email) {
        setNome(nome);
        setEmail(email);
        this.saldo = 0d;
    }


    public int getId() {
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if(nome == null){
            throw new RuntimeException("O nome nao pode ser nulo!");
        }
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if(email == null || !email.contains("@")){
            throw new RuntimeException("Email invalido!");
        }
        this.email = email;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Titular{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", saldo=" + saldo +
                '}';
    }


}
