/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package redessociales;

import graphs.AMatrixGraph;
import graphs.GraphADT;
import java.util.Iterator;

/**
 *
 * @author privado
 */
public class RedesSociales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Creamos la red social y las personas
        GraphADT<Persona> redSocial= new AMatrixGraph<Persona>();
        Persona p1= new Persona("Luis","Diaz","Sevilla");
        Persona p2= new Persona("Laura","Diaz","Córdoba");
        Persona p3= new Persona("Daniel","Ardila","Sevilla");
        Persona p4= new Persona("Daniel","Amian","Málaga");
        Persona p5= new Persona("Juan Manuel","Escalante","Cádiz");
        Persona p6= new Persona("Sara","Boza","Sevilla");
        Persona p7= new Persona("Mónica","Sanchez","Sevilla");
        Persona p8= new Persona("Sergio","Delgado","Almería");
        Persona p9= new Persona("Aurelio","Lopez","Jaen");
        Persona p10= new Persona("Fernando","Masero","Huelva");
        //las personas se registran en la red social
        redSocial.addVertex(p1);
        redSocial.addVertex(p2);
        redSocial.addVertex(p3);
        redSocial.addVertex(p4);
        redSocial.addVertex(p5);
        redSocial.addVertex(p6);
        redSocial.addVertex(p7);
        redSocial.addVertex(p8);
        redSocial.addVertex(p9);
        redSocial.addVertex(p10);
        //p1 se hace amigo de p2 y p3
        redSocial.addEdge(p1, p2);
        redSocial.addEdge(p1, p3);
        //p2 se hace amigo de p4
        redSocial.addEdge(p2, p4);
        //p4 se hace amigo de p5,p6,p7
        redSocial.addEdge(p4, p5);
        redSocial.addEdge(p4, p6);
        redSocial.addEdge(p4, p7);
        //p5 se hace amigo de p8,p9
        redSocial.addEdge(p5, p8);
        redSocial.addEdge(p5, p9);
        //p6 se hace amigo de p5,p7
        redSocial.addEdge(p6, p5);
        redSocial.addEdge(p6, p7);
        //p10 se hace amigo de p1,p2,p3,p4
        redSocial.addEdge(p10, p1);
        redSocial.addEdge(p10, p2);
        redSocial.addEdge(p10, p3);
        redSocial.addEdge(p10, p4);
        
        //ahora mostramos la red social, para ver quienes son amigos de quienes
        System.out.println("\nRED SOCIAL\n------------------\n"+redSocial);
    }
}
