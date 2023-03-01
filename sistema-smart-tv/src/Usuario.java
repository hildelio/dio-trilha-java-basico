public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartv = new SmartTv();

        System.out.println("Tv Ligada? " + smartv.ligada);
        System.out.println("Canal atual? " + smartv.canal);
        System.out.println("Volume atual? " + smartv.volume);
        
        smartv.ligar();
        System.out.println("Novo status -> Tv Ligada? " + smartv.ligada);
        smartv.desligar();
        System.out.println("Novo status -> Tv Ligada? " + smartv.ligada);
        
        smartv.aumentarVolume();
        System.out.println("Novo status -> Volume atual? " + smartv.volume);
        smartv.diminuirVolume();
        System.out.println("Novo status -> Volume atual? " + smartv.volume);
        
        smartv.mudarCanal(13);
        System.out.println("Novo status -> Canal atual? " + smartv.canal);
        smartv.aumentarCanal();
        System.out.println("Novo status -> Canal atual? " + smartv.canal);
        smartv.diminuirCanal();
        System.out.println("Novo status -> Canal atual? " + smartv.canal);

    }
}
