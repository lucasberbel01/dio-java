package Repo;

import model.Titular;

import java.util.*;

public class TitularRepository {

    private int idTitular = 1;

    private final Map<Integer, Titular> titulares = new HashMap<>();

    public void salvarTitular(Titular t){
        t.setId(idTitular);
        titulares.put(idTitular, t);
        idTitular++;
    }


    public Collection<Titular> listarTitulares(){
        return Collections.unmodifiableCollection(titulares.values()); //faz uma copia da collection pra niguem apagar
    }

    public Optional<Titular> buscarPorId(int id){
        return Optional.ofNullable(titulares.get(id));
    }

    public void deletarTitular(int id){
        titulares.remove(id);
    }
}
