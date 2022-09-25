/**
 * @author DAW120
   📌 EJERCICIO 7, Hoja 2.   
  
   🔴 Programa que asigna los valores sin pedirlos por pantalla a una variable 
      a el valor 23 y a otra variable b el valor 56. 
      
   🔴 Intercambiar el valor de dichas variables y mostrar por pantalla el valor 
     que tenían antes y después del intercambio.
 */
package com.solomongo.ejercicio7_hoja2;
public class Ejercicio7_Hoja2 {
    public static void main(String[] args) {
        
    int a=23, b =56;  // declaracion de variables, con valores asignados.
    int a2=b, b2=a;  // aqui se declaran nuevas variables y se reasignan los 
                     // valores cambiados de las anteriores variables.
    
       //SALIDA:
        System.out.println("\n\tValor de a (asignado): "+a);
         System.out.println("\tValor de b (asignado): "+b);
          System.out.println("\tValor de a (cambiado): "+a2);
           System.out.println("\tValor de b (cambiado): "+b2+"\n");
    }
}
