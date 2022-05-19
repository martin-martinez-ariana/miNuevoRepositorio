package paquetePRUEBAS;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class Ejercicio4Test {
    private ArrayList<Integer> arrayUs = new ArrayList<Integer>();

    @Test
    void aciertaNumeros1() {
        arrayUs.add(4);
        assertEquals( 1, Ejercicio4.aciertaNumerosTEST(arrayUs, 1));
    }

    @Test
    void aciertaNumeros2() {
        arrayUs.add(5);
        assertEquals(1, Ejercicio4.aciertaNumerosTEST(arrayUs, 1));
    }

    @Test
    void aciertaNumeros3() {
        arrayUs.add(5);
        arrayUs.add(4);
        assertEquals(2, Ejercicio4.aciertaNumerosTEST(arrayUs, 3));
    }
}