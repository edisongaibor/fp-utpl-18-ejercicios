
package temperatura;
import java.util.Scanner;


public class Temperatura {

    
    public static void main(String[] args) {
        int temperatura=0;
        double cantidad=0;
        double n=0;
        
        
        Scanner leer=new Scanner(System.in);
        System.out.println("Escribir 1 para convertir de Grados Celsius a Grados Farenheit"
                + "\nEscribir 2 para convertir de Grados Farenheit a Grados Celsious");
        temperatura=leer.nextInt();
        System.out.println("Ingrese la cantidad a convertir");
        cantidad=leer.nextDouble();
        if(temperatura==1){
            n=(9/5)*cantidad+32;
        }
        if (temperatura==2){
            n=(cantidad-32)*5/9;
        }
        
        System.out.println("El resultado de la conversion es de:"+n);
    }
    
}
