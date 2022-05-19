package examenPruebas;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Ejercicio2_ATest {

    @Test
    void introduceOSacaCantidadTest1() {
        assertEquals(1900, Ejercicio2_A.introduceOSacaCantidad(100, 's'));
    }

    @Test
    void introduceOSacaCantidadTest2() {
        assertEquals(2000, Ejercicio2_A.introduceOSacaCantidad(6000, 's'));
    }

    @Test
    void introduceOSacaCantidadTest3() {
        assertEquals(2100, Ejercicio2_A.introduceOSacaCantidad(100, 'i'));
    }

    @Test
    void introduceOSacaCantidadTest4() {
        assertEquals(2000, Ejercicio2_A.introduceOSacaCantidad(10, 'c'));
    }
}