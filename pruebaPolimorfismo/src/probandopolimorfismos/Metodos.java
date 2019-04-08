/**
 * Gabriel P.
 * CPR Daniel Castelao
 * @author <gpietrafesavieitez@danielcastelao.org>
 */

package probandopolimorfismos;

import java.util.ArrayList;

public class Metodos {
    
    public static void mostrar(ArrayList<Persona> lista){
        for(int i = 0; i < lista.size(); i ++){
            System.out.println(lista.get(i));
        }
    }
}