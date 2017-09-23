/*
 ejemplos:
 a) }       FALSE
 b) (}){    FALSE
 c) [[[     
 d) [({})]
 */
import stacks.*;
public class ComprobadorSintactico {
public static void main(String[] args) {
String cadena = "[({})]";
StackADT pila = new ArrayStack();
boolean correcto = true;
int i = 0;
while (correcto && i < cadena.length()) {
char elem = cadena.charAt(i);
if (elem == '(' || elem == '{' || elem == '[') {
pila.push(elem);
} else if (elem == ')' || elem == '}' || elem == ']') {
if (!pila.isEmpty()) {
char aux = (char) pila.pop();
if (aux == '(' && elem == ')') { //OK
} else if (aux == '{' && elem == '}') { //OK
} else if (aux == '[' && elem == ']') { //OK
} else { //ERROR
System.out.println("Error #1. Cierre sin pareje de apertura");
correcto = false;
}
} else {
System.out.println("Error #2. Cierre sin pareja de apertura");
correcto = false;
}
}
i++;
}
if(!pila.isEmpty()){
correcto=false;
}
System.out.println(correcto);
}
}
