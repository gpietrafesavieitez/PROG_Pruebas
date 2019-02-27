/**
 * Gabriel P.
 * CPR Daniel Castelao
 * @author <gpietrafesavieitez@danielcastelao.org>
 */

package ejemploarchivoserializable;

import java.io.*;

public class LecturaSerializable {
    ObjectInputStream o;
    FileInputStream f;
    Alumno al;
    
    public void leerObjSerial(String nombreArchivo){
        try{
            f = new FileInputStream(nombreArchivo + ".dat");
            o = new ObjectInputStream(f);
            do{
                try{
                    al = (Alumno) o.readObject();
                    System.out.println(al);
                }catch(Exception e){
                    break;
                }
            }while(al != null);
        }catch(FileNotFoundException e1){
            System.out.println("Error: Archivo no encontrado.");
        }catch(IOException e2){
            System.out.println("Error: Problema de entrada/salida.");
        }finally{
            try{
                o.close();
                f.close();
            }catch (IOException e3){
                System.out.println("Error: Problema de entrada/salida.");
            }
        }
    }
}