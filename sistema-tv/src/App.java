public class App {
    public static void main(String[] args) throws Exception {
        Tv tv = new Tv();
      
        System.out.println("TV está ligada: " + tv.ligada);
        System.out.println("Volume da TV: " + tv.volume);
        System.out.println("Canal da TV: " + tv.canal);


        tv.ligar();
        tv.aumentarVolume();
        tv.escolherCanal(8);

                System.out.println("\n\n-------------------- Novo Status --------------------\n\n");
        System.out.println("TV está ligada: " + tv.ligada);
        System.out.println("Volume da TV: " + tv.volume);
        System.out.println("Canal da TV: " + tv.canal);
    }
}
