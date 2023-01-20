public class Main {
    public static void main(String[] args) {
        Mesa mesa = new Mesa();
        Fumador joki = new Fumador("Joki",mesa,1);
       Fumador omar = new Fumador("Omar",mesa,2);
        Fumador juan = new Fumador("Juan",mesa,3);

        Proveedor pablo = new Proveedor("Pablo",mesa);
        System.out.println(joki.getName() + " solo tiene fosforos \n" +
                omar.getName() + " solo tiene tabaco\n" +
                juan.getName() + " solo tiene papel");


        joki.start();
        omar.start();
        juan.start();
        pablo.start();

    }
}