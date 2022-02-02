package EntregableUD6;

public class Pelicula {

    private String titulo;

    private String fechaEstreno;

    private String sinopsis;

    private Usuario poseedor;

    private boolean esAlquilada;

    public int cuantasPelis = 0;

    //Constructor
    public Pelicula(String titulo, String fechaEstreno, String sinopsis) {    
        this.titulo = titulo;
        this.fechaEstreno = fechaEstreno;
        this.sinopsis = sinopsis;
        this.esAlquilada = false;
        this.poseedor = poseedor;
    }

    //Getters - Setters
    public String getTitulo() {
        return titulo;
    }
    public String getFechaEstreno() {
        return fechaEstreno;
    }
    public String getSinopsis() {
        return sinopsis;
    }
    public Usuario getPoseedor() {
        return poseedor;
    }
    public boolean getEsAlquilada() {
        return esAlquilada;
    }
    
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public void setFechaEstreno(String fechaEstreno) {
        this.fechaEstreno = fechaEstreno;
    }
    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }    
    public void setPoseedor(Usuario poseedor) {
        this.poseedor = poseedor;
    }
    public void setEsAlquilada(boolean esAlquilada) {
        this.esAlquilada = esAlquilada;
    }

    //Otras funciones
    public void mostrarPelicula() {
        System.out.println("Título: " + titulo + "\nEstrenada en " + fechaEstreno + " trata de: " + sinopsis + " y esta alquilada por " + poseedor); //getNombre        
    }

}
