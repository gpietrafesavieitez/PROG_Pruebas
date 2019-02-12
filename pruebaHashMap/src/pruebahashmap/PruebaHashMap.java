/**
 * Gabriel P.
 * CPR Daniel Castelao
 * @author <gpietrafesavieitez@danielcastelao.org>
 */

package pruebahashmap;

import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JOptionPane;

public class PruebaHashMap {

    public static void main(String[] args) {
        HashMap<String,Alumno> listaAlumnos = new HashMap<>();
        ArrayList<Alumno> lista = new ArrayList<>();
        Secretaria secretaria = new Secretaria();
        int op;
        String dni;
        do{
            op = Integer.parseInt(JOptionPane.showInputDialog(null,"1 - Añadir\n2 - Mostrar\n3 - Migrar\n4 - Eliminar\n5 - Mudar\n6 - Consultar\n0 - Salir","Menu",0));
            switch(op){
                case 1:
                dni = JOptionPane.showInputDialog(null,"Dame dni");
                secretaria.crear(listaAlumnos,dni);
                break;
                case 2:
                    secretaria.amosar(listaAlumnos);
                    break;
                case 3:
                    secretaria.pasarArrayList(listaAlumnos, lista);
                    break;
                case 4:
                    dni = JOptionPane.showInputDialog(null,"Dame dni");
                    secretaria.eliminar(listaAlumnos, dni);
                    break;
                case 5:
                    dni = JOptionPane.showInputDialog(null,"Dame dni");
                    secretaria.mudar(listaAlumnos, dni);
                    break;
                case 6:
                    dni = JOptionPane.showInputDialog(null,"Dame dni");
                    secretaria.consultar(listaAlumnos, dni);
                    break;
                case 0:
                    System.exit(0);
            }
        }while(op != 0);
    }
}
