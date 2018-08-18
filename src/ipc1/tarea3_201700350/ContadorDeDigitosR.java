
package ipc1.tarea3_201700350;

import java.util.Scanner;

public class ContadorDeDigitosR {
    int i;
    int vector []= new int[1];
    Scanner scanner = new Scanner(System.in);
    int numingresado;
    
    int racional;
    int cantidad;
    int contador;
    


   ContadorDeDigitosR(){

       racional=10;
       cantidad=0;
       contador=0;
       
    }
    
    public void ingreseNumero(){
        
        for(i=0;i<vector.length;i++){
        System.out.println("Ingrese Numero");
        numingresado = scanner.nextInt();
        vector[i]=numingresado;  
    }  
    
}
    public int contadorDigitos(){

       do{
           cantidad = numingresado/racional;
           contador++;
           racional = racional*10;

       }while(cantidad>=1);

       return contador;
       }
    public void cDigitos(){
         System.out.println("La Cantidad de digitos son" 
                 +"\t"+Integer.valueOf(contador));
    }
    public void numBuscar(){
        
    }
}
