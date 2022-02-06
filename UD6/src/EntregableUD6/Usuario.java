package EntregableUD6;

public class Usuario {

    private String nombre;
    private String correo;
    private Pelicula[] biblioteca = new Pelicula[15];
    private boolean esPremium = false;
    private int cuantasPelis = 0;
    
    
    //Constructor
    public Usuario (String nombre, String correo){
        this.nombre = nombre;
        this.correo = correo;
        this.esPremium = false;
    }
    
    //Getters - Setters
    public String getNombre() {    
        return nombre;
    }
    public String getCorreo() {
        return correo;
    }
    public Pelicula[] getBiblioteca() {
        return biblioteca;
    }
    public boolean getEsPremium() {
        return esPremium;
    }
    public int getCuantasPelis() {    
        return cuantasPelis;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    //Otras funciones
    public boolean suscribirse() {
        if (this.esPremium == true){
            System.err.println("¡El usuario ya es premium!");
            return false;
        } else {
            this.esPremium = true;
            System.err.println("Suscrito exitosamente.");
            return true;
        }
    }
    public boolean anularSuscrip() {
        if (this.esPremium == false){
            System.err.println("¡El usuario no es premium!"
                    + " Debe serlo para anular la suscripción");
            return false;
        } else if (this.esPremium == true){
            this.esPremium = false;
            System.err.println("Suscripción anulada con éxito.");
            return true;
        } else return false;
    }    
    public void verPelisAlquiladas() {
        getBiblioteca();
    }
    public boolean alquilar(Pelicula p, Usuario u) {
        if (p.getPoseedor() == null){
            if (this.esPremium == true) {
                biblioteca[cuantasPelis] = p;
                this.cuantasPelis++;
                return true;
            }
            
            if (this.esPremium == false && cuantasPelis < 1) {
                biblioteca[cuantasPelis] = p;
                cuantasPelis++;
                return true;
            } else if (cuantasPelis >= 1) {
                System.err.println("El usuario tiene " + cuantasPelis + " película(s) alquilada(s)\n"
                        + "¡Para poder alquilar más de una película a la vez, suscríbete!");
                return false;
            }
               
        } else if (p.getPoseedor() != u){
            System.err.println("¡Esta película ya está alquilada!");
            return false;
        }
        return false;
    }
    public boolean devolverP(Pelicula p) {
        int pos = -1;
        for (int i = 0; i < cuantasPelis; i++) {
            if (biblioteca[i] == p) {
                pos = i;
                break;
            }
        }
        if (pos != -1) {
            devolver(pos);
            System.err.println("Película devuelta con éxito.");
            return true;
        } else if (pos == -1) {
            System.err.println("El usuario no posee la película indicada.");
            return false;
        } else return false;
    }
    public void devolver(int pos) {
        if (cuantasPelis <= 0){
            System.err.println("¡No tienes películas para devolver!");
        } else {
            for (int i = pos; i < cuantasPelis; i++) {
                biblioteca[i] = biblioteca[i+1];
            }
            cuantasPelis--;
        }
    }
    public void verBiblioteca(){
        for (int i = 0; i < cuantasPelis; i++) {
            biblioteca[i].mostrarPelicula();
        }
    }
}
