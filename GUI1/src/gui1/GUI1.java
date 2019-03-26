/**
 * Gabriel P.
 * CPR Daniel Castelao
 * @author <gpietrafesavieitez@danielcastelao.org>
 */

package gui1;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;

public class GUI1 {

    public static void main(String[] args) {
//        Ventana1 ven1 = new Ventana1();
//        ven1.crearVentana1();
//        Ventana2 ven2 = new Ventana2();
//        ven2.crearVentana2();
//        Componentes obx = new Componentes();
//        obx.crearVentana();
        Distribuidores d = new Distribuidores();
        d.disFlowLayout(FlowLayout.LEFT);
        d.disBoxLayout(BoxLayout.Y_AXIS);
        d.disBorderLayout(BorderLayout.NORTH, BorderLayout.SOUTH, BorderLayout.EAST, BorderLayout.WEST, BorderLayout.CENTER);
//        d.disGridLayout(5, 5, 0, 0);
//        d.disCardLayout(20, 30);
    }
}
