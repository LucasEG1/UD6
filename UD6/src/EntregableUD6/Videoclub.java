package EntregableUD6;

public class Videoclub {

    private static Pelicula[] peliculas = new Pelicula[15];
    private static Usuario[] usuarios;
    
    public void mostrarAlquiladas() {
        for (int i = 0; i < peliculas.length; i++) {
            if (peliculas[i].getEsAlquilada() == true){
                peliculas[i].mostrarPelicula();
            }
        }
    }
    public void mostrarTodas() {
        for (int i = 0; i < peliculas.length; i++) {
            peliculas[i].mostrarPelicula();
            
        }
    }
    
    
    public static void main(String[] args) {
        usuarios[0] = new Usuario("Mario", "mario@daw.com");
        usuarios[1] = new Usuario("Lucas", "lucas@daw.com");
        usuarios[2] = new Usuario("Lionel", "lionel@daw.com");
        usuarios[3] = new Usuario("Juan", "juan@daw.com");
        usuarios[4] = new Usuario("Fani", "fani@daw.com");
        
        
        peliculas[0] = new Pelicula("Spider-Man", "2002", "A peter parker lo pica una araña y se convierte en héroe.");
        peliculas[1] = new Pelicula("Indiana Jones", "1981", "Un profesor se mete de lleno en aventuras de catacumbas y tesoros antiguos");
        peliculas[2] = new Pelicula("007 Casino Royale", "2006", "007, conocido como James Bond enfrenta a un villano en un nuevo ambito, el poker, aqui 007 demostrara que tiene algo mas que punteria");
        peliculas[3] = new Pelicula("Jumanji", "2017", "Cuatro adolescentes se transportan desde un juego maldito a un mundo muy parecido, en el que viviran aventuras muy peligrosas");
        peliculas[4] = new Pelicula("Akira", "1988", "Un Tokyo futurista se ve en peligro en media crisis del pais por un esperimento del gobierno que ha salido mal, un grupo de adolescentes tendra que pelear por lo que queda de su ciudad");
        peliculas[5] = new Pelicula("Niños Grandes", "2010", "Una estrella de Hollywood vuelve a su ciudad natal para tomar un descanso pero al reencontrarse con sus amigos de toda la vida sus planes cambiaran");
        peliculas[6] = new Pelicula("Soy Leyenda", "2007", "Un supervivinete a una enfermedad zombi luchara con armas y ciencia a esta infeccion mostrando tanto su humanida como su valor");
        peliculas[7] = new Pelicula("Un don excepcional", "2017", "Un padre pelea porque su hija superdotada tenga una infancia comun, pero sera mas dificl de lo que penso");
        peliculas[8] = new Pelicula("Megamind", "2010", "Un villano vence al heroe de la ciudad y se proclama como vencedor, hasta que se da cuenta de que su verdadera victoria estaba por llegar");
        peliculas[9] = new Pelicula("La milla verde", "1999", "Un prisionero llega a una carcel de USA en la con su don cambiara tanto el ambiente dl lugar como a las personas del lugar");
        peliculas[10] = new Pelicula("Ghost in the shell", "1995", "En un japon futurista varios policias luchan por el orden en las calles en las que nuestra protagonista vera que hasta lo que le queda de humanidad lucha a su lado");
        peliculas[11] = new Pelicula("Dredd", "2012", "En un mundo futurista la sobrepoblacion y caos se adueñan de las calles, lo que hace que la justicia se imparta por los jueces, personas que hacen tanto como policia y a su vez como verdugo");
        peliculas[12] = new Pelicula("Juegos de Guerra","1983","LUCAAAAAAAAAAS");
        peliculas[13] = new Pelicula("Jungla de Cristal", "1988", "Un policia inactivo se ve envuelto en un ataque terrorista en el que demostrara sus dotes como policia y marido");
        peliculas[14] = new Pelicula("Club de la lucha", "1999", "1º Regla del club de lucha, no se habla sobre el club de la lucha");
        
    }
}