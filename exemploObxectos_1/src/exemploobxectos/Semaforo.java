package exemploobxectos;

public class Semaforo {
    /**Atributos*/
    private String cor;
    /*Atributos**/
    
    /**Constructores*/
    
    //Constructor con parámetros
    public Semaforo(String co){
        cor = co;
    }
    
    /*Constructores**/
    
    /**Métodos de acceso*/
    public String darCor() { //getCor
        return cor;
    }
    
    public void ponCor(String c) { //setCor
        cor = c;
    }
    /*Métodos de acceso**/
}
