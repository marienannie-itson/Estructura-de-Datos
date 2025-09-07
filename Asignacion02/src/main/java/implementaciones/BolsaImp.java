package implementaciones;

import TDA.Bolsa;
import excepciones.BolsaException;

import java.util.ArrayList;
import java.util.Random;

public class BolsaImp extends Bolsa {
    public BolsaImp(int tamBolsa) {
        super(tamBolsa);

        if (tamBolsa < 0) throw new BolsaException();

        this.numObjetos = 0;
        this.objetos = new ArrayList<Integer>(tamBolsa);
    }

    @Override
    public int obtenNumObjetos() { return numObjetos; }

    @Override
    public boolean vacia() { return objetos.isEmpty(); }

    @Override
    public boolean agrega(Integer objeto) {
        if (numObjetos == tamBolsa) throw new BolsaException("La bolsa llena, no se pueden agregar más objetos.");

        objetos.add(objeto);
        numObjetos++;
        return true;
    }

    @Override
    public Integer remueve() {
        if (numObjetos == 0) throw new BolsaException("La bolsa está vacía, no se puede eliminar nada.");

        Random r = new Random();
        int index = r.nextInt(numObjetos);

        Integer eliminado = objetos.get(index);
        objetos.remove(index);
        numObjetos--;

        return eliminado;
    }

    @Override
    public Integer remueve(Integer objeto) {
        if (numObjetos == 0) throw new BolsaException("La bolsa está vacía, no se puede eliminar nada.");

        int index = objetos.indexOf(objeto);
        if (index == -1 ) return null;

        Integer eliminado = objetos.get(index);
        objetos.remove(index);
        numObjetos--;

        return eliminado;
    }


    @Override
    public void limpia() { objetos.clear(); numObjetos = 0; }

    @Override
    public int cuenta(Integer objeto) {
        if (numObjetos == 0) throw new BolsaException("La bolsa está vacía");

        int count = 0;
        for (Integer obj : objetos) if (objeto.equals(obj)) count++;

        return count;
    }

    @Override
    public boolean contiene(Integer objeto) {
        if (numObjetos == 0) throw new BolsaException("La bolsa está vacía");

        return objetos.contains(objeto);
    }

    @Override
    public ArrayList<Integer> obtenObjetos() {
        return new ArrayList<Integer>(objetos);
    }

    @Override
    public String toString() {  return objetos.toString(); }
}

