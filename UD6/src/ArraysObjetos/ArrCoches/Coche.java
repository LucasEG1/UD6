
package ArraysObjetos.ArrCoches;

public class Coche {

    // ENUMS
    enum tipoCoche {
        MINI, UTILITARIO, FAMILIAR, DEPORTIVO
    }

    enum modalidadSeguro {
        TERCEROS, TODO_RIESGO
    }

    // ATRIBUTOS
    private String modelo;
    private String color;
    private boolean esMetalizado;
    private String matricula;
    private int añoFabricacion;
    private tipoCoche tipo;
    private modalidadSeguro seguro;

    // CONSTRUCTOR
    public Coche(String modelo, String color, boolean pinturaMetalizada, String matricula, int añoFabricacion, tipoCoche tipo, modalidadSeguro seguro) {
        this.modelo = modelo;
        this.color = color;
        this.esMetalizado = pinturaMetalizada;
        this.matricula = matricula;
        this.añoFabricacion = añoFabricacion;
        this.tipo = tipo;
        this.seguro = seguro;
    }

    // GETTERS
    public String getModelo() {
        return modelo;
    }

    public String getColor() {
        return color;
    }

    public boolean getPintura() {
        return esMetalizado;
    }

    public String getMatricula() {
        return matricula;
    }

    public int getAñoFabricacion() {
        return añoFabricacion;
    }

    public tipoCoche getTipo() {
        return tipo;
    }

    public modalidadSeguro getSeguro() {
        return seguro;
    }

    // SETTERS
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setEsMetalizado(boolean esMetalizado) {
        this.esMetalizado = esMetalizado;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setAñoFabricacion(int añoFabricacion) {
        this.añoFabricacion = añoFabricacion;
    }

    public void setTipo(tipoCoche tipo) {
        this.tipo = tipo;
    }

    public void setSeguro(modalidadSeguro seguro) {
        this.seguro = seguro;
    }

    // OTROS MÉTODOS
    public void imprimir() {
        System.out.println("MODELO: " + modelo + "\n"
                + "COLOR: " + color + "\n"
                + "PINTURA METALIZADA: " + esMetalizado + "\n"
                + "MATRÍCULA: " + matricula + "\n"
                + "AÑO FABRICACIÓN: " + añoFabricacion + "\n"
                + "TIPO COCHE: " + tipo + "\n"
                + "MODALIDAD SEGURO: " + seguro + "\n"
                + "");
    }

}