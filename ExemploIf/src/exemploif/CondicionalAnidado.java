package exemploif;
import javax.swing.JOptionPane;

public class CondicionalAnidado {
    public void avaliarConAnidados(){
        int num1,num2;
        String numero1 = JOptionPane.showInputDialog("teclea numero1 (num1) : ");
        num1 = Integer.parseInt(numero1);
        num2 = Integer.parseInt(JOptionPane.showInputDialog("teclea num2 : ")); //directamente
        if(num1 > num2)
            System.out.println("num1 é maior");
        /*
        }else{
            if(num1 < num2){
                System.out.println("num1 é menor");
            }else{
                System.out.println("son iguais");
            }
        }
        */
        //tamén se pode facer simplificando con else if :
        else if(num1<num2)
            System.out.println("num1 é menor");
        else
            JOptionPane.showMessageDialog(null,"son iguais");
    }
    
}
