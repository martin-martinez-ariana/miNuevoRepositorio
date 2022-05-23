package examenPruebas;
public class Ejercicio2_A {

    public static final int MAXIMO_SACAR=500;
    public static int introduceOSacaCantidad(int cant, char tipo)
    {
        int saldo=2000;
        // si tipo vale 's' es sacar dinero, si tipo vale 'i' es ingresar dinero
        if(tipo=='s')
            if(cant<MAXIMO_SACAR) {
                saldo = saldo - cant;
                return saldo;
            }
            else
                return saldo;
        else
        if(tipo=='i') {
            saldo = saldo + cant;
            return saldo;
        }
        else
            return saldo;
    }
}