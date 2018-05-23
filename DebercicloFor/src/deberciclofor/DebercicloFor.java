
package deberciclofor;
import java.util.Scanner;

public class DebercicloFor {

    public static void main(String[] args) {
     
        String nombre;
        int edad=0;
        int numasignaturas=0;
        double calificacion1=0;
        double calificacion2=0;
        double prom=0;
        String bim1;
        String bim2;
        String persona;
        String materia=null;
        int num=0;
        int cnt=0;
        int contador=0;
        int contadordos=0;
        int contadortres=0;
        int contadorcuatro=0;
        int lim=0;
        double promparcial=0;
        double promtotal=0;
        String cadena;
        
        Scanner entrada=new Scanner(System.in);
        
        
        System.out.println("Ingrese numero de estudiantes\n");
        num=entrada.nextInt();
        
        cadena=String.format("%s","Reporte calificaciones de estudiantes\n");
        
        for(contador=1;contador<=num;contador++){

                entrada.nextLine();
                System.out.printf("Ingrese Nombre del estudiante\n");
                nombre=entrada.nextLine();
                System.out.println("Ingrese Edad del Estudiante\n");
                edad=entrada.nextInt();
                System.out.println("Ingrese Numero de materias\n");
                numasignaturas=entrada.nextInt();
                
                for(cnt=1;cnt<=numasignaturas;cnt++){
                    entrada.nextLine();
                    System.out.printf("Ingrese nombre de materia\n");
                    materia=entrada.nextLine();
                }
                

                System.out.printf("Ingrese calificacion primer bimestre\n");  
                calificacion1=entrada.nextDouble();
                

                System.out.printf("Ingrese calificacion segundo bimestre\n");
                calificacion2=entrada.nextDouble();
                    
                
                
                
                prom=(calificacion1+calificacion2)/2;
                promparcial=promparcial+prom;
                promtotal=promparcial/numasignaturas;
                

                
                cadena=cadena+String.format("%s\t%s\n%s\t%d\n%s\t%d\n%s\n\n%s\t%s\t%s\t%s\n%s\t%.2f\t%.2f\t%.2f\n\t\t%s\t%.2f\n","Nombre de Estudiante:",nombre,"Edad:",edad,"Numero de asignaturas:",numasignaturas,"Reporte de Notas","Persona","Bim-1","Bim-2","Promedio",materia,calificacion1,calificacion2,prom,"Prom:",prom);
                
                if (promtotal>=19){
                cadena = cadena + String.format("%S\tTiene un promedio de Sobresaliente",nombre);
                    
                }
                if (promtotal>=16 && promtotal<19){
                cadena = cadena + String.format("%S\tTiene un promedio de Muy Buneo",nombre);
                    
                }
                if (promtotal>=13 && promtotal<16){
                cadena = cadena + String.format("%S\tTiene un promedio de Bueno",nombre);
                    
                }
                if (promtotal<=13){
                cadena = cadena + String.format("%S\tTiene un promedio de Regular",nombre);
                    
                }
            
            
            
        }
        System.out.printf("%s",cadena);
        
        
        
        
        
        
        
        
        
        
    }
    
}
