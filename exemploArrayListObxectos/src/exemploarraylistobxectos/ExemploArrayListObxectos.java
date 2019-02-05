/**
 * Gabriel P.
 * CPR Daniel Castelao
 * @author gpietrafesavieitez
 */

package exemploarraylistobxectos;

import java.util.ArrayList;
import java.util.Scanner;

public class ExemploArrayListObxectos {

    public static void main(String[] args) {
        ArrayList<Alumno> listaAlumnos = new ArrayList<>();
        Metodos obx = new Metodos();
        String op;
        do{
            System.out.println("-> engadir\n-> ver\n-> borrar\n-> salir");
            Scanner leer = new Scanner(System.in);
            op = leer.next();
            switch(op){
                case "engadir":
                    obx.engadir(listaAlumnos);
                    break;
                case "ver":
                    obx.ver(listaAlumnos);
                    break;
                case "borrar":
                    obx.borrar(listaAlumnos);
                    break;
                case "salir":
                    System.exit(0);
                default:
                    System.out.println("Error");
            }
        }while(!op.equals("salir"));
    }
}
