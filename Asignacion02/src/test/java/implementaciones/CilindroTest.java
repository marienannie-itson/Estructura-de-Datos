package implementaciones;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CilindroTest {
    @Test
    public void testConstructorNegativo(){
        assertThrows(IllegalArgumentException.class, () -> {
            new CilindroImp(-2, 4);
        });

        assertThrows(IllegalArgumentException.class, () -> {
            new CilindroImp(3, -4);
        });

        assertThrows(IllegalArgumentException.class, () -> {
            new CilindroImp(-3, -7);
        });
    }
}
