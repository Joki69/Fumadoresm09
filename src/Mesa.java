public class Mesa {
    private int combinacionIngredientes;

    public int getCombinacionIngredientes() {
        return combinacionIngredientes;
    }

    public void setCombinacionIngredientes(int combinacionIngredientes) {
        this.combinacionIngredientes = combinacionIngredientes;
    }

    private boolean mesaVacía;

    public Mesa(){
        this.combinacionIngredientes=0;
        mesaVacía = true;
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
            this.combinacionIngredientes = ingredientesRandom;
            combinaciónEnMesa(combinacionIngredientes);
            notifyAll();

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
        else if (combinacionIngredientes==3){
            System.out.println("En la mesa hay tabaco y fosforo");
        }
        else{
            System.out.println("No hay ingredientes en la mesa");
        }
    }
}
