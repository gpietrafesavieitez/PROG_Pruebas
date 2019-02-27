/**
 * Gabriel P.
 * CPR Daniel Castelao
 * @author <gpietrafesavieitez@danielcastelao.org>
 */

package ejemploarchivoserializable;

import java.io.*;
import java.util.Scanner;

public class EscrituraSerializable {
    ObjectOutputStream fich;
    FileOutputStream f;
    Scanner leer = new Scanner(System.in);
    
    public void escribirObjSerial(String nome){
        try{
            // Crea el fichero de datos
            f = new FileOutputStream(nome + ".dat");
            // Abro el fichero en modo escritura y lo conecto con f
            fich = new ObjectOutputStream(f);
            // fich = new ObjectOutputStream(new FileOutputStream(nome+".dat"));
            for(int i = 0; i < 3; i ++){
                System.out.println("Dame nombre:");
                String nombre = leer.next();
                System.out.println("Dame nota:");
                int nota = leer.nextInt();
                Alumno al = new Alumno(nombre,nota);
                fich.writeObject(al);
            }
        }catch(FileNotFoundException e){
            System.out.println("Error: Clase no encontrada.");
        }catch(IOException e1){ // Excepcion superior 
            System.out.println("Error: Problema de entrada/salida.");
        }finally{
            try{ // Por si hay problemas al cerrar
                fich.close();
                f.close();
            }catch (IOException e3){
                System.out.println("Error: Problema de entrada/salida.");
            }
        }
    }
}