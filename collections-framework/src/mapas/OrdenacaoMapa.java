package mapas;

import java.util.*;

public class OrdenacaoMapa {
    public static void main(String[] args) {
        //exiba em ordem aleatoria
        Map<String, Livro> meusLivros = new HashMap<>(){{
           put("Hawking, Stephen", new Livro("uma breve historia do tempo", 256));
           put("Duhigg, Charles", new Livro("o poder do habito", 408));
           put("Harari, Yuval Noah", new Livro("21 licoes para o seculo 21", 432));
        }};

        System.out.println(meusLivros);

        //exiba em ordem de insercao
        Map<String, Livro> meusLivros2 = new LinkedHashMap<>(){{
            put("Hawking, Stephen", new Livro("uma breve historia do tempo", 256));
            put("Duhigg, Charles", new Livro("o poder do habito", 408));
            put("Harari, Yuval Noah", new Livro("21 licoes para o seculo 21", 432));
        }};
        System.out.println(meusLivros2);

        //ordem natural dos autores
        Map<String, Livro> meusLivros3 = new TreeMap<>(meusLivros2);

        for(Map.Entry<String, Livro> livros : meusLivros3.entrySet()){
            System.out.println("autor: " + livros.getKey() + " livro: " + livros.getValue().getNome());
        }



    }
}

class Livro {
    private String nome;
    private int paginas;

    public Livro(String nome, int paginas) {
        this.nome = nome;
        this.paginas = paginas;
    }

    public String getNome() {
        return nome;
    }

    public int getPaginas() {
        return paginas;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Livro livro = (Livro) o;
        return paginas == livro.paginas && Objects.equals(nome, livro.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, paginas);
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", paginas=" + paginas +
                '}';
    }
}
