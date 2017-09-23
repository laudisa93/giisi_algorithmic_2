package epd2algoritmicaii;

import stacks.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {


        /*EXPERIMENTO 2*/
        StackADT<Integer> pila1 = new LinkedStack<Integer>();
        StackADT<Character> pila2 = new ArrayStack<Character>();
        /*Meto numeros en la pila*/
        for (int i = 1; i <= 10; i++) {
            pila1.push(i);

        }
        /*Meto letras en pila*/
        for (char i = 'a'; i <= 'j'; i++) {
            pila2.push(i);

        }
        /*Muestro elementos de cada pila*/
        System.out.println("Pila 1: \n" + pila1.toString());
        System.out.println("Pila 2: \n" + pila2.toString());
        /*Muestro la cima */
        System.out.println("La cima de numeros es:" + pila1.peek());
        System.out.println("La cima de letras es: " + pila2.peek());
        /*Numero de elementos*/
        System.out.println("Numeros de elementos pila 1: " + pila1.size());
        System.out.println("Numeros de elementos pila 2: " + pila2.size());
        /*Desapilar*/
        for (int i = 1; i <= 10; i++) {
            pila1.pop();
            pila2.pop();

        }
        System.out.println("Pila 1: \n" + pila1.toString() + pila1.isEmpty());
        System.out.println("Pila 2: \n" + pila2.toString() + pila2.isEmpty());


        /*EJERCICIO 1*/
        String palabra = "se van sus naves";
        StackADT<Character> pila = new ArrayStack<Character>();
        StackADT<Character> pilaAux = new ArrayStack<Character>();
        for (int i = 0; i < palabra.length(); i++) {
            if (palabra.charAt(i) != ' ') {
                pila.push(palabra.charAt(i));
            }
        }
        System.out.println(pila.toString());

        for (int j = palabra.length() - 1; j >= 0; j--) {
            if (palabra.charAt(j) != ' ') {
                pilaAux.push(palabra.charAt(j));
            }
        }
        System.out.println(pilaAux.toString());
        boolean pal = true;
        for (int j = 0; j < pila.size(); j++) {
            if (!pila.pop().equals(pilaAux.pop())) {
                pal = false;
            }
        }

        if (!pal) {
            System.out.println("No es palíndromo");
        } else {
            System.out.println("Sí es palíndromo");
        }

        /*EJERCICIO 2*/

        StackADT<Integer> p1 = new ArrayStack<Integer>();
        StackADT<Integer> p2 = new ArrayStack<Integer>();
        p1.push(1);
        p1.push(2);
        p1.push(3);
        p1.push(4);

        p2.push(8);
        p2.push(7);
        p2.push(6);
        p2.push(5);

        System.out.println("Pila 1: \n" + p1.toString());
        System.out.println("Pila 2: \n" + p2.toString());

        StackADT<Integer> p3 = new ArrayStack<Integer>();
        StackADT<Integer> pAux = new ArrayStack<Integer>();

        while (!p1.isEmpty()) {
            pAux.push(p1.pop());
        }
        System.out.println("Pila Aux: \n" + pAux.toString());

        while (!pAux.isEmpty() && !p2.isEmpty()) {
            if (p2.peek() > pAux.peek()) {
                p3.push(pAux.pop());

            } else {
                p3.push(p2.pop());

            }

        }
        while (!pAux.isEmpty()) {
            p3.push(pAux.pop());
        }
        while (!p2.isEmpty()) {
            p3.push(p2.pop());
        }

        System.out.println("Pila 3: \n" + p3.toString());

        /*PROBLEMA 1*/

        /*INFIJA = (3 + 4) * 5  */
        /*POSFIJA = 3 4 + 5 *   */
        String op = "3*4+5-8";
        System.out.println(op.toString());
        StackADT<Character> PilaC = new ArrayStack<Character>();
        StackADT<Integer> PilaN = new ArrayStack<Integer>();

        for (int i = 0; i < op.length(); i++) {
            if (Character.isDigit(op.charAt(i))) {
                PilaN.push(new Integer(op.charAt(i)) - 48);

            } else {
                PilaC.push(op.charAt(i));
            }
        }
        System.out.println("PilaN: \n" + PilaN.toString());
        System.out.println("PilaC: \n" + PilaC.toString());

        StackADT<Character> PilaCAux = new ArrayStack<Character>();
        StackADT<Integer> PilaNAux = new ArrayStack<Integer>();

        while (!PilaC.isEmpty()) {
            PilaCAux.push(PilaC.pop());
        }
        while (!PilaN.isEmpty()) {
            PilaNAux.push(PilaN.pop());
        }

        System.out.println("PilaNAux: \n" + PilaNAux.toString());
        System.out.println("PilaCAux: \n" + PilaCAux.toString());

        StackADT Res = new ArrayStack();

        while (!PilaCAux.isEmpty()) {
            if (Res.size()>=3) {
                Res.push(PilaNAux.pop());
                Res.push(PilaCAux.pop());
            }else{
                Res.push(PilaNAux.pop());
                Res.push(PilaNAux.pop());
                Res.push(PilaCAux.pop());
            }
        }
        
        System.out.println("Pila Res: \n" + Res.toString());
    }
}
