/**
 * Gabriel P.
 * CPR Daniel Castelao
 * @author <gpietrafesavieitez@danielcastelao.org>
 */

package pruebaarchivo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class PruebaArchivo {

    public static void main(String[] args) throws FileNotFoundException {
        File f;
        Leer obx = new Leer();
        Scanner leer = new Scanner(System.in);
        
        f = new File("/home/local/DANIELCASTELAO/gpietrafesavieitez/archivo.txt");
        obx.porLineas(f);
        obx.porPalabras(f);
        
        f = new File("/home/local/DANIELCASTELAO/gpietrafesavieitez/nombresConComa.txt");
        obx.porDelimitador(f);
        
        f = new File("/home/local/DANIELCASTELAO/gpietrafesavieitez/archivoConNumeros.txt");
        ArrayList<Integer>l = new ArrayList<>();
        l = obx.porNumeros(f,l);
        
        f = new File("/home/local/DANIELCASTELAO/gpietrafesavieitez/archivoConAlumnos.txt");
        obx.leerObjetos(f);
        
        ArrayList<Alumno> listaAlumnos = new ArrayList<>();
        EscribirArchivo obxEscribir = new EscribirArchivo();
        obxEscribir.escribirNumeros("num");
        
        for(int i = 0; i < 4; i++){
            Alumno a = new Alumno();
            System.out.println("Dame nombre");
            a.setNome(leer.next());
            System.out.println("Dame nota");
            a.setNota(leer.nextInt());
            listaAlumnos.add(a);
        }
        obxEscribir.escribirLineas("alumnado", listaAlumnos);
    }
}
