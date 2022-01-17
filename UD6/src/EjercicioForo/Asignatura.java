package EjercicioForo;

public class Asignatura {
    
    private String nombre;
    private int codigoAsignatura;
    private int curso;
    
    //Constructor
    public Asignatura(String nombre, int codigoAsignatura, int curso){
        setNombre(nombre);
        setCodigoAsignatura(codigoAsignatura);
        setCurso(curso);
    }
    //Getters - Setters
    public String getNombre(){
        return this.nombre;
    }
    public int getCodigoAsignatura(){
        return this.codigoAsignatura;
    }
    public int curso(){
        return this.curso;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setCodigoAsignatura(int codigoAsignatura){
        this.codigoAsignatura = codigoAsignatura;
    }
    public void setCurso(int curso){
        this.curso = curso;
    }
    
    //Otras funciones
    public void imprimir(){
        System.out.println("--INFORMACIÓN DE LA ASIGNATURA--*");
        System.out.println("Nombre: " + this.nombre + "\tCódigo: " + this.codigoAsignatura + "\tCurso: " + this.curso);
    }
}