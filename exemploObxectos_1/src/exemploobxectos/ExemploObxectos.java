package exemploobxectos;

public class ExemploObxectos {

    public static void main(String[] args) {
        //Declaro e instancio un obxecto de tipo Semaforo para acceder a la clase Semaforo
        Semaforo unSemaforo = new Semaforo("amarelo");
        System.out.println("Color inicial = " + unSemaforo.darCor());
        unSemaforo.ponCor("azul");
        System.out.println("Color siguiente = " + unSemaforo.darCor());
     
    }
    
}
