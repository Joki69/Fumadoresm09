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
            mesa.ponerIngredientes(ingredientes, getName());

        }
    }

}
