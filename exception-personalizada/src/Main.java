public class Main {
    public static void main(String[] args)  {




        validarIdade(-1);



        System.out.println("chegou aqui");


    }


private static void validarIdade(int idade) { //se a classe extender exception eu preciso colocar o throws
        if (idade < 0){
            throw new IdadeNegativaException("idade nao pode ser negativa!");
        }
    }
}

