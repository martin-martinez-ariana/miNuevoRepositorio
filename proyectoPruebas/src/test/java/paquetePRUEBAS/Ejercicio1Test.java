package paquetePRUEBAS;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import paquetePRUEBAS.Ejercicio1;

import static org.junit.jupiter.api.Assertions.*;

class Ejercicio1Test {

    @Test
    void test1() {
        Assertions.assertEquals(15, Ejercicio1.mayorDeCuatroEj2(15, 10, 8, 5));
    }

    @Test
    void test2() {
        assertEquals(18, Ejercicio1.mayorDeCuatroEj2(15, 10, 8, 18));
    }

    @Test
    void test3() {
        assertEquals(18, Ejercicio1.mayorDeCuatroEj2(15, 10, 18, 5));
    }

    @Test
    void test4() {
        assertEquals(20, Ejercicio1.mayorDeCuatroEj2(15, 10, 18, 20));
    }

    @Test
    void test5() {
        assertEquals(15, Ejercicio1.mayorDeCuatroEj2(10, 15, 8, 5));
    }

    @Test
    void test6() {
        assertEquals(18, Ejercicio1.mayorDeCuatroEj2(10, 15, 8, 18));
    }

    @Test
    void test7() {
        assertEquals(18, Ejercicio1.mayorDeCuatroEj2(10, 15, 18, 5));
    }

    @Test
    void test8() {
        assertEquals(20, Ejercicio1.mayorDeCuatroEj2(10, 15, 18, 20));
    }
}