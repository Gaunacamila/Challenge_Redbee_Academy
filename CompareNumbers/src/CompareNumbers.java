/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author camila
 */
import java.util.Scanner;
//Importar libreria Scanner
public class CompareNumbers {
    public static void main (String[] args){
        
        Scanner obj = new Scanner(System.in);
        //Crear constructor
        
        int n1 , n2 , n3;
        //Declarar tres variables
        
        System.out.print("Primer numero ");
        n1 = obj.nextInt();
        //Recibimos datos enteros
        
        System.out.print("Primer segundo ");
        n2 = obj.nextInt();
        
        System.out.print("Primer tercer ");
        n3 = obj.nextInt();
        
                
        if (n1 == n2 && n2 == n3){
            //Escribo la sentencia comparando
            System.out.print("All number Same");
        }else if  (n1 > n2 && n1 > n3){
            //Escribo la sentencia comparando
            System.out.print("El numero mayor es "+ n1); 
        }else if  (n2 == n1 && n2 == n2){
            //Escribo la sentencia comparando 
            System.out.print("El numero mayor es 3"+ n2);
           
        }else {
            System.out.print("El numero mayor es "+n3);
        }
}
    
    
}
