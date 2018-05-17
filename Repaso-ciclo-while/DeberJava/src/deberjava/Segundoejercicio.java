
package deberjava;
import java.util.Scanner;

public class Segundoejercicio {
    public static void main(String[] args) {
        
        String marca;
        String origen=null;
        double costo=0;
        double impuesto=0;
        double precioventa=0;
        int totalautos=0;
        double totalimpuestos=0;
        double totalprecioventa=0;
        int contador=0;
        int contadori=0;
        int lim=0;
        double imps=0;
        String cadena;
        
        cadena=String.format("%s\t\t%s\t\t%s\t\t%s\t\t%s\n", "Marca", "Origen", "Costo", "Impuesto","Precio Venta");
        
        Scanner entrada = new Scanner(System.in); 
        System.out.println("Ingrese cantidad de autos");
        lim=entrada.nextInt();
        
        entrada.nextLine();
        
       
        while(contador<lim){
            System.out.println("Ingrese marca del auto");
            marca=entrada.nextLine();
            System.out.println("Ingrese el origen del auto");
            origen=entrada.nextLine();
            System.out.println("Ingrese costo del auto");
            costo=entrada.nextDouble();
            
            if(origen.equals("argentina")){
                impuesto=costo*0.20;
                contadori=contadori+1;
            }
            if(origen.equals("colombia")){
                impuesto=costo*0.25;
                contadori=contadori+1;
            }
            if(origen.equals("chile")){
                impuesto=costo*0.30;
                contadori=contadori+1;
            }
            else{
                impuesto=costo*0.40;
                contadori=contadori+1;
            }
            
            precioventa=costo+impuesto;
            
            
            
           cadena=cadena+String.format("%s\t\t%s\t\t%f\t%f\t\t%f\n",marca,origen,costo,impuesto,precioventa);
           entrada.nextLine();
           
        
            contador=contador+1;
        }
    
        
        totalprecioventa=totalprecioventa+precioventa;
        imps=imps+impuesto;
        totalimpuestos=totalimpuestos+imps;
            
        System.out.println("Reporte de Autos Importados");
        System.out.printf("%s",cadena);
        System.out.printf("Total Autos:%d\t\t",lim);
        System.out.printf("Tot.Imps:%f\t\t\t",totalimpuestos);   
        System.out.printf("Tot.PV:%f\t\t\t\t\t\t\t\n",totalprecioventa);
        System.out.printf("%s\t\t\t",origen);
        System.out.printf("%d",contadori);
            
    }
}
    
