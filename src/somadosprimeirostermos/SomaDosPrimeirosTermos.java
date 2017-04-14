
package somadosprimeirostermos;

import java.util.Scanner;


public class SomaDosPrimeirosTermos {

   
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
       double soma = 0;
       double n= 1 ;
             for (int i = 0; i <= 10000; i++) {
                 soma = soma +1/n;
    n = n+2;
    
             }
             System.out.println("Soma: " +soma );
    
             
}
    }
