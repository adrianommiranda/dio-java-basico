public class Tv {
    public boolean ligada = false;
    public int volume = 10;
    public int canal = 1;

    public void ligar(){
        ligada = true;
    }

    public void desligar(){
        ligada = false;
    }

    public void aumentarVolume(){
        volume = volume + 5;
    }

    public void diminuirVolume(){
        volume = volume - 5;
    }

    public void passarCanal(){
        canal = canal + 1;
    }

    public void voltarCanal(){
        canal = canal - 1;
    }

    public void escolherCanal(int canal){
        this.canal = canal;
    }


}
