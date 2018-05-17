package deberjava;

import java.util.Scanner;

public class DeberJava {

    public static void main(String[] args) {

        String nombre;
        String articulo = null;
        int contador = 0;
        int cantidad = 0;
        double preciounitario = 0;
        double subtotal = 0;
        double subtotal1=0;
        double preciototal = 0;
        double iva = 0;
        double total;
        String cadena;
        boolean condicion = true;
       

        cadena = String.format("%s\t%s\t%s\t\t%s\n", "Articulos", "Cantidad", "Precio Unitario", "Precio Total");
        Scanner entrada = new Scanner(System.in); 
        System.out.println("Ingrese Nombre");
        nombre = entrada.nextLine();
        while (condicion) {
            System.out.printf("Ingrese nombre de articulo\n");
            articulo = entrada.nextLine();
            System.out.printf("Ingrese cantidad de %s\n", articulo);
            cantidad = entrada.nextInt();
            System.out.printf("Ingrese el valor de cada %s\n", articulo);
            preciounitario = entrada.nextDouble();

            preciototal = preciounitario * cantidad;
            subtotal = subtotal + preciototal;
            subtotal1 = subtotal1 + preciototal;

            cadena=cadena + String.format("%s\t\t%d\t\t%f\t\t%f\n", articulo, cantidad, preciounitario, preciototal);

            entrada.nextLine();

            System.out.println("Escriba si para salir del ingreso de datos");
            String condicion2 = entrada.nextLine();
            if (condicion2.equals("si")) {
                condicion = false;
            }
        }
        iva = subtotal1 * 0.14;
        total=subtotal1+iva;
        System.out.printf("Factura\nSupermercado Todo a menor precio\n");
        
        System.out.printf("Nombre del Cliente:%s\n",nombre);
        System.out.printf("%s",cadena);
        System.out.printf("\t\t\t\t%s", "Subtotal");
        System.out.printf("\t\t%f\n", subtotal1);
        System.out.printf("\t\t\t\t%s","Iva 14%");
        System.out.printf("\t\t\t%f\n",iva);
        System.out.printf("\t\t\t\t%s","Total");
        System.out.printf("\t\t\t%f",total);
        

    }

}
