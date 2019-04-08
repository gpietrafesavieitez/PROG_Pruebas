/**
 * Gabriel P.
 * CPR Daniel Castelao
 * @author <gpietrafesavieitez@danielcastelao.org>
 */

package probandopolimorfismos;

import java.util.ArrayList;

public class Main {
    
    public static void main(String[] args) {
        Persona person = new Persona("gab", 6969);
        Deportista depor = new Deportista("futbol", "cr7", 500);
        Profesor profe = new Profesor("ciclo", "nina", 1000);
        System.out.println("Persona: " + person.calcularSueldo()); // usa el metodo original
        System.out.println("Deportista: " + depor.calcularSueldo());  // usa el metodo sobreescrito
        System.out.println("Profesor: " + profe.calcularSueldo()); // hereda metodo de la superclase
        /*
        person = depor;
        depor = (Deportista) person;
        person = profe;
        */
        ArrayList<Persona> l = new ArrayList<>();
        l.add(person);
        l.add(profe);
        l.add(depor);
        Metodos.mostrar(l);
    }
}