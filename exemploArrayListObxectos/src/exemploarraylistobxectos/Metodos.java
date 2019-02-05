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
    
    public void engadir(ArrayList<Alumno>lis){
        String n,dni;
        int not;
        System.out.println("Dame nome:");
        n = leer.next();
        System.out.println("Dame dni:");
        dni = leer.next();
        System.out.println("Dame nota:");
        not = leer.nextInt();
        // Alumno a1 = new Alumno(n,dni,not);
        // lis.add(a1);
        // o simplificando:
        lis.add(new Alumno(n,dni,not));
    }
    
    public void ver(ArrayList<Alumno>lis){
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
    
    public void borrar(ArrayList<Alumno>lis){
        System.out.println("Dame posición:");
        int pos = leer.nextInt();
        lis.remove(pos);
//        System.out.println("Dame dni:");
//        String nombreABorrar = leer.next();
//        if(lis.contains(dni)){
//            lis.remove();
//        }
    }
}