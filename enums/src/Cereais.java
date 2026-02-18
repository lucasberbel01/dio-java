public enum Cereais {
    NESCAUBALL(10),
    SUCRILHOS(15),
    FROOTLOOPS(5),
    AVEIA(2);

    final int preco; //junto dos valores padroes eu posso colocar valores complementares como o preco
                     // ele nao muda igual os valores padroes e fica atrelado a cada um

    Cereais(int preco) {
        this.preco = preco;
    }


}
