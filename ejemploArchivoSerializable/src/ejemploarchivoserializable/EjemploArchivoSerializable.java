/**
 * Gabriel P.
 * CPR Daniel Castelao
 * @author <gpietrafesavieitez@danielcastelao.org>
 */

package ejemploarchivoserializable;

public class EjemploArchivoSerializable {

    public static void main(String[] args) {
        EscrituraSerializable escribir = new EscrituraSerializable();
        escribir.escribirObjSerial("alumnos");
        LecturaSerializable leer = new LecturaSerializable();
        leer.leerObjSerial("alumnos");
    }
}
