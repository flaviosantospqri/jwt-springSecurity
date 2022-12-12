public class usuario {
    public static void main(String[] args) throws Exception {
       SmartTv smartTv = new SmartTv();

       System.out.println("Tv Ligada? " + smartTv.ligada);
       System.out.println("Tv Canal? " + smartTv.canal);
       System.out.println("Tv Volume? " + smartTv.volume);

       smartTv.ligar();

       System.out.println("Tv Ligada? " + smartTv.ligada);

       smartTv.desligar();

       System.out.println("Tv Ligada? " + smartTv.ligada);

       smartTv.mudarCanal(33);

       System.out.println(smartTv.canal);
    }
}
