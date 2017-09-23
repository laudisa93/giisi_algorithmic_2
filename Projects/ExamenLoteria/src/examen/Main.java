package examen;

import java.util.Iterator;
import java.util.Random;
import poo.io.IO;
import sets.ArraySet;
import sets.SetADT;

public class Main {

    public static void main(String[] args) {
        SetADT premio = new ArraySet();
        int num = 0;
        Random rand = new Random();

        System.out.println("Rellenando el bombo...");
        for (int i = 0; i < 6; i++) {
            num = rand.nextInt(49);
            premio.add(num);
        }
        //Para comprobar cual es la combinación ganadora
        System.out.println(premio.toString());

        SetADT boleto = new ArraySet();
        int i = 1;
        for (i = 1; i <= 6; i++) {
            System.out.println("Inserte el " + i + "º número.");
            num = (int) IO.readNumber();
            boleto.add(num);
        }

        boolean premiado = true;
        SetADT aciertos = new ArraySet();
        SetADT fallos = new ArraySet();
        Iterator it = boleto.iterator();
        while (it.hasNext()) {
            Object object = it.next();
            if (!premio.contains(object)) {
                premiado = false;
                fallos.add(object);
            }else{
                aciertos.add(object);
            }
        }

        if (premiado) {
            System.out.println("\n¡¡PREMIO!!");
            System.out.println("El boleto premiado es: \n" + boleto.toString());
        } else {
            System.out.println("\nOtra vez será...");
            System.out.println("El boleto no premiado es: \n" + boleto.toString());
            System.out.println("Los aciertos son: \n" + aciertos.toString());
            System.out.println("Los fallos son: \n" + fallos.toString());
        }

        System.out.println("La combinación ganadora es:");
        System.out.println(premio.toString());
    }
}
