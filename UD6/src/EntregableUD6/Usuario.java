package EntregableUD6;

public class Usuario {

    private String nombre;
    private String correo;
    private Pelicula[] biblioteca;
    private boolean esPremium;
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
            System.out.println("Suscrito exitosamente.");
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
            return true;
        } else return false;
    }
    
    public void verPelisAlquiladas() {
        getBiblioteca();
    }
    
    public void alquilar(Pelicula p) {
        if (this.esPremium == true){
            biblioteca[cuantasPelis] = p;
            cuantasPelis++;
        } else if (this.esPremium == false && cuantasPelis >= 1){
            System.err.println("Ya tienes una película alquilada\n"
                + "¡Para poder alquilar más de una película a la vez, suscríbete!");
        }
            
    }
    
    public void devolverP(Pelicula p) {
        int pos = -1;
        for (int i = 0; i < biblioteca.length; i++) {
            if (biblioteca[i] == p) {
                pos = i;
                break;
            }
        }
        if (pos != -1) {
            devolver(pos);
        } else {
            System.err.println("El usuario no posee la película indicada.");
        }
    }
    
    public void devolver(int pos) {
        if (cuantasPelis <= 0){
            System.err.println("¡No tienes películas para devolver!");
        } else {
            for (int i = pos; i < biblioteca.length-1; i++) {
                biblioteca[i] = biblioteca[i+1];
            }
        }
    }
}
