public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();

        System.out.println("Canal Atual :" + SmartTv.canal);

        smartTv.mudarCanal(13);
        
        System.out.println("Canal Atual :" + SmartTv.canal);


        System.out.println("Volume Atual: " + smartTv.volume);

        System.out.println("TV Ligada ? " + SmartTv.Ligada);
        
        System.out.println("Volume Atual :" + SmartTv.volume);

        smartTv.ligar ();
        System.out.println("Novo Status -> TV Ligada ? " + SmartTv.Ligada);

        smartTv.desligar();
        System.out.println("Novo Status -> TV Ligada ? " + SmartTv.Ligada);
       
    }
}
