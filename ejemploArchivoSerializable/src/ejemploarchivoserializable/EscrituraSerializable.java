/**
 * Gabriel P.
 * CPR Daniel Castelao
 * @author <gpietrafesavieitez@danielcastelao.org>
 */

package ejemploarchivoserializable;

import java.io.*;
import java.util.Scanner;
import utilidades.PedirDatos;

public class EscrituraSerializable {
    ObjectOutputStream o;
    FileOutputStream f;
    Scanner leer = new Scanner(System.in);
    
    public void escribirObjSerial(String nome){
        try{
            // Crea el fichero de datos
            f = new FileOutputStream(nome + ".dat");
            // Abro el fichero en modo escritura y lo conecto con f
            o = new ObjectOutputStream(f);
            // fich = new ObjectOutputStream(new FileOutputStream(nome+".dat"));
            for(int i = 0; i < 3; i ++){
                Alumno al = new Alumno(PedirDatos.tipoString("Nombre:"),PedirDatos.tipoInt("Dame nota:"));
                o.writeObject(al);
            }
        }catch(FileNotFoundException e1){
            System.out.println("Error: Clase no encontrada.");
        }catch(IOException e2){ // Excepcion superior 
            System.out.println("Error: Problema de entrada/salida.");
        }catch(NumberFormatException e3){
            System.out.println("Error: Formato inválido.");
        }catch(Exception e){
            System.out.println("Error: Excepción no controlada.");
        }finally{
            try{ // Por si hay problemas al cerrar
                o.close();
                f.close();
            }catch (IOException e3){
                System.out.println("Error: Problema de entrada/salida del fichero.");
            }
        }
    }
}