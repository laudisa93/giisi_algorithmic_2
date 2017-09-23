
import binaryTrees.*;
import java.util.*;


public class Huffman {
    
    
    LinkedBinaryTree crearArbolHuffman (jss2.OrderedListADT<Caracter> letras){
        
        UnorderedListADT<LinkedBinaryTree> listaDeNodos = new ArrayUnorderedList<LinkedBinaryTree>();
        
        Iterator it = letras.iterator();
        
        while(it.hasNext()){
            Caracter c = (Caracter) it.next();
            LinkedBinaryTree<Caracter> nodo = new LinkedBinaryTree<Caracter>(c);
            
            listaDeNodos.addToRear(nodo);
        }
        
        
        int numeroT=1;
        while(listaDeNodos.size()>1){
            LinkedBinaryTree arbol = new LinkedBinaryTree("T"+numeroT,listaDeNodos.removeFirst() ,listaDeNodos.removeFirst() );
            //System.out.println(arbol.toString());
            listaDeNodos.addToFront(arbol);
            numeroT++;
        }

        return listaDeNodos.first();
        
    }
    
    public String codificar (Caracter c, BinaryTreeNode nodo){
        
        String codigo = "";
        boolean encontrado= false;
        
        if(encontrado==false){
            if(nodo.numChildren()>2){
                if (((Caracter) nodo.left().getElement()).getCaracter() == c.getCaracter()) {
                    codigo += "0";
                    encontrado = true;
                    return codigo;
                } else {
                    codigo += "1";
                    return codigo += codificar(root.getLeft(), caracterProcesar);
                }
            }
        }else{
            return codigo;
        }
        
        return null;
        
    }
    
}
