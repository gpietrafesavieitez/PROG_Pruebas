/**
 * Gabriel P.
 * CPR Daniel Castelao
 * @author <gpietrafesavieitez@danielcastelao.org>
 */

package gui1;

import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.*;

public class Ventana1 {
    
    JFrame marco; // ventana base
    JDialog ventanaSecundaria; // ventana extra (emergente)
    JPanel panel;
    
    public void crearVentana1(){
        marco = new JFrame("Probando ventana instanciando");
        marco.setBounds(100, 100, 800, 600); // x, y, anchura, altura
        marco.setResizable(false); // impedir redimensionamiento
        marco.setExtendedState(JFrame.MAXIMIZED_BOTH); // si queremos empezar en pantalla completa, conflicto con resizable false
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // accion predeterminada al cerrar => salir
        Toolkit pantalla = Toolkit.getDefaultToolkit();
        Image icono = pantalla.getImage("icon.png");
        marco.setIconImage(icono);
//        ventanaSecundaria = new JDialog(marco); // asocio con principal
//        ventanaSecundaria.setTitle("Ventana emergente");
//        ventanaSecundaria.setBounds(100, 100, 800, 600);
        panel = new JPanel();
        panel.setBackground(Color.cyan);
        panel.setVisible(true);
        marco.setVisible(true); // por defecto las ventanas nacen invisibles
        //        ventanaSecundaria.setVisible(true);
        marco.add(panel); // agregamos el panel al marco
    }
}