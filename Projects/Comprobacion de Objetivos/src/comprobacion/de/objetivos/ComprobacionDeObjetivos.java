import binaryTrees.*;
import java.util.Iterator;
public class ComprobacionDeObjetivos {
public static void main(String[] args) {
//ARBOL 1
LinkedBinaryTree<Integer> nivel2IzqIzq = new LinkedBinaryTree<Integer>(0);
LinkedBinaryTree<Integer> nivel2DerIzq = new LinkedBinaryTree<Integer>(0);
LinkedBinaryTree<Integer> nivel2DerDer = new LinkedBinaryTree<Integer>(0);
LinkedBinaryTree<Integer> subarbolIzq = new LinkedBinaryTree<Integer>(1, nivel2IzqIzq, null);
LinkedBinaryTree<Integer> subarbolDer = new LinkedBinaryTree<Integer>(1, nivel2DerIzq, nivel2DerDer);
BinaryTreeADT<Integer> arbol = new LinkedBinaryTree<>(1, subarbolIzq, subarbolDer);
float cont = 0;
Iterator it = arbol.iteratorInOrder();
while (it.hasNext()) {
if (it.next() == 1) {
cont++;
}
}
float total = arbol.size() / cont;
System.out.println("Probabilidad Arbol 1 este terminado:");
System.out.println(cont / arbol.size());
//ARBOL 2
LinkedBinaryTree<Integer> a2nivel2IzqIzq = new LinkedBinaryTree<Integer>(1);
LinkedBinaryTree<Integer> a2nivel2DerIzq = new LinkedBinaryTree<Integer>(0);
LinkedBinaryTree<Integer> a2nivel2DerDer = new LinkedBinaryTree<Integer>(0);
LinkedBinaryTree<Integer> a2subarbolIzq = new LinkedBinaryTree<Integer>(1, a2nivel2IzqIzq, null);
LinkedBinaryTree<Integer> a2subarbolDer = new LinkedBinaryTree<Integer>(1, a2nivel2DerIzq, a2nivel2DerDer);
BinaryTreeADT<Integer> arbol2 = new LinkedBinaryTree<>(1, a2subarbolIzq, a2subarbolDer);
float cont1 = 0;
Iterator it1 = arbol2.iteratorInOrder();
while (it1.hasNext()) {
if (it1.next() == 1) {
cont1++;
}
}
float total1 = arbol2.size() / cont1;
System.out.println("Probabilidad Arbol 2 este terminado:");
System.out.println(cont1 / arbol2.size());
}
}
