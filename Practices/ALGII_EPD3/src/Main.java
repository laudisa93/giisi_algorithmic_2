
import edi.io.IO;
import java.util.ArrayList;
import javax.management.Query;
import queues.*;

public class Main {

    public static void main(String[] args) {

//        /*E2*/
//
//        QueueADT cola = new ArrayQueue();
//
//        System.out.println("Introduzca el número de clientes a atender: ");
//        int n = (int) IO.readNumber();
//
//        for (int i = 0; i < n; i++) {
//            System.out.println("Introduzca el nombre del cliente " + (i + 1) + ":");
//            String cliente = IO.readLine();
//            cola.enqueue(cliente);
//        }
//
//        System.out.println("\nClientes: \n" + cola.toString());
//
//        /*E3*/
//
//        DequeueADT<Integer> bicola = new LinkedDequeue<Integer>();
//        for (int i = 0; i < 4; i++) {
//            System.out.println("Introduce el dígito " + (i + 1) + " [0-9]");
//            int digito = (int) IO.readNumber();
//            bicola.addFront(digito);
//            bicola.addRear(digito);
//        }
//        int tam = bicola.size();
//        System.out.println("El número capicúa es: ");
//        for (int i = 0; i < tam; i++) {
//            System.out.print(bicola.removeFront());
//        }

        /*E4*/
        PriorityQueueADT<TrabajoImpresion> pricola = new LinkedPriorityQueue<TrabajoImpresion>();
        
        TrabajoImpresion t1 = new TrabajoImpresion("Laura", 15, 50);
        TrabajoImpresion t2 = new TrabajoImpresion("Juan", 56, 90);
        TrabajoImpresion t3 = new TrabajoImpresion("Fernan", 3, 70);
        TrabajoImpresion t4 = new TrabajoImpresion("Sergio", 9, 60);
        TrabajoImpresion t5 = new TrabajoImpresion("Angel", 62, 70);
        
        pricola.enqueue(t1, t1.getPrioridad());
        pricola.enqueue(t2, t2.getPrioridad());
        pricola.enqueue(t3, t3.getPrioridad());
        pricola.enqueue(t4, t4.getPrioridad());
        pricola.enqueue(t5, t5.getPrioridad());
        
        System.out.println("Pricola: \n"+pricola.toString());
    

//        /*EJERICIO 1*/
//        QueueADT cesar = new ArrayQueue();
//
//        String mensaje = "OlaKase";
//
//        for (int i = 0; i < mensaje.length(); i++) {
//            cesar.enqueue((int) mensaje.charAt(i));
//        }
//        int[] vector = {3, 1, 7, 4, 2, 5};
//
//        /*P1.Implemente un programa que dada una cadena determine si es un 
//         * palíndromo usando exclusivamente una bicola.*/
//        DequeueADT bicola = new LinkedDequeue();
//        String palabra = "alli ves sevilla";
//
//        for (int j = palabra.length()-1; j >palabra.length()/2; j--) {
//            if (palabra.charAt(j) != ' ') {
//                bicola.addFront(palabra.charAt(j));
//            }
//        }
//        for (int i = palabra.length()/2; i >=0; i--) {
//            if (palabra.charAt(i) != ' ') {
//                bicola.addFront(palabra.charAt(i));
//            }
//        }
//        System.out.println(bicola.toString());
//        boolean pal = false;
//        
//        for (int j = 0; j < bicola.size(); j++) {
//            if (bicola.removeFront().equals(bicola.removeRear())) {
//                pal = true;
//            }
//        }
//
//        if (!pal) {
//            System.out.println("No es palíndromo");
//        } else {
//            System.out.println("Sí es palíndromo");
//        }
//        
//        

    }
}
