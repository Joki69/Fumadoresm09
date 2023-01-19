public class Fumador extends Thread{
    Mesa mesaDelFumar;

    int material;




    public Fumador(String name, Mesa mesaDelFumar,int material){
        super(name);
        material=material;

        this.mesaDelFumar=mesaDelFumar;
    }




    @Override
    public void run(){
        for(;;) {
            //pilla los materiales para el crafteo
                System.out.println(getName() + " se lia uno");
                mesaDelFumar.hacerseUnCigarro();

                //se lo lia
                try {
                    Thread.sleep((long) Math.random() * 2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(getName() + " se lo fuma");

                //se lo fuma
                try {
                    Thread.sleep((long) Math.random() * 4000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }


        }
    }
}
