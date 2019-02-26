/**
 * Gabriel P.
 * CPR Daniel Castelao
 * @author <gpietrafesavieitez@danielcastelao.org>
 */

package ejemploarchivoserializable;

import java.io.*;
import java.util.Scanner;

public class EscribirSerializable {
    ObjectOutputStream fich;
    FileOutputStream f;
    Scanner leer = new Scanner(System.in);
    
    public void escribirObjetosSeri(String nome){
        try{
            // f = new FileOutputStream(nome+".dat");
            // fich = new ObjectOutputStream(f);
            // TODO EN UNO:
            fich = new ObjectOutputStream(new FileOutputStream(nome+".dat"));
            Alumno al = new Alumno("gabriel",8);
            System.out.println(al.toString());
            fich.writeObject(al.getNome() + al.getNota());
            
        }catch(FileNotFoundException e){
            System.out.println(e.getMessage());
        }catch(IOException e1){ // Excepcion superior 
            System.out.println(e1.getMessage());
        }finally{
            try{ // Por si hay problemas al cerrar
                fich.close();
            }catch (IOException e3){
                System.out.println(e3.getMessage());
            }
        }
    }
}