/**
 * Gabriel P.
 * CPR Daniel Castelao
 * @author <gpietrafesavieitez@danielcastelao.org>
 */

package pruebaarchivo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class PruebaArchivo {

    public static void main(String[] args) throws FileNotFoundException {
        File f;
        Leer obx = new Leer();
        
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
    }
}
