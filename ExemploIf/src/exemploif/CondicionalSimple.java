package exemploif;
import java.util.Scanner;

public class CondicionalSimple{
    Scanner leer = new Scanner(System.in);
    
    public void maiorIdade(){
        System.out.print("Dame a idade: "); int idade = leer.nextInt();
        if(idade < 18) 
            System.out.println("É menor de idade");
        System.out.println("Fin");
    }
    
}
