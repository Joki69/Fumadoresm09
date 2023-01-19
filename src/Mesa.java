public class Mesa {
    private int combinacionIngredientes;

    private boolean mesaVacía;

    public Mesa(int combinacionIngredientes){
        this.combinacionIngredientes=combinacionIngredientes;
        mesaVacía = false;
        combinaciónEnMesa(combinacionIngredientes);
    }

    public synchronized void hacerseUnCigarro()  {
        try {
            while(mesaVacía) wait();
            mesaVacía = true;
            System.out.println("No hay ingredientes en la mesa");
            notifyAll();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public synchronized void ponerIngredientes(int ingredientesRandom) {
        try {
            while(!mesaVacía) wait();
            mesaVacía = false;

            combinacionIngredientes = ingredientesRandom;
            notifyAll();
            combinaciónEnMesa(combinacionIngredientes);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void combinaciónEnMesa(int combinacionIngredientes){
        if(combinacionIngredientes ==1 ){
            System.out.println("En la mesa hay papel y tabaco");
        }
        else if (combinacionIngredientes == 2) {
            System.out.println("En la mesa hay papel y fosforo");
        }
        else{
            System.out.println("En la mesa hay tabaco y fosforo");
        }
    }
}
