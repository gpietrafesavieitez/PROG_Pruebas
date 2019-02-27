/**
 * Gabriel P.
 * CPR Daniel Castelao
 * @author <gpietrafesavieitez@danielcastelao.org>
 */

package ejemploarchivoserializable;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LecturaSerializable {
    ObjectInputStream ler;
    FileInputStream f;
    Alumno al;
    
    public void leerObjSerial(String nombreArchivo){
        try{
            f = new FileInputStream(nombreArchivo + ".dat");
            ler = new ObjectInputStream(f);
            do{
                al = (Alumno) ler.readObject();
                System.out.println(al);
            }while(al != null);
        }catch(ClassNotFoundException e){
            System.out.println("Error: Clase no encontrada.");
        }catch(FileNotFoundException e1){
            System.out.println("Error: Archivo no encontrado.");
        }catch(IOException e2){
            System.out.println("Error: Problema de entrada/salida.");
        }finally{
            try{
                ler.close();
                f.close();
            }catch (IOException e3){
                System.out.println("Error: Problema de entrada/salida.");
            }
        }
    }
}