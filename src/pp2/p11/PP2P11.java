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
        //El primer arreglo va a contener todas las letras posibles de los numeros Romanos
        String [] numeroRomanos = {"I","IV","V","IX","X","XL","L","XC","C","CD","D","CM","M"}; 
        //En el segundo arreglo estaran todas las equivalencias de las combinaciones de los numeros Romanos
        int [] numeros = {1,4,5,9,10,40,50,90,100,400,500,900,1000};
        int n;
        String nR;
        n = pedirNumero();
        nR = conversion(n,numeros,numeroRomanos);
        Mostrar(nR);
    }
    public static int pedirNumero(){
        int n;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escriba un el número que quiera convertir a romano ");
        System.out.println("--------------------------------------------------");
        //Le digo al usuario que solo use un numero del 1 al 3999 porque no hay caracteres en el teclado para 4000 y los siguientes
        System.out.println("El número debe ser menor de 3999");
        n = entrada.nextInt();
        return n; 
    }
    public static String conversion (int n, int[] numeros, String[] numerosRomanos){
        String nR="";   
        int j = 0,i=0;                                       
            for (i=numeros.length-1; i>=0; --i){
                //Si el numero es menor que el valor de la casilla del arreglo de los numeros no entraran en el if
                j= n / numeros[i];                  
                if (j > 0){ 
                    //Cuando entre en el if, se ira repitiendo hasta que sea 0 y se repetiran las letras romanas
                    nR = nR + numerosRomanos[i];
                    j--;                        
                }
                //Ya que dividimos el numero, seguimos ocupando el residuo para analizarlo
                n = n%numeros[i];   
            }
        return nR;  
    }

    public static void Mostrar(String nR){
        //Resive el string en letras romanas
        System.out.println(nR);
    }
}

