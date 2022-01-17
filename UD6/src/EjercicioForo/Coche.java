
package EjercicioForo;
public class Coche {
    private String modelo;
    private String color;
    private boolean esMetalizado;
    private String matricula;
    private enum tipoCoche {
        MINI(),
        UTILITARIO(),
        FAMILIAR(),
        DEPORTIVO();
    }
    private int añoFabricacion;
    private enum seguro {TERCEROS, TODO_RIESGO;}
    
    //Constructor
    public Coche(String modelo, String color, boolean esMetalizado, 
            String matricula,int añoFabric) {
        
    }
    
    //Getters - Setters
    public String getModelo() {
        return this.modelo;
    }
    public String getColor() {
        return this.color;
    }
    public boolean getEsMetalizado() {
        return this.esMetalizado;
    }
    public String getMatricula() {
        return this.matricula;
    }
    public int getAñoFabricacion() {
        return añoFabricacion;
    }
    public String getTipoCoche() {
        return "------------------";
    }
    
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
    public void setTipoCoche() {
        
    }
}
