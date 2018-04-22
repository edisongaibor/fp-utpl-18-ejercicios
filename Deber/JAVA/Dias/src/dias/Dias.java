
package dias;
import java.util.Scanner;

/**
 *
 * @author Edison Gaibor
 */
public class Dias {

    
    public static void main(String[] args) {
        int num;
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese un numero del 1 al 7"
                + "\nEl numero que ingrese le dira a que dia de la semana pertenece");
        
        num=leer.nextInt();
        
        switch(num){
            case 1:
                if(num==1){
                System.out.println("Lunes");
                }
            break;
            case 2:
                if(num==2){
                    System.out.println("Martes");
                }
            break;
            case 3:
                if(num==3){
                    System.out.println("Miercoles");
                }
            break;
            case 4:
                if(num==5){
                    System.out.println("Jueves");
                }
            break;
            case 5:
                if(num==5){
                    System.out.println("Viernes");
                }
             break;
            case 6:
                if(num==6){
                    System.out.println("Sabado");
                }
            break;
            case 7:
                if(num==7){
                    System.out.println("Domingo");
                }
            break;
             
                    
                
        }
                
        
        
        
        
    }
    
}
