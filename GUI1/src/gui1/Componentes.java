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
    JComboBox   listaCombo      ;

    public void crearVentana(){
        // Instanciamos
        marco = new JFrame("Marco");
        panel = new JPanel();
        btn1 = new JButton("Botón 1");
        btn2 = new JButton("Botón 2");
        etiqueta = new JLabel("Nombre: ");
        lineaTexto = new JTextField();
        listaCombo = new JComboBox();
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
        etiqueta.setBounds(50, 100, 100, 10);
        panel.add(etiqueta);
        lineaTexto.setBounds(120, 100, 300, 20);
        lineaTexto.setColumns(15);
        panel.add(lineaTexto);
        btn1.setBounds(200, 300, 100, 50);
        panel.add(btn1);
        btn2.setBounds(400, 300, 100, 50);
        panel.add(btn2);
        listaCombo.setBounds(350, 200, 70, 20);
        listaCombo.addItem("hola");
        listaCombo.addItem("adios");
        listaCombo.addItem("que tal");
        panel.add(listaCombo);
    }   
}