import queues.*;
public class Palindromo_Bicolas {

    public static void main(String[] args) {
        DequeueADT palabra = new LinkedDequeue();
        palabra.addRear("a");
        palabra.addRear("n");
        palabra.addRear("a");
        
        boolean enc=true;
        while (palabra.size()>1 && enc){
            if (!palabra.removeFront().equals(palabra.removeRear())){
                enc=false;
            }
        }
        System.out.println(enc);
    }
}
