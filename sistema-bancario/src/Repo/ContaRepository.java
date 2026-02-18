package Repo;

import model.Conta;

import java.util.*;


public class ContaRepository {
    private int numeroDaConta = 1;
    private final Map<Integer, Conta> contas = new HashMap<>();

    public void salvarConta(Conta c){
        c.setNumeroDaConta(numeroDaConta);
        contas.put(numeroDaConta, c);
        numeroDaConta++;

    }

    public Collection<Conta> listarContas(){
        return Collections.unmodifiableCollection(contas.values());
    }

    public Optional<Conta> buscarPorNumero(int numero){
        return Optional.ofNullable(contas.get(numero));
    }

    public void deletarConta(int numero){
        contas.remove(numero);
    }
}
