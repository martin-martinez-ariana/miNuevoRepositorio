package paquetePRUEBAS;

import java.util.ArrayList;

public class Ejercicio4 {
    public static int aciertaNumeros(int intentosMax){
        final int NUMERO_SECRE=4;
        int num=0,intentos=0, numUsu;
        do{
            System.out.println("Dame un número: ");
            num=Entrada.entero();
            if(num==NUMERO_SECRE) {
                System.out.println("Acertaste");
            }
            else
                System.out.println("Fallaste");
            intentos++;
        }while(NUMERO_SECRE!=num && intentos!=intentosMax);

        return intentos;
    }

    public static int aciertaNumerosTEST(ArrayList numerosElegidos, int intentosMax) {
        final int NUMERO_SECRE=4;
        int num=0, intentos=0;
        do{
            num=(Integer)numerosElegidos.remove(0);
            if(num==NUMERO_SECRE) {
                System.out.println("Acertaste");
            }
            else
                System.out.println("Fallaste");
            intentos++;
        }while(NUMERO_SECRE!=num && intentos!=intentosMax);

        return intentos;
    }
}
