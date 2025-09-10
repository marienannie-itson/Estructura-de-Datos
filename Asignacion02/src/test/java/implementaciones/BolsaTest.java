package implementaciones;

import excepciones.BolsaException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;

public class BolsaTest {

    private BolsaImp bolsa;

    @BeforeEach
    public void setUp() {
        bolsa = new BolsaImp(3);
    }

    @Test
    public void testConstructorValido() {
        assertEquals(0, bolsa.obtenNumObjetos());
        assertTrue(bolsa.vacia());
    }

    @Test
    public void testConstructorTamanoNegativo() {
        assertThrows(BolsaException.class, () -> new BolsaImp(-1));
    }

    @Test
    public void testObtenNumObjetos() {
        bolsa.agrega(10);
        assertEquals(1, bolsa.obtenNumObjetos());
    }

    @Test
    public void testVaciaNueva() {
        assertTrue(bolsa.vacia());
    }

    @Test
    public void testVaciaConElementos() {
        bolsa.agrega(1);
        assertFalse(bolsa.vacia());
    }

    @Test
    public void testVaciaDespuesDeLimpiar() {
        bolsa.agrega(1);
        bolsa.limpia();
        assertTrue(bolsa.vacia());
    }

    @Test
    public void testAgregaNormal() {
        assertTrue(bolsa.agrega(5));
        assertEquals(1, bolsa.obtenNumObjetos());
    }

    @Test
    public void testAgregaCuandoLlena() {
        bolsa.agrega(1);
        bolsa.agrega(2);
        bolsa.agrega(3);
        assertThrows(BolsaException.class, () -> bolsa.agrega(4));
    }

    @Test
    public void testRemueveDeBolsaVacia() {
        assertThrows(BolsaException.class, () -> bolsa.remueve());
    }

    @Test
    public void testRemueveElemento() {
        bolsa.agrega(1);
        Integer eliminado = bolsa.remueve();
        assertEquals(1, eliminado);
        assertEquals(0, bolsa.obtenNumObjetos());
    }

    @Test
    public void testRemueveObjetoDeBolsaVacia() {
        assertThrows(BolsaException.class, () -> bolsa.remueve(1));
    }

    @Test
    public void testRemueveObjetoExistente() {
        bolsa.agrega(10);
        bolsa.agrega(20);
        Integer eliminado = bolsa.remueve(10);
        assertEquals(10, eliminado);
        assertEquals(1, bolsa.obtenNumObjetos());
    }

    @Test
    public void testRemueveObjetoInexistente() {
        bolsa.agrega(5);
        Integer eliminado = bolsa.remueve(10);
        assertNull(eliminado);
        assertEquals(1, bolsa.obtenNumObjetos());
    }

    @Test
    public void testLimpia() {
        bolsa.agrega(1);
        bolsa.agrega(2);
        bolsa.limpia();
        assertTrue(bolsa.vacia());
        assertEquals(0, bolsa.obtenNumObjetos());
    }

    @Test
    public void testCuentaConElementos() {
        bolsa.agrega(5);
        bolsa.agrega(5);
        bolsa.agrega(10);
        assertEquals(2, bolsa.cuenta(5));
        assertEquals(1, bolsa.cuenta(10));
    }

    @Test
    public void testCuentaBolsaVacia() {
        assertThrows(BolsaException.class, () -> bolsa.cuenta(1));
    }

    @Test
    public void testContieneObjeto() {
        bolsa.agrega(7);
        assertTrue(bolsa.contiene(7));
    }

    @Test
    public void testContieneObjetoInexistente() {
        bolsa.agrega(3);
        assertFalse(bolsa.contiene(10));
    }

    @Test
    public void testContieneBolsaVacia() {
        assertThrows(BolsaException.class, () -> bolsa.contiene(1));
    }

    @Test
    public void testObtenObjetosCopiaIndependiente() {
        bolsa.agrega(1);
        ArrayList<Integer> copia = bolsa.obtenObjetos();
        copia.add(99);
        assertFalse(bolsa.obtenObjetos().contains(99));
    }

    @Test
    public void testToString() {
        bolsa.agrega(1);
        bolsa.agrega(2);
        assertEquals("[1, 2]", bolsa.toString());
    }
}
