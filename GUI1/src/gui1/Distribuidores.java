/**
 * Gabriel P.
 * CPR Daniel Castelao
 * @author <gpietrafesavieitez@danielcastelao.org>
 */

package gui1;

import java.awt.*;
import javax.swing.*;

public class Distribuidores {
    JFrame marco;
    JPanel panel;
    JButton btn1, btn2, btn3, btn4, btn5;
    
    public void init() {
        marco = new JFrame("Layouts");
        panel = new JPanel();
        btn1 = new JButton("Botón 1");
        btn2 = new JButton("Botón 2");
        btn3 = new JButton("Botón 3");
        btn4 = new JButton("Botón 4");
        btn5 = new JButton("Botón 5");
        marco.setDefaultCloseOperation(3);
        marco.setSize(600, 300);
        panel.add(btn1);
        panel.add(btn2);
        panel.add(btn3);
        panel.add(btn4);
        panel.add(btn5);
        marco.add(panel);
        marco.setVisible(true);
        panel.setVisible(true);
    }
    
    public void disFlowLayout(int alignment) {
        init();
        panel.setLayout(new FlowLayout(alignment));
    }
    
    public void disBoxLayout(int axis) {
        init();
        panel.setLayout(new BoxLayout(panel, axis));
    }
    
    public void disBorderLayout(String lay1, String lay2, String lay3, String lay4, String lay5) {
        init();
        panel.setLayout(new BorderLayout());
        panel.add(btn1, lay1);
        panel.add(btn2, lay2);
        panel.add(btn3, lay3);
        panel.add(btn4, lay4);
        panel.add(btn5, lay5); 
    }
    
    public void disGridLayout(int rows, int cols, int hgap, int vgap) {
        init();
        panel.setLayout(new GridLayout(rows, cols, hgap, vgap));
    }
    
    public void disCardLayout(int hgap, int vgap) {
        init();
        panel.setLayout(new CardLayout(hgap, vgap));
    }
}