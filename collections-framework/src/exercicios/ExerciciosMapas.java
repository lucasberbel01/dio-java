package exercicios;



import java.util.*;

public class ExerciciosMapas {
    public static void main(String[] args) {
        /*
        Map<String, String> agenda = new HashMap<>();

        agenda.put("lucas", "11963013738");
        agenda.put("marcella", "1194813900");
        agenda.put("yudi", "40028922");

        Set<String> nomes = agenda.keySet();

        for(String n : nomes){
            System.out.print(n  + " | ");
        }

        Collection<String> telefones = agenda.values();
        System.out.println();
        for(String t : telefones){

            System.out.print(t  + " | ");
        }


        System.out.println();
        for (Map.Entry<String, String> contato : agenda.entrySet()){
            System.out.println(contato);
        }



        Map<String, Integer> alunos = new HashMap<>();

        alunos.put("lucas", 10);
        alunos.put("marcella", 10);
        alunos.put("enzo", 7);
        alunos.put("ana", 4);
        alunos.put("pedro", 2);

        System.out.println(alunos.entrySet());

        for(Map.Entry<String, Integer> a : alunos.entrySet()){
            if( a.getValue() >= 7){
                System.out.println("aluno com nota >7: " + a.getKey());
            }
        }

        Collection<Integer> notas = alunos.values();
        int soma = 0;

        for (int n : notas){
            soma+=n;
        }
        double media = soma/ notas.size();

        System.out.println(media);

        System.out.println(alunos.keySet());
        System.out.println(alunos.values());
        System.out.println(alunos.entrySet());





                Map<String, Integer> notas = new HashMap<>();
                notas.put("João", 7);
                notas.put("Maria", 9);
                notas.put("Pedro", 6);
                notas.put("Ana", 8);

                List<Map.Entry<String, Integer>> lista =
                        new ArrayList<>(notas.entrySet());

                // Ordem crescente
                lista.sort(Comparator.comparing(Map.Entry::getValue));
                System.out.println("Crescente:");
                for (Map.Entry<String, Integer> entry : lista) {
                    System.out.println(entry.getKey() + " - " + entry.getValue());
                }



*/

        Map<Integer, Produto> produtos = new HashMap<>(); //cria o mapa

        produtos.put(1, new Produto("Teclado", 150));
        produtos.put(2, new Produto("Mouse", 80));
        produtos.put(3, new Produto("Monitor", 900));
        produtos.put(4, new Produto("Headset", 150));

        List<Map.Entry<Integer, Produto>> lista = //transforma o mapa em lista
                new ArrayList<>(produtos.entrySet());

        lista.sort( //aqui ocorre a comparacao
                Comparator
                        .comparing((Map.Entry<Integer, Produto> e) -> e.getValue().getPreco())//comparando por preco
                        .thenComparing(e -> e.getValue().getNome())//entao pelo nome
        );

        for (Map.Entry<Integer, Produto> entry : lista) {
            Produto p = entry.getValue();
            System.out.println(entry.getKey() + " - " + p.getNome() + " - R$ " + p.getPreco());
        }




    }
}
class Produto{
    private String nome;
    private int preco;

    public Produto(String nome, int preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public int getPreco() {
        return preco;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Produto produto = (Produto) o;
        return preco == produto.preco && Objects.equals(nome, produto.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, preco);
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                '}';
    }
}
