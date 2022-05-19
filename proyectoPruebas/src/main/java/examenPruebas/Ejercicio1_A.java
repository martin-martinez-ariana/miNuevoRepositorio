package examenPruebas;
import java.util.ArrayList;

public class Ejercicio1_A {

    public static int parImpar(ArrayList numeros)
    {
        int cantidadNumeros=0,num;

        do {
            num=(Integer)numeros.remove(0);
            if(num%2==0)
                System.out.println(num+" es Par");
            else
                System.out.println(num+" es Impar");
            cantidadNumeros++;
        }while(num!=0);

        return cantidadNumeros;
    }
}
