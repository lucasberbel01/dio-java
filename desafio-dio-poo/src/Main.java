import br.com.dio.desafio.dominio.Conteudo;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Conteudo java = new Curso("curso de java", "descricao curso de java", 8);

        Conteudo js = new Curso("curso de javascript", "descricao curso de javascript", 5);

        Conteudo mentoria = new Mentoria("mentoria de java", "descricao mentoria de java", LocalDate.now());

        System.out.println(java);
        System.out.println(js);
        System.out.println(mentoria);


    }
}
