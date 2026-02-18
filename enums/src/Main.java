public class Main {
    public static void main(String[] args) {
        System.out.println(DiasDaSemana.SEXTA); //para chamar ou usar os valores basta usar assim

        System.out.println(Cereais.NESCAUBALL); // dessa forma eu chamo apenas o valor principal
        System.out.println(Cereais.SUCRILHOS.preco); // assim eu chamo o valor complementar

        Cereais.values(); // assim eu chamo um array com todos os valores

        for (Cereais cereais : Cereais.values()){ // entao basta fazer um foreach para printar eles
            System.out.println(cereais);
        }





    }
}
