
package taller1;
import java.util.Scanner;

public class Ejercicio1 {
    

    public static void main(String[] args) {
        double sueldo=0;
        String hijo;
        double pasaje=0;
        double bar=0;
        double salidas=0;
        int numerohijos=0;
        double totalpasajes=0;
        double totalbar=0;
        double totalsalidas=0;
        double rubro=0;
        String cadena;
     
        
        cadena=String.format("%s\t%s\t%s\t%s\n","Persona","Pasajes","Bar","Salidas");
        Scanner entrada=new Scanner(System.in);
        System.out.println("Ingrese sueldo de padre de familia\n");
            sueldo=entrada.nextDouble();
        System.out.println("Ingrese numero de hijos");
        numerohijos=entrada.nextInt();
        for(int contador=1;contador<=numerohijos;contador++){
            entrada.nextLine();
            System.out.printf("Ingrese Hijo:%d\n",contador);
            hijo=entrada.nextLine();
            System.out.println("Ingrese valor en pasaje\n");
            pasaje=entrada.nextDouble();
            System.out.println("Ingrese gastos en bar\n");
            bar=entrada.nextDouble();
            System.out.println("Ingrese gastos en salidas\n");
            salidas=entrada.nextDouble();
            
            totalpasajes=totalpasajes+pasaje;
            totalbar=totalbar+bar;
            totalsalidas=totalsalidas+salidas;
            rubro=totalpasajes+totalbar+totalsalidas;
            
            cadena=cadena+String.format("%s\t%f\t%f\t%f\n",hijo,pasaje,bar,salidas);
        }
            System.out.printf("%s",cadena);
            System.out.printf("Totales:%f\t%f\t%f\n",totalpasajes,totalbar,totalsalidas);
          
            
            if(sueldo<rubro){
                System.out.println("Al padre le falta dinero");
            }
            if(sueldo==rubro){
                System.out.println("El sueldo y los gastos de los hijos son iguales");
            }
            if(sueldo>rubro){
                System.out.println("Al padre le sobra dinero");
            }
        
    }
    
}
