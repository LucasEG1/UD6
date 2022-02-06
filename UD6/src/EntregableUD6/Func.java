package EntregableUD6;

import java.util.Scanner;

public class Func {

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
    public static void mostrarAlquiladas(Pelicula[] pelis) {
        for (int i = 0; i < pelis.length; i++) {
            if (pelis[i].getEsAlquilada() == true) {
                pelis[i].mostrarPelicula();
            }
        }
    }
    public static void mostrarTodas(Pelicula[] pelis) {
        for (int i = 0; i < pelis.length; i++) {
            System.out.print(i + ": ");
            pelis[i].mostrarPelicula();
            System.out.println("");
        }
    }
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
    public static Usuario identificarse(Usuario[] x) {
        System.out.println("···¿Quién eres?···");
        
        for (int i = 0; i < x.length; i++) {
            String s = x[i].getNombre();
            System.out.println(i + ": " + s);
        }
        int opcion = Func.rango(0, x.length);
        
    return x[opcion];
    }
    public static Pelicula elegirPeli(Pelicula[] vp){
        mostrarTodas(vp);
        int opcion = rango(0, vp.length);
        return vp[opcion];
    }
    public static void alquilarPeli(Usuario u, Pelicula p){
        if (u.alquilar(p, u) == true && p.getEsAlquilada()== false){
            u.alquilar(p, u);
            p.setPoseedor(u);
            p.setEsAlquilada(true);
        }
    }
    public static void devolverPeli(Usuario u, Pelicula p){
        if (u.devolverP(p) == true) {
            u.devolverP(p);
            p.setEsAlquilada(false);
            p.setPoseedor(null);
        }
    }
}