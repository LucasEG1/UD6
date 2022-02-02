package EntregableUD6;

public class Pelicula {

    public enum eGenero {
    Aventuras, Horror, CienciaFiccion, Comedia, Drama
    }
    
    private String titulo;
    private String fechaEstreno;
    private String sinopsis;
    private Usuario poseedor;
    private boolean esAlquilada;
    public int cuantasPelis = 0;
    public eGenero genero;

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
    public eGenero getGenero(){
        return this.genero;
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
    public void setGenero(int gen){
        switch (gen){
            case 1:
                this.genero = genero.Aventuras;
                break;
            case 2: 
                this.genero = genero.Horror;
                break;
            case 3:
                this.genero = genero.CienciaFiccion;
                break;
            case 4: 
                this.genero = genero.Comedia;
                break;
            case 5:
                this.genero = genero.Drama;
                break;
            default:
                System.out.println("Número introducido no válido.");
        }
    }

    //Otras funciones
    public void mostrarPelicula() {
        System.out.println("Título: " + titulo + "\nEstrenada en " + fechaEstreno + " trata de: " + sinopsis + " y esta alquilada por " + poseedor); //getNombre        
    }

}
