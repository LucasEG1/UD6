package EntregableUD6;

import java.util.Scanner;

public class Videoclub {

    private static Pelicula[] peliculas = new Pelicula[15];
    private static Usuario[] usuarios = new Usuario[5];
    
    public static void main(String[] args) {
    
    usuarios[0] = new Usuario("Mario", "mario@daw.com");
    usuarios[1] = new Usuario("Lucas", "lucas@daw.com");
    usuarios[2] = new Usuario("Lionel", "lionel@daw.com");
    usuarios[3] = new Usuario("Juan", "juan@daw.com");
    usuarios[4] = new Usuario("Fani", "fani@daw.com");

    peliculas[0] = new Pelicula(Pelicula.eGenero.Accion, "Spider-Man", "2002", "A peter parker lo pica una araña \ny se convierte en héroe.");
    peliculas[1] = new Pelicula(Pelicula.eGenero.Aventuras, "Indiana Jones", "1981", "Un profesor se mete de lleno en aventuras de catacumbas y\n tesoros antiguos");
    peliculas[2] = new Pelicula(Pelicula.eGenero.Drama, "007 Casino Royale", "2006", "007, conocido como James Bond enfrenta a un villano en un\n nuevo ambito, el poker, aqui 007 demostrara que tiene algo mas que punteria");
    peliculas[3] = new Pelicula(Pelicula.eGenero.Aventuras, "Jumanji", "2017", "Cuatro adolescentes se transportan desde un juego maldito a\n un mundo muy parecido, en el que viviran aventuras muy peligrosas");
    peliculas[4] = new Pelicula(Pelicula.eGenero.CienciaFiccion, "Akira", "1988", "Un Tokyo futurista se ve en peligro en media crisis del pais\n por un esperimento del gobierno que ha salido mal, un grupo de adolescentes \ntendra que pelear por lo que queda de su ciudad");
    peliculas[5] = new Pelicula(Pelicula.eGenero.Comedia, "Niños Grandes", "2010", "Una estrella de Hollywood vuelve a su ciudad natal para tomar\n un descanso pero al reencontrarse con sus amigos de toda la vida sus planes \ncambiaran");
    peliculas[6] = new Pelicula(Pelicula.eGenero.Horror, "Soy Leyenda", "2007", "Un supervivinete a una enfermedad zombi luchara con armas y\n ciencia a esta infeccion mostrando tanto su humanida como su valor");
    peliculas[7] = new Pelicula(Pelicula.eGenero.Drama, "Un don excepcional", "2017", "Un padre pelea porque su hija superdotada tenga una infancia\n comun, pero sera mas dificl de lo que penso");
    peliculas[8] = new Pelicula(Pelicula.eGenero.Comedia, "Megamind", "2010", "Un villano vence al heroe de la ciudad y se proclama como\n vencedor, hasta que se da cuenta de que su verdadera victoria estaba por llegar");
    peliculas[9] = new Pelicula(Pelicula.eGenero.Drama, "La milla verde", "1999", "Un prisionero llega a una carcel de USA en la con su don\n cambiara tanto el ambiente dl lugar como a las personas del lugar");
    peliculas[10] = new Pelicula(Pelicula.eGenero.CienciaFiccion, "Ghost in the shell", "1995","En un japon futurista varios policias luchan por el orden\n en las calles en las que nuestra protagonista vera que hasta lo que le queda de \nhumanidad lucha a su lado");
    peliculas[11] = new Pelicula(Pelicula.eGenero.Aventuras, "Dredd", "2012", "En un mundo futurista la sobrepoblacion y caos se adueñan de\n las calles, lo que hace que la justicia se imparta por los jueces, personas que \nhacen tanto como policia y a su vez como verdugo");
    peliculas[12] = new Pelicula(Pelicula.eGenero.Comedia, "El lobo de Wall Sreet","2013","un hombre común que comenzó vendiendo helados a los dieciséis\n años y terminó por ganando cientos de millones de dólares. Luego la ley lo \ndescubre y tiene que soportar el peso de la justicia");
    peliculas[13] = new Pelicula(Pelicula.eGenero.Accion, "Jungla de Cristal", "1988", "Un policia inactivo se ve envuelto en un ataque terrorista en\n el que demostrara sus dotes como policia y marido");
    peliculas[14] = new Pelicula(Pelicula.eGenero.Drama, "Club de la lucha", "1999" , "1º Regla del club de lucha, no se habla sobre el club de la lucha");

        
        /**
         *AQUI EMPIEZA EL PROGRAMA
         */
        
        Usuario usuarioActual = Func.identificarse(usuarios);
        
        int opcion;
        do {
            
            opcion = Func.menu();
            switch (opcion) {
                case 1:
                    System.out.println("==VER TODAS LAS PELÍCULAS==");
                    Func.mostrarTodas(peliculas);
                    break;
                case 2:
                    System.out.println("==ALQUILAR UNA PELÍCULA==");
                    Pelicula alquilar = Func.elegirPeli(peliculas);
                    Func.alquilarPeli(usuarioActual, alquilar);
                    break;
                case 3:
                    System.out.println("==DEVOLVER UNA PELÍCULA==");
                    Pelicula devolver = Func.elegirPeli(peliculas);
                    Func.devolverPeli(usuarioActual, devolver);
                    break;
                case 4:
                    System.out.println("==VER QUIÉN TIENE CADA PELÍCULA==");
                    Func.mostrarPropiedad(peliculas);
                    break;
                case 5:
                    System.out.println("==VER MI BIBLIOTECA==");
                    usuarioActual.verBiblioteca();
                    break;
                case 6:
                    System.out.println("==SUSCRIBIRSE==");
                    usuarioActual.suscribirse();
                    System.out.println("\n");
                    break;
                case 7:
                    System.out.println("==ANULAR SUSCRIPCIÓN==");
                    usuarioActual.anularSuscrip();
                    break;
                case 8:
                    usuarioActual = Func.identificarse(usuarios);
                    break;
                case 9:
                    System.out.println("¡Eso es to.. eso es to.. eso es todo amigos!");
                    break;
            }
            
        } while (opcion != 9);
        
    }
}