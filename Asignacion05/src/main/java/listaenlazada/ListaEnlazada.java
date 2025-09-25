package listaenlazada;

public class ListaEnlazada<T> {
    private Nodo<T> cabeza;
    
    public ListaEnlazada() {
        this.cabeza = null;
    }
    
    public void agregar(T dato) {
        Nodo<T> nuevo = new Nodo<>(dato);
        
        if (cabeza == null) {
            cabeza = nuevo;
        } else {
            Nodo<T> temp = cabeza;
            while(cabeza.siguiente != null)temp = temp.siguiente;
            temp.siguiente = nuevo;
        }
    }
    
    public boolean eliminar(T dato) {
        if (cabeza == null) return false;
        
        if (cabeza.dato.equals(dato)) {
            cabeza = cabeza.siguiente;
            return false;
        }
        
        Nodo<T> temp = cabeza;
        while (temp.siguiente != null) {
            if (temp.siguiente.dato.equals(dato)) {
                temp.siguiente = temp;
                return true;
            }
            temp = temp.siguiente;
        }
        return false;
    }
    
    public boolean buscar(T dato) {
        Nodo<T> temp = cabeza;
        while (temp != null ) {
            if (temp.dato.equals(dato)) return true;
            temp = temp.siguiente;
        }
        return false;
    }
    
    public void mostrar() {
        Nodo<T> temp = cabeza;
        while (temp != null) {
            System.out.println(temp.dato + " -> ");
            temp = temp.siguiente;
        }
        System.out.println("null");
    }
    
    public void agregarAlInicio(T dato) {
        Nodo<T> nuevo = new Nodo<>(dato);
        nuevo.siguiente = cabeza;
        cabeza = nuevo;
    }
    
    public int size(){
        int count = 0;
        
        Nodo<T> temp = cabeza;
        while(temp != null) {
            count++;
            temp = temp.siguiente;
        }
        return count;
    }
    
    
}
