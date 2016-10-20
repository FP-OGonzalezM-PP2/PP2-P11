/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp2.p11;
import java.util.*;
/**
 *
 * @author Osvaldo
 */
public class PP2P11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String [] numeroRomanos = {"I","IV","V","IX","X","XL","L","XC","C","CD","D","CM","M"}; 
        int [] numeros = {1,4,5,9,10,40,50,90,100,400,500,900,1000};
        int n;
        String nR;
        n = pedirNumero();
        nR = conversion(numeros,numeroRomanos,n);
        Mostrar(nR);
    }
    public static int pedirNumero(){
        int n;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escriba un el número que quiera convertir a romano ");
        System.out.println("El número debe ser menor de 3999");
        n = entrada.nextInt();
        return n; 
    }
    public static String conversion (int []numeros, String [] numerosRomanos, int n){
        String nR = "";
        int j=0,m=0;
        {                                         
            for (int i=numerosRomanos.length-1; i>=0; --i) 
            {                                        
                j = n / numeros[i];                  
                while (m > 0)                  
                {                                    
                    nR = nR + numeros[i];
                    m--;   
                }
                n = n%numeros[i];                    
    }
        }
        return nR;
    }
    public static void Mostrar(String nR){
        System.out.println(nR);
    }
}
