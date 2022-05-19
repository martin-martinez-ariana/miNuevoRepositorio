package examenPruebas;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class Ejercicio1_ATest {
    private ArrayList<Integer> numeros = new ArrayList<Integer>();

    @Test
    void parImparTest1() {
        numeros.add(0);
        assertEquals(1, Ejercicio1_A.parImpar(numeros));
    }

    @Test
    void parImparTest2() {
        numeros.add(4);
        numeros.add(0);
        assertEquals(2, Ejercicio1_A.parImpar(numeros));
    }

    @Test
    void parImparTest3() {
        numeros.add(5);
        numeros.add(0);
        assertEquals(2, Ejercicio1_A.parImpar(numeros));
    }
}