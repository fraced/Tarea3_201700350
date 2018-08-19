
package ipc1.tarea3_201700350;

import java.util.Scanner;


public class OrdenarNumeros {
    int i,j;
    int numeroingresado;
    int vector []= new int[3];
    int numero2;
    boolean verificar = false;
    Scanner scanner = new Scanner(System.in);
   
    public void ingresarNumeros2(){
        for(i=0;i<vector.length;i++){
            System.out.println("Ingrese Numero");
            try {                                   //validacion para que solo se ingrese numeros
                
               numeroingresado= Integer.parseInt(scanner.nextLine());
                verificar = true;
            }catch(Exception e){
                
                
                verificar = false;
                
            }
            while(verificar==false){
                System.out.println("Solo se aceptan numeros");
                System.out.println("Ingrese Numero");
  
                
                  try {
                
                numeroingresado= Integer.parseInt(scanner.nextLine());
                verificar = true;
            }catch(Exception e){            
                
                
                verificar = false;
                
            }
                
            }                           //final de la validacion
              
            vector[i]=numeroingresado;
        }
    }
    //Utilice este link como ayuda para este metodo https://www.youtube.com/watch?v=-XjlHxKsRa0
    public void ordenarNumeros(){
        for(i=0;i<vector.length;i++){
            for(j=i+1;j<vector.length;j++){
               if(vector[i]<vector[j]) {
                   numero2=vector[i];
                   vector[i]=vector[j];
                   vector[j]=numero2;
               }
            }
        }
        for(i=0;i<vector.length;i++){
            System.out.println("{"+vector[i]+"}");
        }
    }
}
