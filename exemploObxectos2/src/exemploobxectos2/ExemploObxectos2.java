package exemploobxectos2;

public class ExemploObxectos2 {

    public static void main(String[] args) {
        Rectangulo obxRect1 = new Rectangulo(3f,5f);
        System.out.println(obxRect1.getBase());
        
        Rectangulo obxRect2 = new Rectangulo();
        System.out.println(obxRect2.area());
        
        Rectangulo obxRect3 = new Rectangulo(7,10);
        System.out.println(obxRect3.area());
        
        Rectangulo obxRect4 = new Rectangulo();
        obxRect4.perim();
    }
    
}
