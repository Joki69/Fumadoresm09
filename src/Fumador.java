public class Fumador extends Thread{
    Mesa mesaDelFumar;

    int material;




    public Fumador(String name, Mesa mesaDelFumar,int material){
        super(name);
        this.material=material;

        this.mesaDelFumar=mesaDelFumar;
    }




    @Override
    public void run(){
        for(;;) {
            //pilla los materiales para el crafteo


                mesaDelFumar.hacerseUnCigarro(material,getName());
                //se lo lia
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(getName() + " se lo fuma agustisimo");

                //se lo fuma
                try {
                    Thread.sleep(4000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }


        }
    }
}
