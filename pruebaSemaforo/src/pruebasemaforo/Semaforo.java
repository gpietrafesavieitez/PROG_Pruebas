package pruebasemaforo;

public class Semaforo{
    private String color = "ROJO"; //Variable privada del color, por defecto es rojo (solo es accesible indirectamente mediante métodos) 
    
    public void setColor(String newColor){ //Método setter, recibe String 
        color = newColor; //Setea la variable privada color con el nuevo
    }
    
    public String getColor(){ //Método getter, devuelve String
        return color; //Devuelve el color en forma de String
    }
    
}
