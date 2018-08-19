
package ipc1.tarea3_201700350;

import java.util.Scanner;


public class Promedio {
    int i,j;
    int matriz [][]= new int[6][6];
    Scanner scanner = new Scanner(System.in);
    int id;
    int notas;
    int prom;        
    
    public void ingresarId(){
            for(i=0;i<6;i++){
                
                System.out.println("ingresar usuario " +(i+1));
                    id=scanner.nextInt();
                    matriz[i][0]=id;
                
            }

    } 
    public void ingresarNotas(){
        
        for(i=0;i<6;i++){
                for(j=1;j<5;j++){
                     System.out.println("Ingresar notas " +(i+1)+"."+j);
                    notas=scanner.nextInt();
                    matriz[i][j]=notas;
                }
            }
        
    }
    public void promedio(){
        for(i=0;i<6;i++){
            prom=0;
                for(j=1;j<5;j++){
                 prom += (matriz[i][j]);
                 
                }
                matriz[i][5]= prom/4;
            }
        System.out.println("Se ha calculado el promedio");
        
    }
    public void imprimirMatriz(){
        for(i=0;i<matriz.length;i++){
                for(j=0;j<matriz.length;j++){
                    System.out.print(matriz[i][j]+"  -  ");
                }
               System.out.println();
            }
       
        
    }
}
