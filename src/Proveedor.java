public class Proveedor extends  Thread{
         Mesa mesa;

      public Proveedor(String name, Mesa mesa){
          super(name);
          this.mesa=mesa;
      }
    @Override
    public void run() {
        for(;;) {
            int ingredientes=(int) Math.floor(Math.random() * 3+1);
            mesa.ponerIngredientes(ingredientes);
            try {
                Thread.sleep((long) Math.random()*1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(getName() + " ha puesto los ingredientes");
        }
    }

}
