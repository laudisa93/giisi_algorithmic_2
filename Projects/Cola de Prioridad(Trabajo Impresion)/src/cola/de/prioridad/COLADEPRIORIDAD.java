import queues.*;
public class COLADEPRIORIDAD {
public static void main(String[] args) {
//CREO COLA DE PRIORIDAD
PriorityQueueADT<TrabajoImpresion> pricola = new LinkedPriorityQueue<TrabajoImpresion>();
//ME CREO LOS TRABAJOS DE IMPRESION (PERSONA,NUMERO DE PAGINAS,PRIORIDAD)
TrabajoImpresion t1 = new TrabajoImpresion("Juanma", 15, 50);
TrabajoImpresion t3 = new TrabajoImpresion("Laura", 10, 90);
TrabajoImpresion t2 = new TrabajoImpresion("Fernando", 10, 70);
TrabajoImpresion t4 = new TrabajoImpresion("Sergio", 1, 70);
pricola.enqueue(t1, t1.getPrioridad());
pricola.enqueue(t2, t2.getPrioridad());
pricola.enqueue(t3, t3.getPrioridad());
pricola.enqueue(t4, t4.getPrioridad());
System.out.println("Cola segun la prioridad: ");
System.out.println(pricola.toString());
}
}
