public class Main {
    public static void main(String[] args) {
        SmartTv stv = new SmartTv();

        stv.statusGeral();

        stv.ligarDesligar();

        stv.trocarVolume("+");

        stv.trocarVolume("-");

        stv.mudarCanal("+");

        stv.mudarCanal("-");

        stv.ligarDesligar();
    }
}
