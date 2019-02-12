/**
 * Gabriel P.
 * CPR Daniel Castelao
 * @author <gpietrafesavieitez@danielcastelao.org>
 */

package pruebahashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import javax.swing.JOptionPane;

public class Secretaria {
    
    public static int refs = 6000;
    
    public void crear(HashMap<String,Alumno> alumno, String dni){
        if(alumno.containsKey(dni)){
            JOptionPane.showMessageDialog(null,"Xa esta no listado");
        }else{
            String inputAlumno;
            int inputNota;
            inputAlumno = JOptionPane.showInputDialog(null,"Dame nombre");
            inputNota = Integer.parseInt(JOptionPane.showInputDialog(null,"Dame nota"));
            alumno.put(dni, new Alumno(inputAlumno ,inputNota));
        }
    }
    
    public void amosar(HashMap<String,Alumno> alumno){
        System.out.println(alumno);
        /*Iterator it = alumno.keySet().iterator();
        while(it.hasNext()){
            System.out.println(alumno.get(it));
        }*/
    }
    
    public void pasarArrayList(HashMap<String,Alumno> alumno, ArrayList<Alumno> lista){
        //Creo arraylist para meter TODOS los valores de la lista del hashmap
        lista.addAll(alumno.values()); 
        // System.out.println(lista);
        for(Alumno a1 : lista){
            System.out.println(a1);
        }
    }
    
    public void eliminar(HashMap<String, Alumno> alumno, String dni){
        if(!alumno.containsKey(dni)){
            JOptionPane.showMessageDialog(null, "Non esta no listado");
        }else{
            alumno.remove(dni);
        }
    }
    
    public void mudar(HashMap <String,Alumno> alumno, String dni){
        if(!alumno.containsKey(dni)){
            JOptionPane.showMessageDialog(null, "Non esta no listado");
        }else{
            Alumno a = alumno.get(dni);
            int inputNota = Integer.parseInt(JOptionPane.showInputDialog(null,"Nueva nota:"));
            a.setNota(inputNota);
            alumno.replace(dni, a);
        }
    }
    
    public void consultar(HashMap <String,Alumno> alumno, String dni){
        if(!alumno.containsKey(dni)){
            JOptionPane.showMessageDialog(null, "Non esta no listado");
        }else{
            System.out.println(alumno.get(dni));
        }
    }
}