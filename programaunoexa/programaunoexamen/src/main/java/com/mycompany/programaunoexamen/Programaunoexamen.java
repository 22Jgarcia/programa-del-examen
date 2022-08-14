
package com.mycompany.programaunoexamen;

/**
 *
 * @author Georg
 */
import java.util.Scanner;
public class Programaunoexamen {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    //aca declaramos nuestra variable
    int numeromaximo;
    //aca pide que ingrese un numero
    System.out.println("Calcular si es mayor a 100: ");
    numeromaximo = sc.nextInt();
    //se evalua si el numero que ingresamos es mayor o menor 
   if(numeromaximo >100 ){
       //nosda el mensaje que si es mayor nuestro numero ingresado.
     System.out.println("si es mayor a 100: ");    
   }else{
       //nosda el mensja que es menor el numero ingresado 
    System.out.println("No es mayor a 100: ");    
   } 
       
  }
}

