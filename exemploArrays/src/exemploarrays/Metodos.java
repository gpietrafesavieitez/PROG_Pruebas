/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemploarrays;

import javax.swing.JOptionPane;

/**
 *
 * @author gpietrafesavieitez
 */
class Metodos {
    
    // Declaro array y las posiciones de memoria que tendra
    int[] notas = new int[8];
    
    // Metodo para introducir los valores y que los devuelva
    public int darValor(){
        return Integer.parseInt(JOptionPane.showInputDialog("Dame valor:"));
    }
    
    // Metodo para inicializar el array con valores
    public void crearArray(){
        for(int i = 0; i < notas.length; i ++){
            notas[i] = darValor();
        }
    }
    
    public void amosar(){
        for(int i = 0; i < notas.length; i ++){
            System.out.print(notas[i]);
            System.out.print(",");
        }
        System.out.println("FIN.");
    }
    
    public void amosarForEach(){
        System.out.println("***uso for each***");
        for(int elemento : notas){
            System.out.print(elemento);
            System.out.print(",");
        }
        System.out.println("FIN.");
    }
    // Recorre el array "notas" y en cada iteracion almacena la
    // posicion actual de memoria del array en la variable "elemento" 
    
    public void buscarElemento(){
        // boolean atopado = false;
        int elementoBuscar = Integer.parseInt(JOptionPane.showInputDialog("Intoduce el elemento a buscar:"));
        for(int i = 0; i < notas.length; i ++){
            if(notas[i] == elementoBuscar){
                JOptionPane.showMessageDialog(null,"Se ha encontrado " + elementoBuscar + " en la posición " + (i + 1));
                // atopado = true;
                System.exit(0);
            }
        }
        // atopado = false;
        JOptionPane.showMessageDialog(null,"No está en la lista.");
    }
    
    public void buscarVarios(){
        int encontrados[] = new int[notas.length];
        int elementoBuscar = Integer.parseInt(JOptionPane.showInputDialog("Intoduce el elemento a buscar:"));
        for(int i = 0; i < notas.length; i ++){
            if(notas[i] == elementoBuscar){
                encontrados[i] = elementoBuscar;
            }
        }
    }
}
