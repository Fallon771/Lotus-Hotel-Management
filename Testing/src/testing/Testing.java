/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testing;

/**
 *
 * @author jim
 * 
 * 
 */
public class Testing {

   public static int fac(int n){
       
    if(n  == 1){
    return 1;
    }
    else{
    return n * fac(n -1);
    }
   }
    public static void main(String[] args) {
       int answer = fac(15);
       System.out.print("\nFactorial:"+ answer);
    }
    
}
