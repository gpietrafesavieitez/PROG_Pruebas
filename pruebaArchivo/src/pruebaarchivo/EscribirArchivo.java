package pruebaarchivo;

/**
 * Gabriel P.
 * CPR Daniel Castelao
 * @author <gpietrafesavieitez@danielcastelao.org>
 */

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class EscribirArchivo {
    File archivo = null;
    PrintWriter f = null;
    Scanner leer = new Scanner(System.in);
    
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
    
    public void escribirLineas(String nomeFich,ArrayList<Alumno>lista){
        try{
            f = new PrintWriter(new File(nomeFich+".txt"));
            for(Alumno a1:lista){
                f.println(a1.getNome()+","+a1.getNota());
            }
        }catch(FileNotFoundException e){
            System.out.println(e.getMessage());
        }finally{
            f.close();
        }
    }
    
    public void engadir(String nomeFich){
        try{
            f = new PrintWriter(new FileWriter(nomeFich+".txt",true));
            Alumno a = new Alumno();
            System.out.println("Dame nombre");
            a.setNome(leer.next());
            System.out.println("Dame nota");
            a.setNota(leer.nextInt());
            f.println(a);
        }catch(IOException e){
            System.out.println(e.getMessage());
        }finally{
            f.close();
        }
    }
}