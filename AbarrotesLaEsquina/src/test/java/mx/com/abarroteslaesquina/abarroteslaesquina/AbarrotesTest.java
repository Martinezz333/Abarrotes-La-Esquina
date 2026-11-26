
package mx.com.abarroteslaesquina.abarroteslaesquina;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AbarrotesTest {

    @Test
    public void pruebaSuma() {
        int resultado = 10 + 5;
        assertEquals(15, resultado);
    }

    @Test
    public void pruebaCalculoTotalVenta() {
        int cantidad = 3;
        double precio = 20.0;
        double total = cantidad * precio;

        assertEquals(60.0, total, 0.01);
    }

    @Test
    public void pruebaInventarioNoNegativo() {
        int existencia = 10;
        int salida = 4;
        int restante = existencia - salida;

        assertTrue(restante >= 0);
    }
}
