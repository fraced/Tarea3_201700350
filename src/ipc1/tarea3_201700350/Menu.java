
package ipc1.tarea3_201700350;

import java.util.Scanner;

public class Menu {
    Usuario usuario = new Usuario();
    ContadorDeDigitosR digitos = new ContadorDeDigitosR();
    OrdenarNumeros ordenar = new OrdenarNumeros();
    Promedio promedio = new Promedio();
    Scanner scanner = new Scanner(System.in);
    String user;
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
                System.out.println(menuNumerosOrd());
                validadorNumerosOrd(scanner.nextInt());
                break;
            case 4:
                
                System.out.println(menuPromedio());
                validadorPromedio(scanner.nextInt());
                break;
            case 5:  
                System.exit(0);
                
                break;
                default:
                System.out.println("Por favor ingrese un numero de 1 a 5");
                System.out.println(menuPrincipal());
                validador(scanner.nextInt());
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
                System.out.println("Por favor ingrese un numero de 1 a 4");
                    System.out.println(menuUsuario());
                    validadorUsuario(scanner.nextInt());

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
                digitos.numBuscar();
               System.out.println(menuNumeros());
               validadorNumeros(scanner.nextInt());
                
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
                System.out.println("Por favor ingrese un numero de 1 a 4");
                    System.out.println(menuNumeros());
                    validadorNumeros(scanner.nextInt());

                break;
        }
        
        
    
}
          private void validadorNumerosOrd(int opcion){
        
       
        switch(opcion){
            case 1:
                ordenar.ingresarNumeros2();
                System.out.println(menuNumerosOrd());
                validadorNumerosOrd(scanner.nextInt());
                
                
                break;
            case 2:
                ordenar.ordenarNumeros();
                System.out.println(menuNumerosOrd());
                validadorNumerosOrd(scanner.nextInt());
                
                break;
            case 3:
                System.out.println(menuPrincipal());
                validador(scanner.nextInt());
               
                break;
           
          
                default:
                System.out.println("Por favor ingrese un numero de 1 a 3");
                    System.out.println(menuNumerosOrd());
                    validadorNumerosOrd(scanner.nextInt());
                break;
        }
        
        
    
}
            private void validadorPromedio(int opcion){
        
        
        switch(opcion){
            case 1:
                
               promedio.ingresarId();
                System.out.println(menuPromedio());
                validadorPromedio(scanner.nextInt());
                
                break;
            case 2:
                promedio.ingresarNotas();
                System.out.println(menuPromedio());
                validadorPromedio(scanner.nextInt());
                
                break;
            case 3:
                promedio.promedio();
                System.out.println(menuPromedio());
                validadorPromedio(scanner.nextInt());
                
                break;
            case 4:
                 promedio.imprimirMatriz();
                System.out.println(menuPromedio());
                validadorPromedio(scanner.nextInt());
                break;
            case 5: 
                System.out.println(menuPrincipal());
                validador(scanner.nextInt());
                break;
                default:
                System.out.println("Por favor ingrese un numero de 1 a 5");
                    System.out.println(menuPromedio());
                    validadorPromedio(scanner.nextInt());

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
     public String menuNumerosOrd(){
        return String.format("[1] Ingresar numero %n" +
                        "[2] Mostrar Ordenados%n" +
                        "[3] Menu Principal%n" +
                        "Seleccionar:");
    }
      public String menuPromedio(){
        return String.format("[1] Ingresar ID%n" +
                        "[2] Ingresar notas %n" +
                        "[3] Calcular Promedio%n" +
                        "[4] Visualizar Tabla%n" +
                        "[5] Menu Principal%n"+
                        "Seleccionar:");
        
    }
    
}
