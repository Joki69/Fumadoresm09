public class Proveedor extends  Thread{
         Mesa mesa;

      public Proveedor(String name, Mesa mesa){
          super(name);
          this.mesa=mesa;
      }


}
