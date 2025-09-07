package TDA;

import java.util.ArrayList;

public abstract class Bolsa {
    protected int tamBolsa;
    protected int numObjetos;
    protected ArrayList<Integer> objetos;

    public Bolsa(int tamBolsa){
        this.tamBolsa = tamBolsa;
    }

    public abstract int obtenNumObjetos();
    public abstract boolean vacia();
    public abstract boolean agrega(Integer objeto);
    public abstract Integer remueve();
    public abstract Integer remueve(Integer objeto);
    public abstract void limpia();
    public abstract int cuenta(Integer objeto);
    public abstract boolean contiene(Integer objeto);
    public abstract ArrayList<Integer> obtenObjetos();
}
