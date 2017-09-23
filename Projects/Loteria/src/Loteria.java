import java.util.Iterator;
import java.util.Scanner;
import sets.*;
public class Loteria {
public static void main(String[] args) {
SetADT<Integer> bombo=new ArraySet<Integer>();
SetADT<Integer> solucion=new ArraySet<Integer>();
SetADT<Integer> jugador=new ArraySet<Integer>();
int aciertos = 0;

for(int i=0;i<49;i++){
bombo.add(i);
}
for(int i=0;i<6;i++){
solucion.add(bombo.removeRandom());
}
System.out.println("Introduzca los numeros de su boleto");
Scanner in= new Scanner(System.in);
for(int i=0;i<6;i++){
jugador.add(in.nextInt());
}
Iterator it1=jugador.iterator();
boolean ganador=true;
while(it1.hasNext() && ganador==true){
if(solucion.contains((Integer)it1.next())){
aciertos++;
}else{
ganador=false;
}
}
System.out.println("El boleto ganador es:");
System.out.print(solucion.toString());
System.out.println("Su boleto es:");
System.out.print(jugador.toString());
System.out.println("Su numero de acierto es:");
System.out.println(" "+aciertos+" ");
System.out.println("El boleto es ganador: "+ganador);
}
}
