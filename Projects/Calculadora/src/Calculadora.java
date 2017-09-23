import java.util.Scanner;
import stacks.*;
public class Calculadora {
public static void main(String[] args) {
StackADT<Integer> numeros = new ArrayStack<Integer>();
StackADT<Character> operadores = new ArrayStack<Character>();
Scanner sr = new Scanner(System.in);
int op;
do { 
System.out.println("\n\n*****CALCULADORA******");
System.out.println("1.Insertar Número");
System.out.println("2.Insertar Operador");
System.out.println("3.Ver la cima de la pila");
System.out.println("4.Eliminar cima de la pila");
System.out.println("5.FIN DEL PROGRAMA");
System.out.print("\nElija opcion: ");
op = (int) sr.nextInt();
switch (op) {
case 1:
System.out.print("\nIntroduzca numero:  ");
int n = (int) sr.nextInt();
if (numeros.isEmpty()) {
numeros.push(n);
System.out.println("\nPila : \n" + numeros.toString());
} else {
numeros.push(n);
char opr = operadores.pop();
if (opr == '+') {
int num1 = numeros.pop();
int num2 = numeros.pop();
int suma = num1 + num2;
numeros.push(suma);
System.out.println("\nPila despues de suma :\n" + numeros.toString());
} else if (opr == '-') {
int num1 = numeros.pop();
int num2 = numeros.pop();
int resta = num2 - num1;
numeros.push(resta);
System.out.println("\nPila despues de resta :\n" + numeros.toString());
} else if (opr == '*') {
int num1 = numeros.pop();
int num2 = numeros.pop();
int mul = num1 * num2;
numeros.push(mul);
System.out.println("\nPila despues de multiplicacion :\n" + numeros.toString());
} else if (opr == '/') {
int num1 = numeros.pop();
int num2 = numeros.pop();
if (num1 != 0) {
int div = num2 / num1;
numeros.push(div);
System.out.println("\nPila despues de division :\n" + numeros.toString());
}else{
System.out.println("\nError al dividir por cero");
}
}
}
break;
case 2:
System.out.print("Introduzca operador: ");
char opr = (Character) sr.next().charAt(0);
operadores.push(opr);
System.out.println("\nPila operadores: \n" + operadores.toString());
break;
case 3:
if(!numeros.isEmpty()){
System.out.println("\nCima de pila: " + numeros.peek());
}else{
System.out.println("\nLa pila está vacía.");
}
break;
case 4:
if(!numeros.isEmpty()){
System.out.println("\nPila antes de desapilar: \n" + numeros.toString());
numeros.pop();
System.out.println("\nPila despues de desapilar: \n" + numeros.toString());
}else{
System.out.println("\nLa pila está vacía.");
}
break;
}
} while (op != 5);
}
}
