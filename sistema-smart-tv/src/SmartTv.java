public class SmartTv {
    static boolean Ligada=false;
    static int canal = 1;
    static int volume = 26;

    public void mudarCanal (int novoCanal){
        canal = novoCanal;
    
    }
    public void aumentarCanal(){
        canal++;
    }

    public void diminirCanal(){
        canal--;
    }

    public void aumentarVolume(){
        volume++;     // é o mesmo que -> volume = volume + 1;
        System.out.println("Aumentar o volume para: " + volume);
    }

    public void diminuirVolume(){
        volume--;
        System.out.println("Diminuindo o volume para: " + volume);
    }

    public void ligar(){
        Ligada=true;
    }

    public void desligar(){
        Ligada=false;
    }

}
