import jss2.*;
public class Estantería {
public static void main(String[] args) {
UnorderedListADT<OrderedListADT> listaProductos = new ArrayUnorderedList<>();
OrderedListADT arroces = new ArrayOrderedList();
OrderedListADT lentejas = new ArrayOrderedList();
OrderedListADT garbanzos = new ArrayOrderedList();
listaProductos.addToRear(arroces);
listaProductos.addToRear(lentejas);
listaProductos.addToRear(garbanzos);
arroces.add("20010101");
arroces.add("20010102");
arroces.add("20010301");
lentejas.add("20020101");
lentejas.add("20020102");
lentejas.add("20020301");
System.out.println("Antes:\n"+listaProductos);
arroces.add("20010201");
System.out.println("Después:\n"+listaProductos);
}
}
