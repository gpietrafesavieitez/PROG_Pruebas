package exemploobxectos2;
import java.util.Scanner;

public class Rectangulo {
    
    private float base, altura;
    
    //Constructores
    
        //Vacío (por defecto)
        public Rectangulo(){
            
        }
        
        //Con parámetros
        public Rectangulo(float b){
            base = b;
        }
        
        public Rectangulo(float b, float a){
            base = b;
            altura = a;
        }
    
    //Métodos de acceso
        
        //Setter
        public void setBase(float b){
            base = b;
            
        }
        
        //Getter
        public float getBase(){
            return base;
        }
        
        public float area(){
            return base * altura;
        }
        
        public void perim(){
            Scanner leer = new Scanner(System.in);
            base = leer.nextFloat();
            altura = leer.nextFloat();
            System.out.println((2 * base) + (2 * altura));
        }
}
