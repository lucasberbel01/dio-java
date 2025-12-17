public class SmartTv {
    private boolean isOn;
    private int volume;
    private int canal;

    public SmartTv(){}

    public SmartTv(boolean isOn, int volume, int canal) {
        this.isOn = isOn;
        this.volume = volume;
        this.canal = canal;
    }

    public boolean isOn() {
        return isOn;
    }

    public void setOn(boolean on) {
        isOn = on;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        if(volume> 100 || volume < 0){
            System.out.println("volume invalido!");
            return;
        }

        this.volume = volume;

    }

    public int getCanal() {
        return canal;
    }

    public void setCanal(int canal) {
        this.canal = canal;
    }

    public void ligarDesligar(){
        if (isOn()){
            System.out.println("Desligando TV...");
            setOn(false);

        }
        else {
            setOn(true);
            System.out.println("Ligando a tv...");
        }
        System.out.println("status TV: "+ isOn());
    }

    public void mudarCanal(String operador){

        if("+".equals(operador)){
            System.out.println("trocando de canal +");
            setCanal(getCanal() + 1);
        }
        else{
            System.out.println("Trocando de canal -");
            setCanal(getCanal() - 1);
        }
        System.out.println("status canal: "+ getCanal());
    }

    public void trocarVolume(String operador){


        if ("+".equals(operador)){
            System.out.println("aumentando o volume");
            setVolume(getVolume() + 1);
        }
        else{
            System.out.println("diminuindo o volume");
            setVolume(getVolume() - 1);
        }
        System.out.println("status volume: "+ getVolume());
    }

    public void statusGeral(){
        System.out.println("Ligada? "+ isOn());
        System.out.println("canal: "+ getCanal());
        System.out.println("volume "+ getVolume());
    }

}
