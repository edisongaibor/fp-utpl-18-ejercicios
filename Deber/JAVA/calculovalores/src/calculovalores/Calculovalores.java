
package calculovalores;
import java.util.Scanner;

public class Calculovalores {

    public static void main(String[] args) {
        double a=0;
        double b=0;
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese el valor de x");
        a=leer.nextDouble();
        if(a<0){
           b=3*a+10;
        }
        if(a>0){
            b=Math.pow(a,2)+6;
        }
        if(a==0){
            b=1;
        }
        
        System.out.println("El valor de y es:"+b);
        
       
        
    }
    
}
