package EntregableUD6;

public class Pelicula {

    private String titulo;

    private String fechaEstreno;

    private String sinopsis;

    private Usuario poseedor;

    private boolean esAlquilada;

    public int cuantasPelis = 0;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getFechaEstreno() {
        return fechaEstreno;
    }

    public void setFechaEstreno(String fechaEstreno) {
        this.fechaEstreno = fechaEstreno;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    public Usuario getPoseedor() {
        return poseedor;
    }

    public void setPoseedor(Usuario poseedor) {
        this.poseedor = poseedor;
    }

    public boolean isEsAlquilada() {
        return esAlquilada;
    }

    public void setEsAlquilada(boolean esAlquilada) {
        this.esAlquilada = esAlquilada;
    }

    public void mostrarPelicula() {
        System.out.println("Título: " + titulo + "\nEstrenada en " + fechaEstreno + " trata de: " + sinopsis + " y esta alquilada por " + poseedor); //getNombre        
    }

}
