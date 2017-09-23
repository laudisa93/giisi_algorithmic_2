
import java.util.Scanner;
import stacks.*;

public class Calculadora {

    public static void main(String[] args) {

        StackADT<Integer> pila = new ArrayStack<Integer>();
        StackADT<Character> pilaC = new ArrayStack<Character>();
        Scanner sr = new Scanner(System.in);
        int op;
        do {
            System.out.println("*****CALCULADORA******");
            System.out.println("1.NUM");
            System.out.println("2.OPR");
            System.out.println("3.VER");
            System.out.println("4.ELI");
            System.out.println("5.FIN");
            System.out.println("Elija opcion: ");
            op = (int) sr.nextInt();



            switch (op) {
                case 1:
                    System.out.println("Introduzca numero:  ");
                    int n = (int) sr.nextInt();
                    if (pila.isEmpty()) {
                        pila.push(n);
                        System.out.println("Pila : \n" + pila.toString());
                    } else if (pila.size() == 1) {
                        pila.push(n);
                        char opr = pilaC.pop();
                        if (opr == '+') {
                            int num1 = pila.pop();
                            int num2 = pila.pop();
                            int suma = num1 + num2;
                            pila.push(suma);
                            System.out.println("Pila despues de suma :\n" + pila.toString());
                        } else if (opr == '-') {
                            int num1 = pila.pop();
                            int num2 = pila.pop();
                            int resta = num2 - num1;
                            pila.push(resta);
                            System.out.println("Pila despues de resta :\n" + pila.toString());

                        } else if (opr == '*') {
                            int num1 = pila.pop();
                            int num2 = pila.pop();
                            int mul = num1 * num2;
                            pila.push(mul);
                            System.out.println("Pila despues de multiplicacion :\n" + pila.toString());


                        } else if (opr == '/') {
                            int num1 = pila.pop();
                            int num2 = pila.pop();
                            int div = num2 / num1;
                            pila.push(div);
                            System.out.println("Pila despues de division :\n" + pila.toString());


                        }
                    }
                    break;

                case 2:
                    System.out.println("Introduzca operador: ");
                    char opr = (Character) sr.next().charAt(0);
                    pilaC.push(opr);
                    System.out.println("PilaC: \n" + pilaC.toString());
                    break;
                case 3:
                    System.out.println("Cima de pila: " + pila.peek());
                    break;
                case 4:
                    System.out.println("Pila: \n" + pila.toString());
                    pila.pop();
                    System.out.println("Pila despues de desapilar: \n" + pila.toString());
                    break;

            }
        } while (op != 5);
    }
}
