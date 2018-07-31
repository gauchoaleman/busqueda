package edu.cientoonce;

import java.util.Objects;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int i;
        String meses[] = new String[12];
        String nombre_mes;

        meses[0] = "Enero";
        meses[1] = "Febrero";
        meses[2] = "Marzo";
        meses[3] = "Abril";
        meses[4] = "Mayo";
        meses[5] = "Junio";
        meses[6] = "Julio";
        meses[7] = "Agosto";
        meses[8] = "Septiembre";
        meses[9] = "Octubre";
        meses[10] = "Noviembre";
        meses[11] = "Diciembre";

        System.out.println("Ingrese mes: ");
        Scanner sc = new Scanner(System.in);
        nombre_mes = sc.next();

        for (i = 0; i < meses.length; i++) {
            //System.out.println("en for,i,meses[i],nombre_mes"+i+meses[i]+nombre_mes);
            if (Objects.equals(meses[i],nombre_mes)) {
                System.out.println(i + 1);
            }


        }
    }
}
