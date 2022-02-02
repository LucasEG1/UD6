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
        /*peliculas[1] = new Pelicula();
        peliculas[2] = new Pelicula();
        peliculas[3] = new Pelicula();
        peliculas[4] = new Pelicula();
        peliculas[5] = new Pelicula();
        peliculas[6] = new Pelicula();
        peliculas[7] = new Pelicula();
        peliculas[8] = new Pelicula();
        peliculas[9] = new Pelicula();
        peliculas[10] = new Pelicula();
        peliculas[11] = new Pelicula();
        peliculas[12] = new Pelicula();
        peliculas[13] = new Pelicula();
        peliculas[14] = new Pelicula();*/
        
    }
}