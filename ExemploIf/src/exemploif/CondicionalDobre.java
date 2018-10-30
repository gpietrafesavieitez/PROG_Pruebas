package exemploif;
import java.util.Scanner;

public class CondicionalDobre{
    Scanner leer = new Scanner(System.in);
    
    public void maiorIdade1(){
        System.out.print("Dame a idade: "); int idade = leer.nextInt();
        if(idade < 18){
            System.out.println("É menor de idade");
        }else{
            System.out.println("É maior de idade");
        }
        System.out.println("Fin");
    }
    
    public void maiorIdade2(){
        String resposta = "É maior de idade";
        System.out.print("Dame a idade: "); int idade = leer.nextInt();
        if(idade < 18){
            resposta = "É menor de idade";
        }
        System.out.println(resposta);
        System.out.println("Fin");
    }
    
    public void maiorMenorOperador(){
        System.out.print("Dame a idade: "); int idade = leer.nextInt();
        String resposta;
        resposta = (idade < 18) ? "É menor" : "É maior";
        System.out.println(resposta);
        System.out.println("Fin");
    }
}
