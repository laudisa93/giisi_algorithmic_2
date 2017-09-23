/*
Desarrolle un programa que simule el sorteo y comprobación de boletos premiados de la Lotería Primitiva. 
Inicialmente se procederá a rellenar el bombo del sorteo con las 49 bolas necesarias y se extraerán al azar 6 bolas
diferentes que conformarán la combinación ganadora. A continuación el programa solicitará al usuario los 6 números
marcados en su boleto, comprobará los aciertos obtenidos y mostrará por pantalla un resumen con la combinación ganadora,
el boleto del usuario con los aciertos obtenidos.
 */
package ej2;

import edi.io.IO;
import java.util.Random;
import sets.*;

public class Main {

    public static void main(String[] args) {
        SetADT premio = new ArraySet();
        int num = 0;
        Random rand = new Random();
        for (int i = 0; i < 6; i++) {
            num = rand.nextInt(49);
            premio.add(num);
        }

        System.out.println(premio.toString());

        boolean bandera = true;
        int i = 1;
        while(bandera && i<=6){
            System.out.println("Inserte el "+ i +" número.");
            num = (int) IO.readNumber();
            i++;
            if(!premio.contains(num)){
                bandera = false;
            }
        }

        if(bandera){
            System.out.println("Premio.");
        }
        else{
            System.out.println("Otra vez sera.");
        }
        
    }
}
