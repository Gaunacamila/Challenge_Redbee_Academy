
/**
 *
 * @author camila
 * 
 * CHALLENGE CompareArrayNumbers
 */
import java.util.Scanner;

public class CompareArrayNumbers {
    
   public static void main(String[] arga){ 
    
    Scanner keyboard = new Scanner (System.in);
    //Crear objeto que me permite ingresar datos por teclado
    
    System.out.print("Porfavor ingrese el tamaño del Array para comparar: " );
    //Solicito los datos
    int n = keyboard.nextInt();
    //Capturo los datos
    int array[] = new int [n];
    //Declaro el array de tipo entero
    
    for (int i = 0; i< array.length; i++ ){
        System.out.print("Ingrese dato" + (i+1)+": ");
        array [i] = keyboard.nextInt();
    //Esta interacción se realiza hasta llegar al tamaño del array y obtener la información necesaria.
        
}
    int mayor,menor;
    //Declaro variables de tipo entero
    
    mayor = menor = array[0];
    
    for (int i = 0; i< array.length; i++ ){
        if(array[i] > mayor){
            mayor = array[i];
        }
        //Cuando entra al for se compara los datos con la variable mayor.
         
        if(array[i]<menor){
            menor = array[i];
        }
   }
    System.out.print(" El mayor valor es : "+mayor);
    System.out.print(" El menor valor es : "+menor);
    
   //imprime 
    }
}

