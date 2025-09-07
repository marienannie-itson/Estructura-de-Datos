package TDA;

import java.util.ArrayList;

public abstract class Bolsa {
    protected int tamBolsa;
    protected int numObjetos;
    protected ArrayList<String> objetos;

    public Bolsa(int tamBolsa){
        this.tamBolsa = tamBolsa;
    }

    public abstract int obtenNumObjetos();
    public abstract boolean vacia();
    public abstract boolean agrega(String objeto);
    public abstract String remueve();
    public abstract String remueve(String objeto);
    public abstract void limpia();
    public abstract int cuenta(String objeto);
    public abstract boolean contiene(String objeto);
    public abstract ArrayList<String> obtenObjetos();
}
