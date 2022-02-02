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
            return true;
        }
    }
    public boolean anularSuscrip() {
        if (getEsPremium()== false){
            System.err.println("¡El usuario no es premium!"
                    + " Debe serlo para anular la suscripción");
            return false;
        } else {
            this.esPremium = false;
            return true;
        }
    }
    
    /**
    *AÚN NO SE PUEDE HACER, FALTA HACER CLASE VIDEOCLUB
    */
    /*public String buscarNombre(String buscar) {
        
    }*/

    public void verPelisAlquiladas() {
    }

    public void verPelisVideoclub() {
    }

    public void alquilar(Pelicula p) {
        biblioteca[cuantasPelis] = p;
        cuantasPelis++;
    }

    public void devolver(int pos) {
        for (int i = pos; i < biblioteca.length-1; i++) {
            biblioteca[i] = biblioteca[i+1];
        }
    }
}
