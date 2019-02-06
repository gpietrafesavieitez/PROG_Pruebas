/**
 * Gabriel P.
 * CPR Daniel Castelao
 * @author gpietrafesavieitez
 */

package exemploarraylistobxectos;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Metodos {
    Scanner leer = new Scanner(System.in);
    
    public void engadir(ArrayList<Alumno> lis){
        String n,dni;
        int not;
        System.out.print("Introduce el nombre:");
        n = leer.next();
        System.out.print("Introduce el DNI:");
        dni = leer.next();
        System.out.print("Introduce la nota:");
        not = leer.nextInt();
        // Alumno a1 = new Alumno(n,dni,not);
        // lis.add(a1);
        // o simplificando:
        lis.add(new Alumno(n,dni,not));
    }
    
    public void ver(ArrayList<Alumno> lis){
//        con foreach:
        for(Alumno a: lis){
            System.out.println(a);
        }
//        con iterator seria:
//        Iterator it = lis.iterator();
//        while(it.hasNext()){
//            System.out.println(it.next());
//        }
    }
    
    public void borrar(ArrayList<Alumno> lis){
//        System.out.println("Dame posición:");
//        int pos = leer.nextInt();
//        lis.remove(pos);
        System.out.print("Introduce el DNI:");
        String dni = leer.next(); // Recibo input del dni a borrar
        Alumno a = new Alumno();
        Iterator it = lis.iterator();
        while(it.hasNext()){
            a = (Alumno)it.next(); // Lo que recibo lo casteo para que sea de tipo "Alumno"
            if(dni.equalsIgnoreCase(a.getDni())){ // Si el dni introducido es igual al dni del objeto
                lis.remove(a); // Eliminamos el elemento de la lista actual
            }
        }
    }
    
    public void buscar(ArrayList<Alumno> lis){
        System.out.print("Introduce el DNI:");
        String dni = leer.next();
//        Iterator it = lis.iterator();
//        while(it.hasNext()){
//            a = (Alumno)it.next();
//            if(dni.equalsIgnoreCase(a.getDni())){
//                System.out.println(a.getNome());
//            }
//        }
//        O también:
        int atopado = 0;
        for(Alumno a:lis){
            if(dni.equalsIgnoreCase(a.getDni())){
                System.out.println(a.getNome());
                atopado = 1;
                break;
            }
        }
        if(atopado == 0){
            System.out.println("No se han encontrado coincidencias.");
        }
    }
    
    public void modificar(ArrayList<Alumno> lis){
        System.out.println("Introduce el DNI:");
        String dni = leer.next();
        int atopado = 0;
        for(Alumno a:lis){
            if(dni.equalsIgnoreCase(a.getDni())){
                atopado = 1;
                System.out.println(a.toString());
                System.out.println("Introduce la nueva nota:");
                int nota = leer.nextInt();
                a.setNota(nota);
            }
        }
        if(atopado == 0){
            System.out.println("No se han encontrado coincidencias.");
        }
    }
}