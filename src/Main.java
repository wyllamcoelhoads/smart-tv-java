public class Main {
    public static void main(String[] args) {


        SmartTv smartTv = new SmartTv();
        int novocanal = 22;
        smartTv.ligar();
        smartTv.aumentaCanal();
        smartTv.aumentaVolume();
        smartTv.desligar();
        smartTv.mudaCanal(novocanal);
        smartTv.ligar();
        smartTv.mudaCanal(novocanal);

    }
}