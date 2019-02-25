package pruebaarchivo;

/**
 * Gabriel P.
 * CPR Daniel Castelao
 * @author <gpietrafesavieitez@danielcastelao.org>
 */

import java.io.*;
import java.util.Scanner;

public class EscribirArchivo {
    File archivo = null;
    PrintWriter f = null;
    
    public File escribirNumeros(String ruta){
        archivo = new File(ruta+".txt");
        try{
            f = new PrintWriter(archivo);
            Scanner sc = new Scanner(System.in);
            f.println(sc.nextLine());
        }catch(FileNotFoundException e){
            System.out.println(e.getMessage());
        }
        return archivo;
    }
}