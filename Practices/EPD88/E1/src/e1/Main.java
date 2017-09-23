
package e1;
import sets.*;

public class Main {

    public static void main(String[] args) {
           SetADT caracter = new ArraySet();
           for(char i = 'a';i<='z';i++ ){
                caracter.add(i);
           }
           System.out.println(caracter.toString());

           SetADT digitos = new ArraySet();
           for(int i = 0;i<=9;i++ ){
                digitos.add(i);
           }
           System.out.println(digitos.toString());

           SetADT conjunto = new ArraySet();
           conjunto = caracter.union(digitos);

           System.out.println(conjunto);
    }

}
