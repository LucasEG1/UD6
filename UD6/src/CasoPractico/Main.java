
package CasoPractico;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        Agenda ag = new Agenda(100);
        
        int opcion;
        
        do {
            opcion = Func.menu();
            leer.nextLine();
            switch(opcion) {
                case 1:
                    System.out.println("==|VER CONTACTOS|==");
                    ag.imprimirTodos();
                    System.out.println("");
                    break;
                    
                case 2:
                    System.out.println("==|AGREGAR CONTACTO|==");
                    ag.agregarContacto(Func.crearContacto());
                    System.out.println("");
                    break;
                    
                case 3: 
                    System.out.println("==|ELIMINAR CONTACTO|==");
                    ag.eliminarContacto(Func.eliminarContacto());
                    System.out.println("");
                    break;
                
                case 4: 
                    System.out.println("==|BUSCAR POR NOMBRE|==");
                    Agenda busqueda = ag.buscarNombre(Func.pedirString());
                    busqueda.imprimirTodos();
                    
                    System.out.println("");
                    break;
                case 5:
                    System.out.println("¡Hasta pronto!");
                    break;
            }
            
        } while (opcion != 5);
    }
}
