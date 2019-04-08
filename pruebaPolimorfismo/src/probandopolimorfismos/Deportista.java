/**
 * Gabriel P.
 * CPR Daniel Castelao
 * @author <gpietrafesavieitez@danielcastelao.org>
 */

package probandopolimorfismos;

public class Deportista extends Persona {
    private String tipoDeporte;

    public Deportista() {
    }

    public Deportista(String tipoDeporte) {
        this.tipoDeporte = tipoDeporte;
    }
    
    public Deportista(String tipoDeporte, String nombre, float sueldo) {
        super(nombre, sueldo);
        this.tipoDeporte = tipoDeporte;
    }

    public String getTipoDeporte() {
        return tipoDeporte;
    }

    @Override
    public String toString() {
        return super.toString() + "Deportista{" + "tipoDeporte=" + tipoDeporte + '}';
    }
    
    @Override
    public float calcularSueldo(){
        return super.calcularSueldo() + 20000;
    }
}