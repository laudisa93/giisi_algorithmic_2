/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package extensionBinaryTrees;
import binaryTrees.*;
import java.util.Iterator;

/**
 *
 * @author David
 */
public class ExtensionLinkedBinaryTree extends LinkedBinaryTree implements BinaryTreeADT {

    private static int enc = 0;
    private static ArrayUnorderedList camino, rama_Larga;
    private static int numeroDeRamas, AuxMax, auxRama, longituddeRama;

    public ExtensionLinkedBinaryTree() {
        super();
    }

    public ExtensionLinkedBinaryTree(Object element) {
        super(element);
    }

    public ExtensionLinkedBinaryTree(Object element, LinkedBinaryTree leftSubtree, LinkedBinaryTree rightSubtree) {
        super(element, leftSubtree, rightSubtree);
    }

    public ExtensionLinkedBinaryTree refleja(ExtensionLinkedBinaryTree arbol) {
        return refleja_nodo(arbol.root);
    }
   
     // Metodo que crea un arbol reflejado
     
    private ExtensionLinkedBinaryTree refleja_nodo(BinaryTreeNode nodo) {
        if (nodo.left != null && nodo.right == null) {
            return new ExtensionLinkedBinaryTree(nodo.element, null, refleja_nodo(nodo.left));
        } else if (nodo.left == null && nodo.right != null) {
            return new ExtensionLinkedBinaryTree(nodo.element, refleja_nodo(nodo.right), null);
        } else if (nodo.left != null && nodo.right != null) {
            return new ExtensionLinkedBinaryTree(nodo.element, refleja_nodo(nodo.right), refleja_nodo(nodo.left));
        } else {
            return new ExtensionLinkedBinaryTree(nodo.element);
        }
    }

    public UnorderedListADT caminoA(ExtensionLinkedBinaryTree arbol, Object o) {
        camino = new ArrayUnorderedList();
        enc = 0;
        camino(arbol.root, o);

        return camino;
    }

    private void camino(BinaryTreeNode nodo, Object o) {
        if (nodo.element == o) {
            enc = 1;
        } else {
            if (enc != 1) {
                if (nodo.left != null && enc == 0) {
                    camino(nodo.left, o);
                }
                if (nodo.right != null && enc == 0) {
                    camino(nodo.right, o);
                }
            }
        }
        if (enc == 1) {
            camino.addToFront(nodo.element);
        }
    }

    public static int getNumRamas(ExtensionLinkedBinaryTree arbol) {
        numeroDeRamas = 0;
        numRamas(arbol.root);
        return numeroDeRamas;
    }

     //calcula el numero de ramas de un arbol
    
    private static void numRamas(BinaryTreeNode nodo) {
        if (nodo.left == null && nodo.right == null) {
            numeroDeRamas++;
        } else {
            if (nodo.left != null) {
                numRamas(nodo.left);
            }
            if (nodo.right != null) {
                numRamas(nodo.right);
            }
        }
    }
    
    public static int getLongitudRamaLarga(ExtensionLinkedBinaryTree arbol) {
        longituddeRama = 0;
        AuxMax = -1;
        longitudRamaLarga(arbol, arbol.root);
        return longituddeRama;
    }

   //calcula la longitud de la rama mas larga de un arbol
    
    
    private static void longitudRamaLarga(ExtensionLinkedBinaryTree arbol, BinaryTreeNode nodo) {
        if (nodo.left == null && nodo.right == null) {
            ArrayUnorderedList camino = (ArrayUnorderedList) arbol.caminoA(arbol, nodo.element);
            if (camino.size() > AuxMax) {
                AuxMax = camino.size();
                longituddeRama = camino.size();
            }
        } else {
            if (nodo.left != null) {
                longitudRamaLarga(arbol, nodo.left);
            }
            if (nodo.right != null) {
                longitudRamaLarga(arbol, nodo.right);
            }
        }
    }

    public static ArrayList getRamaLarga(ExtensionLinkedBinaryTree arbol) {
        rama_Larga = new ArrayUnorderedList();
        AuxMax = -1;
        ramaLarga(arbol, arbol.root);
        return rama_Larga;
    }

    //Metodo que devuelve la rama mas larga de un arbol
    
    private static void ramaLarga(ExtensionLinkedBinaryTree arbol, BinaryTreeNode nodo) {
        if (nodo.left == null && nodo.right == null) {
            ArrayUnorderedList camino = (ArrayUnorderedList) arbol.caminoA(arbol, nodo.element);
            if (camino.size() > AuxMax) {
                AuxMax = camino.size();
                rama_Larga = camino;
            }
        } else {
            if (nodo.left != null) {
                ramaLarga(arbol, nodo.left);
            }
            if (nodo.right != null) {
                ramaLarga(arbol, nodo.right);
            }
        }
    }

    public static ArrayList getRamaIesima(ExtensionLinkedBinaryTree arbol) {
        ExtensionLinkedBinaryTree especular = new ExtensionLinkedBinaryTree();
        especular = arbol.refleja(arbol);
        auxRama = 0;
        rama_Larga = new ArrayUnorderedList();
        ramaIesima(especular, especular.root);
        return rama_Larga;
    }

    //Metodo que devuelve la ultima rama de un arbol
     
    private static void ramaIesima(ExtensionLinkedBinaryTree arbol, BinaryTreeNode nodo) {
        if (nodo.left == null && nodo.right == null) {
            ArrayUnorderedList camino = (ArrayUnorderedList) arbol.caminoA(arbol, nodo.element);
            if (auxRama == 0) {
                rama_Larga = camino;
            }
            auxRama = 1;
        } else {
            if (nodo.left != null) {
                ramaIesima(arbol, nodo.left);
            }
            if (nodo.right != null) {
                ramaIesima(arbol, nodo.right);
            }
        }
    }

    @Override
    public Iterator iteratorInOrder() {
        return super.iteratorInOrder();
    }

    @Override
    public Iterator iteratorPreOrder() {
        return super.iteratorPreOrder();
    }
}
