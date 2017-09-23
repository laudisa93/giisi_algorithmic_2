import stacks.*;
public class Palindromo_Pilas {
public static void main(String[] args) {
String palabras[]= {"hola", "hooh", "any", "ana"};
boolean palindromo;
for (int i = 0; i < 4; i++) {
palindromo=comprobar_Palindromo_Pilas(palabras[i]);
System.out.println("¿"+palabras[i]+"?: "+palindromo);
}
}
private static boolean comprobar_Palindromo_Pilas(String string) {
StackADT<Character> pila1 = new ArrayStack();
StackADT<Character> pila2 = new ArrayStack();
boolean palindromo=true;
int i =0;
while(i < string.length() && palindromo){
pila1.push(string.charAt(i));
pila2.push(string.charAt(string.length()-i-1));
if(((Character)pila1.peek())!=((Character)pila2.peek())){
palindromo=false;
}
i++;
}
return palindromo;
}
}
