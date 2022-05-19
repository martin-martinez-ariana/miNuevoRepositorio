package paquetePRUEBAS;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Ejercicio2Test {

    @Test
    void test1() {
        assertEquals(123750, Ejercicio2.funcionEj3(1100));
    }

    @Test
    void test2() {
        assertEquals(118750, Ejercicio2.funcionEj3(1000));
    }

    @Test
    void test3() {
        assertEquals(12500, Ejercicio2.funcionEj3(100));
    }
}