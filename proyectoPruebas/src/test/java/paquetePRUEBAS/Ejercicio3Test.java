package paquetePRUEBAS;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Ejercicio3Test {

    @Test
    void maximoComunDivisor1() {
        assertEquals(-1, Ejercicio3.maximoComunDivisor(-1, 9));
    }

    @Test
    void maximoComunDivisor2() {
        assertEquals(-1, Ejercicio3.maximoComunDivisor(1, 0));
    }

    @Test
    void maximoComunDivisor3() {
        assertEquals(1, Ejercicio3.maximoComunDivisor(1, 7));
    }

    @Test
    void maximoComunDivisor4() {
        assertEquals(1, Ejercicio3.maximoComunDivisor(2, 1));
    }

    @Test
    void maximoComunDivisor5() {
        assertEquals(2, Ejercicio3.maximoComunDivisor(2, 2));
    }

    @Test
    void maximoComunDivisor6() {
        assertEquals(2, Ejercicio3.maximoComunDivisor(4, 2));
    }

    @Test
    void maximoComunDivisor7() {
        assertEquals(2, Ejercicio3.maximoComunDivisor(2, 4));
    }
}