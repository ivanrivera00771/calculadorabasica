
package javaapplication117;

import java.util.Scanner;


public class JavaApplication117 {

    public static void main(String[] args) {
       // OPERADORES ARITMETICOS
       
       Scanner entrada = new Scanner(System.in);
        System.out.println("INGRESA EL PRIMER NUMERO ");
        float numero1 = entrada.nextFloat();
        System.out.println("INGRESA EL SEGUNDO NUMERO ");
        float numero2 = entrada.nextFloat();
        
        float suma = numero1+numero2;
        float resta = numero1-numero2;
        float mult = numero1 * numero2;
        float div = numero1 / numero2;
        
        
        // modulo con signo de porcentaje, lo que hace es que 
        // divide el numero 1 y numero 2 y le saca el RESIDUO
        float resto= numero1%numero2;
        
        System.out.println("LA SUMA ES           " +suma);
        System.out.println("LA RESTA ES          " +resta);
        System.out.println("LA MULTIPLIACIÓN ES  " +mult);
        System.out.println("LA DIVISION ES       " +div);
        System.out.println("EL RESTO ES          " +resto);
        
        
        
        
        
        
        
        
        
        
      
    }
    
}
