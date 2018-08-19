
package ipc1.tarea3_201700350;

import java.util.Scanner;

public class ContadorDeDigitosR {
   
    Scanner scanner = new Scanner(System.in);
    int numingresado;
    int racional;
    int cantidad;
    int contador;
    

//utilice este link de apoyo para realizar metodo contador de Digitos https://www.youtube.com/watch?v=g4gZ0MHamvA&t=19s
   ContadorDeDigitosR(){

       racional=10;
       cantidad=0;
       contador=0;
       
    }
    
    public void ingreseNumero(){
        
        //for(i=0;i<vector.length;i++){
        System.out.println("Ingrese Numero");
        numingresado = scanner.nextInt();
        //vector[i]=numingresado;
        
    //} 
    
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
                 +"\t"+contador);
    }
    public void numBuscar(){
        int i;
        char[] cad = String.valueOf(numingresado).toCharArray();
        int contador2 = 0;
        Scanner scanner2 = new Scanner(System.in);
        String buscar;
        char buscar2;
        
        System.out.println("Ingresar valor de 0 a 9");
        buscar = String.valueOf(scanner.nextInt());
        buscar2 = buscar.charAt(0); //Posicion 0 del String buscar
        
        for(i=0;i<cad.length;i++){
            if(buscar2==(cad[i])){
                contador2++;
            }
              
        }
        System.out.println("La cantidad de veces que se repite "+ buscar + "son " + contador2);
    
        
    }
}
