/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author camila
 */
public class SumArray_ {
    public static void main(String[] args){
        int[] a = new int [6];
        int[] b = new int [6];
        int[] c = new int [6];
        
        for (int i=0; i < 6 ; i++){
            a[i]=(int)(Math.random()*50);
            b[i]=(int)(Math.random()*50);
            
        }
        
        System.out.print("First Array");
        for (int i=0 ; i < 6 ; i++){
            System.out.print("["+a[i]+"]");
    }
        System.out.print("\nSecond Array");
                for (int i=0 ; i < 6 ; i++){
            System.out.print("["+b[i]+"]");
    }
                
        for ( int i=0 ; i < 6 ; i++ ){
            c[i]= a[i]+b[i];
        }
        
        System.out.print("\nArray sum result");
        for (int i=0; i < 6 ; i++){
            System.out.print("["+c[i]+"]");
        }
    
    
}
