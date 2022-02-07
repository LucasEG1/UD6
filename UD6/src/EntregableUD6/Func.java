package EntregableUD6;

import java.util.Scanner;

public class Func {

    //Pide un número entre MIN y MAX y lo devuelve. Pide hasta que sea valido.
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
    
    //Muestra el menú, pide una de las opciones y devuelve el número de opción.
    public static int menu() {
        Scanner in = new Scanner(System.in);
        System.out.println("==|¿QUÉ QUIERES HACER?|==");
        System.out.println("1. Ver todas las películas");
        System.out.println("2. Alquilar una película");
        System.out.println("3. Devolver una película");
        System.out.println("4. Ver quién tiene cada película");
        System.out.println("5. Ver mi biblioteca");
        System.out.println("6. Suscribirse");
        System.out.println("7. Cancelar suscripcion.");
        System.out.println("8. Cambiar de usuario.");
        System.out.println("9. Salir del programa.");
        int eleccion = rango(1, 9);
        return eleccion;
    }
    
    //Muestra sólo aquellas películas que estén alquiladas.
    /*public static void mostrarAlquiladas(Pelicula[] pelis) {
        for (int i = 0; i < pelis.length; i++) {
            if (pelis[i].getEsAlquilada() == true) {
                pelis[i].mostrarPelicula();
            }
        }
    }*/
    
    //Muestra la información de cada película.
    public static void mostrarTodas(Pelicula[] pelis) {
        for (int i = 0; i < pelis.length; i++) {
            System.out.print(i + ": ");
            pelis[i].mostrarPelicula();
            System.out.println("");
        }
    }
    
    //Muestra el propietario de cada película. Si no tiene propietario imprime ¡Sin alquilar!
    public static void mostrarPropiedad(Pelicula[] pelis){
        
        for (int i = 0; i < pelis.length; i++) {
            pelis[i].getTitulo();
            if (pelis[i].getEsAlquilada() == true) {
                Usuario p = pelis[i].getPoseedor();
                System.out.println(i + ": " + p.getNombre());
            } else {
                System.out.println(i + ": ¡Sin alquilar!");
            }
        }
    }
    
    //Pide elegir el usuario que se va a usar
    public static Usuario identificarse(Usuario[] x) {
        System.out.println("···¿Quién eres?···");
        
        for (int i = 0; i < x.length; i++) {
            String s = x[i].getNombre();
            System.out.println(i + ": " + s);
        }
        int opcion = Func.rango(0, x.length);
        
    return x[opcion];
    }
    
    //Muestra todas las películas, luego pide el número de película elegida
    public static Pelicula elegirPeli(Pelicula[] vp){
        mostrarTodas(vp);
        int opcion = rango(0, vp.length);
        return vp[opcion];
    }
    
    //Si es posible alquilar, asigna una peli a un usuario.
    public static void alquilarPeli(Usuario u, Pelicula p){
        if (u.alquilar(p, u) == true && p.getEsAlquilada()== false){
            p.setPoseedor(u);
            p.setEsAlquilada(true);
        }
    }
    
    //Si es posible, devuelve la película elegida al videoclub.
    public static void devolverPeli(Usuario u, Pelicula p){
        if (u.devolverP(p) == true) {
            p.setEsAlquilada(false);
            p.setPoseedor(null);
        }
    }
}