package EntregableUD6;

public class Pelicula {

    public enum eGenero {
    Aventuras, Horror, CienciaFiccion, Comedia, Drama, Accion;
    }
    
    private String titulo;
    private String fechaEstreno;
    private String sinopsis;
    private Usuario poseedor = null;
    private boolean esAlquilada = false;
    private int cuantasPelis = 0;
    public eGenero genero;

    //Constructor
    public Pelicula(eGenero genero, String titulo, String fechaEstreno, String sinopsis) {    
        this.titulo = titulo;
        this.fechaEstreno = fechaEstreno;
        this.sinopsis = sinopsis;
        this.esAlquilada = false;
        this.poseedor = null;
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
        return genero;
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
                System.out.println("N??mero introducido no v??lido.");
        }
    }

    //Otras funciones
    //Muestra la infomaci??n de la pel??cula (T??tulo, sinopsis, fecha de estreno, Si es alquilada - Y por qui??n -).
    public void mostrarPelicula() {
        System.out.println("--T??tulo: " + getTitulo());
        System.out.println("--Estreno: " + getFechaEstreno());
        //System.out.println("--G??nero: " + getGenero());
        System.out.println("--Sinopsis " + getSinopsis());
        if (getEsAlquilada() == true){
            System.out.println("??Est?? alquilada?: " + getEsAlquilada());
            System.out.println("--Alquilada por: " + getPoseedor().getNombre());
        } else {
            System.out.println("--??Est?? alquilada?: " + getEsAlquilada());
        }
        System.out.println("\n");
    }
}
