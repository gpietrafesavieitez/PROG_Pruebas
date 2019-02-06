/**
 * Gabriel P.
 * CPR Daniel Castelao
 * @author gpietrafesavieitez
 */

package exemploarraylistobxectos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ExemploArrayListObxectos {

    public static void main(String[] args) {
        ArrayList<Alumno> listaAlumnos = new ArrayList<>();
        Metodos obx = new Metodos();
        String op;
        do{
            System.out.println("");
            for(int i = 0; i < 25; i ++){
                System.out.print("*");
            }
            System.out.println("\n*\t-> Añadir\t*\n*\t-> Ver\t\t*\n*\t-> Borrar\t*\n*\t-> Ordenar\t*\n*\t-> Buscar\t*\n*\t-> Modificar\t*\n*\t-> Salir\t*");
            for(int i = 0; i < 25; i ++){
                System.out.print("*");
            }
            System.out.println("");
            System.out.print("\n:");
            Scanner leer = new Scanner(System.in);
            op = leer.next();
            switch(op.toLowerCase()){
                case "añadir":
                    obx.engadir(listaAlumnos);
                    break;
                case "ver":
                    obx.ver(listaAlumnos);
                    break;
                case "borrar":
                    obx.borrar(listaAlumnos);
                    break;
                case "ordenar":
                    Collections.sort(listaAlumnos);
                    break;
                case "buscar":
                    obx.buscar(listaAlumnos);
                    break;
                case "modificar":
                    obx.modificar(listaAlumnos);
                    break;
                case "salir":
                    System.exit(0);
                default:
                    System.out.println("No existe esa opción.");
            }
        }while(!op.equalsIgnoreCase("Salir"));
    }
}
