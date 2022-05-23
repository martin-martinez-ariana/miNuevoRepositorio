package paquetePRUEBAS;

public class Ejercicio2 {

    public static float funcionEj3(float cant) {
        float costo1=0,numcaj,desc,costoTot=0;

        costo1=cant*125;
        numcaj=Math.round(0.5+cant/4);
        if(cant>1000)
            desc=costo1*0.1f;
        else
            if(cant>100)
                desc=costo1*0.05f;
            else
                desc=0;
        costoTot=costo1-desc;
        System.out.println("Coste total: "+costoTot+" Numero Caja: "+numcaj+" Descuento: "+desc);
        return costoTot;
    }
}