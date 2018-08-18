
package ipc1.tarea3_201700350;

import java.util.Scanner;

public class Menu {
    Usuario usuario = new Usuario();
    ContadorDeDigitosR digitos = new ContadorDeDigitosR();
    Scanner scanner = new Scanner(System.in);
    
    int opcion=0;
    public Menu(){
    
    System.out.println(menuPrincipal());
    validador(scanner.nextInt());
    
    }
    
    
    
    private void validador(int opcion){
        //Scanner scanner = new Scanner(System.in);
        
        switch(opcion){
            case 1:
                
                System.out.println(menuUsuario());
                validadorUsuario(scanner.nextInt());
                
                break;
            case 2:
                System.out.println(menuNumeros());
                validadorNumeros(scanner.nextInt());
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:  
                break;
                default:


                break;
        }
        
        
    
}
     private void validadorUsuario(int opcion){
        
       // Scanner scanner = new Scanner(System.in);
        switch(opcion){
            case 1:
                usuario.ingresarUsuario();
               
                
                
                System.out.println(menuUsuario());
                validadorUsuario(scanner.nextInt());
                break;
            case 2:
                usuario.imprimirAscedente();
                System.out.println(menuUsuario());
                validadorUsuario(scanner.nextInt());
                
                break;
            case 3:
                
                usuario.imprimirDescendente();
                System.out.println(menuUsuario());
                validadorUsuario(scanner.nextInt());
                break;
            case 4:
                System.out.println(menuPrincipal());
                validador(scanner.nextInt());
                break;
          
                default:


                break;
        }
        
        
    
}
     private void validadorNumeros(int opcion){
        
       
        switch(opcion){
            case 1:
                digitos.ingreseNumero();
                System.out.println(menuNumeros());
                validadorNumeros(scanner.nextInt());
                break;
            case 2:
               
                
                break;
            case 3:
                digitos.contadorDigitos();
                digitos.cDigitos();
                System.out.println(menuNumeros());
                validadorNumeros(scanner.nextInt());
               
                break;
            case 4:
                System.out.println(menuPrincipal());
                validador(scanner.nextInt());
                break;
          
                default:


                break;
        }
        
        
    
}
     
    
    
    public String menuPrincipal(){
        return String.format("[1] Usuario %n" +
                        "[2] Contador de Digitos %n" +
                        "[3] Tres numeros de mayor a menor%n" +
                        "[4] Calcular Promedio%n" +
                        "[5] Salir%n"+
                        "Seleccionar:");
        
    }
    public String menuUsuario(){
        return String.format("[1] Ingresar Usuario %n" +
                        "[2] Mostrar Usuario ascedente %n" +
                        "[3] Mostrar Usuario descedente%n" +
                        "[4] Menu Principal%n" +
                        "Seleccionar:");
    }
     public String menuNumeros(){
        return String.format("[1] Ingresar numero %n" +
                        "[2] Ingresar numero a buscar %n" +
                        "[3] Mostrar numero de digitos%n" +
                        "[4] Menu Principal%n" +
                        "Seleccionar:");
    }
    
}
