package pruebaarchivo;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Gabriel P.
 * CPR Daniel Castelao
 * @author <gpietrafesavieitez@danielcastelao.org>
 */

public class Leer {
    Scanner sc;
    
    public void porPalabras(File arch){
        try{
            sc = new Scanner(arch);
            while(sc.hasNextLine()){
                System.out.println(sc.nextLine());
            }
            sc.close();
        }catch(FileNotFoundException e){
            System.out.println(e.getMessage());
        }
    }

    public void porLineas(File arch) throws FileNotFoundException{
        sc = new Scanner(arch);
        while(sc.hasNextLine()){
            System.out.println(sc.nextLine());
        }
        sc.close();
    }
    
    public void porDelimitador(File arch){
        try{
            sc = new Scanner(arch).useDelimiter("\\s*,\\s*");
            while(sc.hasNext()){
                System.out.println(sc.next());
            }
        }catch(FileNotFoundException e){
            System.out.println(e.getMessage());
        }finally{
            sc.close();
        }
    }
    
    public ArrayList<Integer> porNumeros(File arch,ArrayList<Integer> lista){
        try{
            sc = new Scanner(arch);
            while(sc.hasNextInt()){
                lista.add(sc.nextInt());
            }
        }catch(FileNotFoundException e){
            System.out.println(e.getMessage());
        }finally{
            sc.close();
        }
        return lista;
    }
    
    public void leerObjetos(File arch){
        try{
            sc = new Scanner(arch);
            while(sc.hasNextLine()){
                String[] alumno = sc.nextLine().split(":");
                System.out.println(alumno[0] + "" + alumno[1]);
            }
        }catch(FileNotFoundException e){
            System.out.println(e.getMessage());
        }finally{
            sc.close();
        }
    }
}