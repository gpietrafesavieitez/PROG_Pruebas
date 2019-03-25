/**
 * Gabriel P.
 * CPR Daniel Castelao
 * @author <gpietrafesavieitez@danielcastelao.org>
 */

package gui1;

import javax.swing.JFrame;

public class Ventana2 extends JFrame {
    
    public void crearVentana2() {
        this.setSize(800, 600);
        this.setTitle("Probando ventana heredando");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}