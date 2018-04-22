
package balones;
import java.util.Scanner;

public class Balones {

    public static void main(String[] args) {
        double costo=0;
        int num=0;
        double subtotal=0;
        double total=0;
        double cadauno=0;
        
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese el costo de los balones que desea comprar");
        costo=leer.nextDouble();
        System.out.println("Ingrese el numero de balones que desea comprar");
        num=leer.nextInt();
        cadauno=num*costo;
        if(num==1){
            subtotal=costo*num*0.50;
        }
        if(num==2){
            subtotal=costo*num*0.70;
        }
        if (num==3){
            subtotal=costo*0.80;
        }
        total=cadauno-subtotal;
        System.out.println("El numero de balones que ha comprado son:"+num);
        System.out.println("El precio de cada balon es de:"+costo);
        System.out.println("El valor total de su compra es de:"+total);
        
        
       
    }
    
}
