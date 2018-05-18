
package taller1;
import java.util.Scanner;


public class Ejercicio2 {
    public static void main(String[] args) {
        
        double sueldo;
        String hijo;
        double pasaje;
        double bar;
        double salidas;
        int numerohijos;
        double totalpasajes=0;
        double totalbar=0;
        double totalsalidas=0;
        double rubro=0;
        String cadena;
        String cadena2;
        String padredefamilia=null;
        int familias;
        int contador2;
        
        
        Scanner entrada=new Scanner(System.in);
        System.out.println("Ingrese numero de familias");
        familias=entrada.nextInt();
        
        
        cadena=String.format("%s","Familias\n");

       
        for(contador2=1;contador2<=familias;contador2++){
            entrada.nextLine();
            System.out.println("Ingrese nombre de padre de familia\n");
            padredefamilia=entrada.nextLine();
            System.out.println("Ingrese sueldo de padre de familia\n");
            sueldo=entrada.nextDouble();
            System.out.println("Ingrese numero de hijos\n");
            numerohijos=entrada.nextInt();
            
            for(int contador=1;contador<=numerohijos;contador++){
                entrada.nextLine();
                System.out.printf("Ingrese Nombre de Hijo:%d\n",contador);
                hijo=entrada.nextLine();
                System.out.println("Ingrese gastos en pasajes\n");
                pasaje=entrada.nextDouble();
                System.out.println("Ingrese gastos en bar\n");
                bar=entrada.nextDouble();
                System.out.println("Ingrese gastos en salidas\n");
                salidas=entrada.nextDouble();
                
                
                totalpasajes=totalpasajes+pasaje;
                totalbar=totalbar+bar;
                totalsalidas=totalsalidas+salidas;
                rubro=totalpasajes+totalbar+totalsalidas;
                

                
                cadena=cadena+String.format("\n%s\n%s\t%s\n%s\t%f\n%s\t%d\n%s\t\t%s\t\t%s\t\t%s\n%s\t\t%f\t%f\t%s\n%s\t\t%f\t%f\t%f\n","Reporte Gastos de Padres de Familia","Nombre del padre de familia:",padredefamilia,"Sueldo Semanal:$",sueldo,"Numero de Hijos:",numerohijos,"Persona","Pasaje","Bar","Salidas",hijo,pasaje,bar,salidas,"Total:",totalpasajes,totalbar,totalsalidas);
                
                entrada.nextLine();
            }
            
            //Refresca variables de operaciones
            
                totalpasajes=0;
                totalbar=0;
                totalsalidas=0;
                rubro=0;
            
            
            
            
                if(sueldo<rubro){
                cadena = cadena + String.format("Al padre de familia:%s le falta dinero",padredefamilia);
                }
                if(sueldo==rubro){
                cadena = cadena + String.format("El sueldo y los gastos de los hijos de la familia:%s son iguales",padredefamilia);
                }
                if(sueldo>rubro){
                cadena = cadena + String.format("Al padre de familia:%s le sobra dinero",padredefamilia);
                }
        }

    System.out.printf("%s",cadena);
    

       
        
    }
    }
    

    
