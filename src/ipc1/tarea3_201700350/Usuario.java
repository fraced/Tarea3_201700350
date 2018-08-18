
package ipc1.tarea3_201700350;

import java.util.Scanner;


public class Usuario {
    
  int i;
    String vector[]= new String[5];
    String capturar;
    Scanner scanner = new Scanner(System.in);
    
public void ingresarUsuario(){
   
    
        
    for(i=0;i<vector.length;i++){
        System.out.println("Ingrese Usuario");
        capturar = scanner.next();
        vector[i]=capturar;  
    }  

}        
public void imprimirAscedente(){
    
    for(i=vector.length-1;i>=0;i--){
        
        System.out.println(i+"=["+vector[i]+"]");
    }
    
    
}
public void imprimirDescendente(){
    
     for(i=0;i<vector.length;i++){
        
        System.out.println(i+"=["+vector[i]+"]");
    }
}
public boolean verificar(String usuarios){
    for(String i: vector){
        if(usuarios==capturar){
            return true;
        }else{
            return false;
        }
    }
      return false;
      
}
    
}
