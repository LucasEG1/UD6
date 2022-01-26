
package CasoPractico;

import java.util.Scanner;

public class Func {

    public static int menu() {

        System.out.println("1. Ver contactos");
        System.out.println("2. Agregar contacto.");
        System.out.println("3. Eliminar contacto.");
        System.out.println("4. Buscar por nombre.");
        System.out.println("5. Salir.");
        System.out.print("¿Opción? :");
        
        int opcion = rango(1, 5);

        return opcion;
    }
    public static int rango(int min, int max) {

        Scanner in = new Scanner(System.in);
        int valor;

        do {
            valor = in.nextInt();
            if (valor < min || valor > max) {
                System.err.println("Entrada inválida. Introduce un número entre " + min + " y " + max);
            }
        } while (valor < min || valor > max);

        return valor;
    }
    public static Contacto crearContacto(){
        Scanner leer = new Scanner(System.in);
        
        System.out.print("¿Nombre? ");
        String n = leer.nextLine();
        
        System.out.print("¿Teléfono? ");
        String t = leer.nextLine();
        
        System.out.print("¿Correo? ");
        String c = leer.nextLine();

        Contacto con = new Contacto(n, t, c);
        return con;
    }
    public static int eliminarContacto(){
        System.out.println("Introduce la posición del contacto a eliminar");
        return pidePosContacto();
    }
    public static int pidePosContacto(){
        
        Scanner leer = new Scanner(System.in);
        int pos = leer.nextInt();
        return pos;
    }
    public static String pedirString() {
        Scanner in = new Scanner(System.in);
        return in.nextLine();
    }
}
