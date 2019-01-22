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
    //int[] notas = new int[8];
    int[] notas = {1,2,3,2,5,2,7,1,5,5,5,5,5,2};
    
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
        System.out.println("FIN.\n");
    }
    // Recorre el array "notas" y en cada iteracion almacena la
    // posicion actual de memoria del array en la variable "elemento" 
    
    /*
    public void buscarElemento(){
        boolean atopado = false;
        int elementoABuscar = Integer.parseInt(JOptionPane.showInputDialog(null,"Introduce el elemento a buscar:","Buscador",3));
        for(int i = 0; i < notas.length; i ++){
            if(notas[i] == elementoABuscar){
                JOptionPane.showMessageDialog(null,"Elemento encontrado en la posición: " + (i + 1),"Buscador",1);
                atopado = true;
                break; // Sale del cursor al encontrar una coincidencia
            }
        }
        if(atopado == false){
            JOptionPane.showMessageDialog(null,"No se han encontrado coincidencias.","Buscador",2);
        }
    }
    */
    
    public void buscarElementos(){
        int c = 0;
        String atopados[] = new String[notas.length]; // Nuevo array para recoger coincidencias con tamaño igual al array notas
        int elementoABuscar = Integer.parseInt(JOptionPane.showInputDialog(null,"Introduce el elemento a buscar:","Buscador avanzado",3));
        for(int i = 0; i < notas.length; i ++){
            if(notas[i] == elementoABuscar){
                c++;
                atopados[i] = "Encontrado";
            }
        }
        if(c > 0){
            //System.out.println("[*]\tCoincidencias:\t[" + c + "]");
            for(int i = 0; i < atopados.length; i ++){
                if(atopados[i] == "Encontrado"){
                    System.out.println("[-]\tPosición " + (i + 1) + ":\t[" + atopados[i] + "]");
                }
            }
        }else{
            JOptionPane.showMessageDialog(null,"No se han encontrado coincidencias.","Buscador avanzado",2);
        }
    }
}
