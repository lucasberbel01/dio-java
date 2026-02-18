package service;

import Repo.TitularRepository;
import model.Titular;

import java.util.Collection;

public class TitularService {
    private TitularRepository repo;

    public TitularService(TitularRepository repository) {
        this.repo= repository;
    }

    public void criarTitular(String nome, String email){
        if(repo.listarTitulares().stream().anyMatch(titular -> titular.getEmail().equalsIgnoreCase(email))){ //
            throw new RuntimeException("Este email ja pertence a um titular!");
        }

        Titular titular = new Titular(nome,email);

        repo.salvarTitular(titular);

    }

    public Titular buscarPorId(int id){
        return repo.buscarPorId(id).orElseThrow(()-> new IllegalArgumentException("Titular nao encontrado!"));

    }

    public Collection<Titular> listarTitulares() {
        return repo.listarTitulares();
    }

    public void excluirTitular(int id){
        repo.deletarTitular(id);
    }
}
