
package celulares;
import java.util.Scanner;

/**
 *
 * @author Edison Gaibor
 */
public class Celulares {


    public static void main(String[] args) {
        
        String nombre;
        String apellido;
        
        double precio=0;
        int cantidad=0;
        int tipocliente=0;
        double descuento=0;
        double subtotal=0;
        double total=0;
        
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese su nombre porfavor");
        nombre=leer.nextLine();
        System.out.println("Ingrese su apellido porfavor");
        apellido=leer.nextLine();
        System.out.println("Ingrese el costo del telefono deseado");
        precio=leer.nextInt();
        System.out.println("Cuantos telefonos desea comprar?");
        cantidad=leer.nextInt();
        System.out.println("Ingrese tipo de cliente");
        tipocliente=leer.nextInt();
        
        subtotal=cantidad*precio;
        
        if(tipocliente==1){
            descuento=subtotal*0.10;
        }
        if(tipocliente==2){
            descuento=subtotal*0.20;
        }
        if (tipocliente==3){
            descuento=subtotal*0.30;
        }
        total=subtotal-descuento;
        System.out.println("Su nombre es:"+nombre );
        System.out.println("Su apellido es:"+apellido);
        System.out.println("Usted es clieente tipo:"+tipocliente);
        System.out.println("Cantidad de telefonos comprados:"+cantidad);
        System.out.println("El precio de cada telefono es de:"+precio);
        System.out.println("El subtotal a pagar sin su descuento es de:"+subtotal);
        System.out.println("Descuento:"+descuento);
        System.out.println("El valor total es de:"+total);
    }
    
}
