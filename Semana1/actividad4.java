/*
 * Programa para hallar el area total y el volumen de un cilindro
 */
package Aplicaciones;

import java.util.Scanner;

/**
 * @author Joselyn Palomino
 */
public class actividad4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double pi , radio , altura , area , volumen ;
        
        pi = 3.1416F;
        
        System.out.println("Ingrese el radio del cilindro en metros: ");
        radio = teclado.nextDouble();
        System.out.println("Ingrese la altura del cilindro en metros: ");
        altura = teclado.nextDouble();
        
        area = 2 * pi * radio *(radio + altura) ;
        volumen = pi * radio * radio * altura;
       
        System.out.println("--------------");
        System.out.println("Ingrese el radio del cilindro en metros: " + radio);
        System.out.println("Ingrese la altura del cilindro en metros: " + altura);
        System.out.println("----Reporte---");
        System.out.println("--------------");
        System.out.println("Radio " + radio);
        System.out.println("Altura " + altura);
        System.out.print("El area total del cilindro es: " + area + " metros cuadrados ");
        System.out.print("El volumen del cilindro es : " + volumen);
    }
}
