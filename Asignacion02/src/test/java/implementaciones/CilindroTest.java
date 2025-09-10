package implementaciones;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CilindroTest {

    @Test
    public void testConstructorConValoresValidos() {
        CilindroImp cilindro = new CilindroImp(5, 10);
        assertNotNull(cilindro);
    }

    @Test
    public void testConstructorConRadioNegativo() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new CilindroImp(-5, 10);
        });
        assertEquals("La altura y el radio no pueden ser negativos", exception.getMessage());
    }

    @Test
    public void testConstructorConAlturaNegativa() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new CilindroImp(5, -10);
        });
        assertEquals("La altura y el radio no pueden ser negativos", exception.getMessage());
    }

    @Test
    public void testConstructorConRadioYAlturaNegativos() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new CilindroImp(-5, -10);
        });
        assertEquals("La altura y el radio no pueden ser negativos", exception.getMessage());
    }

    @Test
    public void testArea() {
        CilindroImp cilindro = new CilindroImp(5, 20);
        double esperado = 2 * Math.PI * 5 * (20 + 5); // 2πr(h+r)
        assertEquals(esperado, cilindro.area(), 0.0001);
    }

    @Test
    public void testVolumen() {
        CilindroImp cilindro = new CilindroImp(5, 20);
        double esperado = Math.PI * 5 * 5 * 20; // πr²h
        assertEquals(esperado, cilindro.volumen(), 0.0001);
    }

    @Test
    public void testToString() {
        CilindroImp cilindro = new CilindroImp(5, 20);
        assertEquals("Cilindro(5.0, 20.0)", cilindro.toString());
    }
}
