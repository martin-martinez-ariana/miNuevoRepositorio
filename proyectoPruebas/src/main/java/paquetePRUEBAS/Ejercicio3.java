package paquetePRUEBAS;

public class Ejercicio3 {

    public static int maximoComunDivisor(int numA, int numB)
    {
        if(numA<=0 || numB<=0)
            return -1;
        else
        if(numA==1 || numB==1)
            return 1;

        while(numA!=numB)
        {
            if(numA>numB)
                numA=numA-numB;
            else
                numB=numB-numA;
        }

        return numA;
    }

}
