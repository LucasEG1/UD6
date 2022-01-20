
package ArraysObjetos.ArrAsignaturas;

public class Asignatura {
    
    // ATRIBUTOS
    private String nombreAsig;
    private int codigoAsig;
    private int curso;

    // CONSTRUCTOR
    public Asignatura(String nombre, int codigo, int curso) {
        this.nombreAsig = nombre;
        this.codigoAsig = codigo;
        this.curso = curso;
    }

    // GETTERS
    public String getNombreAsig() {
        return nombreAsig;
    }

    public int getCodigoAsig() {
        return codigoAsig;
    }

    public int getCurso() {
        return curso;
    }

    // SETTERS
    public void setNombreAsig(String nombreAsig) {
        this.nombreAsig = nombreAsig;
    }

    public void setCodigoAsig(int codigoAsig) {
        this.codigoAsig = codigoAsig;
    }

    public void setCurso(int curso) {
        this.curso = curso;
    }

    // OTROS MÉTODOS
    public void imprime() {
        System.out.println("Nombre: " + nombreAsig + "   Código: " + codigoAsig + "   Curso: " + curso);
    }

}