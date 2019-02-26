/**
 * Gabriel P.
 * CPR Daniel Castelao
 * @author <gpietrafesavieitez@danielcastelao.org>
 */

package ejemploarchivoserializable;

import java.io.*;

public class LecturaSerializable {
    ObjectInputStream ler;
    FileInputStream f;
    Alumno al = null;
    
    public void lerSerializado(String nombreArchivo){
        try{
            f = new FileInputStream(nombreArchivo+".dat");
            ler = new ObjectInputStream(f);
            al = (Alumno)ler.readObject();
            while(al != null){
                System.out.println(al);
                al = (Alumno)ler.readObject();
            }
        }catch(ClassNotFoundException e){
            System.out.println(e.getMessage());
        }catch(FileNotFoundException e1){
            System.out.println(e1.getMessage());
        }catch(IOException e2){
            System.out.println(e2.getMessage());
        }
    }
}