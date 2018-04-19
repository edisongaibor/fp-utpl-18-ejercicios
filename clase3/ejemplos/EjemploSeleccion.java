/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*crear un programa que permita ingresar una calificacion por teclado
Si la calificaion ingresada es mayor o igual a 5 y la calificacion es menor a 10,
se debe presentar un mensaje que diga usted esta en supletorios, de lo contrario
se presenta un mensaje con el valor de la calificacion dividido para 2*/
package ejemplos;

import java.util.Scanner;

/**
 *
 * @author Edison Gaibor
 */
public class EjemploSeleccion {
    public static void main(String[] args) {
     Scanner entrada = new Scanner(System.in);
     double calificacion;
     System.out.println("Ingrese su calificacion");
     calificacion=entrada.nextDouble();
     //en python se usa "and"
     if(calificacion>= 5 && calificacion<10){
         System.out.printf("Usted esta en supletorio");
     }else{
         //System.out.printf("%d,calificacion/2");
         double resultado=calificacion/2;
                 System.out.printf("%f",resultado);
         }
     
    }
}



