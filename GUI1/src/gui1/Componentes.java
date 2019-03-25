/**
 * Gabriel P.
 * CPR Daniel Castelao
 * @author <gpietrafesavieitez@danielcastelao.org>
 */

package gui1;

import java.awt.Color;
import javax.swing.*;

public class Componentes {
    
    JFrame      marco           ;
    JPanel      panel           ;
    JButton     btn1, btn2      ;
    JLabel      etiqueta        ;
    JTextField  lineaTexto      ;

    public void crearVentana(){
        // Instanciamos
        marco = new JFrame("Marco");
        panel = new JPanel();
        btn1 = new JButton("Botón 1");
        btn2 = new JButton("Botón 2");
        etiqueta = new JLabel("Nombre: ");
        lineaTexto = new JTextField();
        // Configuramos contenedores
        marco.setSize(900, 500);
        marco.setDefaultCloseOperation(3);
        marco.setVisible(true);
        panel.setSize(800, 400);
        panel.setBackground(Color.gray);
        panel.setVisible(true);
        panel.setLayout(null);
        // Añadimos componentes
        marco.add(panel);
        etiqueta.setBounds(50, 100, 50, 10);
        etiqueta.setLocation(50, 100);
        panel.add(etiqueta);
        lineaTexto.setBounds(100, 100, 30, 20);
        lineaTexto.setColumns(15);
        panel.add(lineaTexto);
        btn1.setBounds(200, 300, 100, 50);
        panel.add(btn1);
        btn2.setBounds(400, 300, 100, 50);
        panel.add(btn2);
    }   
}