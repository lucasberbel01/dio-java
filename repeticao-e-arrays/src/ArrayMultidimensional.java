import java.util.Random;

public class ArrayMultidimensional {
    public static void main(String[] args) {
        Random random = new Random();

        int [][] M = new int[4][4];

        for ( int i = 0; i < M.length; i++){
            for(int j = 0; j < M[i].length; j++){
                M[i][j] = random.nextInt(9);
            }
        }

        for(int [] linha : M){ // para cada linha dentro da matriz...
            for(int coluna : linha){ // para cada coluna/posicao dentro da linha...
                System.out.print(coluna +  " ");

            }
            System.out.println();
        }
    }
}
