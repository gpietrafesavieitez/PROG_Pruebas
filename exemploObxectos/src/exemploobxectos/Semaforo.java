package exemploobxectos;

public class Semaforo {
    private String cor;
    
    /*Métodos de acceso*/
    public String darCor() { //getCor
        return cor;
    }
    
    public void ponCor(String c) { //setCor
        cor = c;
    }
}
