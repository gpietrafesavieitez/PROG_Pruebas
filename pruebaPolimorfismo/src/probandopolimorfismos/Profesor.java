/**
 * Gabriel P.
 * CPR Daniel Castelao
 * @author <gpietrafesavieitez@danielcastelao.org>
 */

package probandopolimorfismos;

public class Profesor extends Persona {
    private String modulo;

    public Profesor() {
    }

    public Profesor(String modulo) {
        this.modulo = modulo;
    }

    public Profesor(String modulo, String nombre, float sueldo) {
        super(nombre, sueldo);
        this.modulo = modulo;
    }

    public String getModulo() {
        return modulo;
    }

    @Override
    public String toString() {
        return super.toString() + "Profesor{" + "modulo=" + modulo + '}';
    }
}