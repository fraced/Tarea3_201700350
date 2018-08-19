
package ipc1.tarea3_201700350;

import java.util.Scanner;


public class Usuario {
    
    int i,j;
    String vector[]= new String[5];
    String capturar;
    Scanner scanner = new Scanner(System.in);
    
public void ingresarUsuario(){
   
    boolean res;
    res = false;  
   
    for(i=0;i<vector.length;i++){
        
        System.out.println("Ingrese Usuario");
        capturar = scanner.next();
        res=false;
        
        while(res==false){
         
        if(i==0){
            res=true;
        }else{
            
           for(j=0;j<i;j++){
            if(capturar.equalsIgnoreCase(vector[j])){
                res=false;
                System.out.println("Usuario ya existente, ingrese otro");
                capturar = scanner.next();
                break;
            }res=true;  
           }
        }
        
        };
       
        vector[i]=capturar; 
        
        
    }  

}        
public void imprimirAscedente(){
    
    for(i=vector.length-1;i>=0;i--){
        
        System.out.println((i+1)+"=["+vector[i]+"]");
    }
    
    
}
public void imprimirDescendente(){
    
     for(i=0;i<vector.length;i++){
        
        System.out.println((i+1)+"=["+vector[i]+"]");
    }
}
public boolean verificar(String usuarios){
    boolean res = false;
    for(String i: vector){
        if(usuarios==capturar){
            return true;
        }else{
            return false;
        }
    }
      return res;
      
}
    
}
