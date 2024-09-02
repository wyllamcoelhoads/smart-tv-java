public class SmartTv {
    boolean status = false;
    int canal = 1;
    int volume = 30;

    public void ligar() {
        if (!status) {
            status = true;
            System.out.println("Tv ligada!");
        }else {
        System.out.println("Tv já está ligada!");
        }
    }

    public void desligar() {
        if (status) {
            status = false;
            System.out.println("Tv desligada!");
        }else{
            System.out.println("Tv já está desligada!");
        }
    }

    public void aumentaCanal(){
        if (!status){
            System.out.println("A tv esta desligada, favor ligar para aumentar o canal!");
        }else {
            canal++;
            System.out.println("Canal: " + canal);
        }
    }
    public void diminuiCanal(){
        if (!status){
            System.out.println("A tv esta desligada, favor ligar para diminuir o canal!");
        }else {
            canal--;
            System.out.println("Canal: " + canal);
        }
    }
    public void aumentaVolume(){
        if (!status){
            System.out.println("A tv esta desligada, favor ligar para aumentar o volume!");
        }else {
            volume++;
            System.out.println("Volume: " + volume);
        }
    }
    public void dimunuiVolume(){

        if (!status){
            System.out.println("A tv esta desligada, favor ligar para diminuir o volume!");
        }else{
            volume--;
            System.out.println("Volume: " + volume);
        }
    }

    public void mudaCanal( int novoCanal ){
        canal = novoCanal;
        if (!status){
            System.out.println("A tv esta desligada, favor ligar para mudar de canal!");
        }else{
            System.out.println("Canal: " + canal);
        }

    }
}
