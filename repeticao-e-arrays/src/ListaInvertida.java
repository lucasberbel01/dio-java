public class ListaInvertida {
    public static void main(String[] args) {

        int[] vetor = {-5, 10, 22, 3, 55};

        for (int i = (vetor.length - 1); i >= 0; i--){
            System.out.print(vetor[i] + " ");
        }
    }
}
