
package EjercicioForo;

import java.util.ArrayList;
import java.util.List;

enum tipoCoche {
        MINI,
        UTILITARIO,
        FAMILIAR,
        DEPORTIVO;
    }
enum seguro {TERCEROS, TODO_RIESGO;}

public class Coche {
    private String modelo;
    private String color;
    private boolean esMetalizado;
    private String matricula;
    private tipoCoche tipoCoche;
    private seguro tipoSeguro;
    private int añoFabricacion;
    
    
    //Constructor
    public Coche(String modelo, String color, boolean esMetalizado, String matricula, tipoCoche tipoCoche, seguro tipoSeguro, int añoFabric) {
        setModelo(modelo);
        setColor(color);
        setEsMetalizado(esMetalizado);
        setMatricula(matricula);
        setTipoCoche(tipoCoche);
        setTipoSeguro(tipoSeguro);
        setAñoFabricacion(añoFabric);
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
        return this.tipoCoche.toString();
    }
    public String getTipoSeguro(){
        return this.tipoSeguro.toString();
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
    public void setTipoCoche(tipoCoche tipoDeCoche) {
        this.tipoCoche = tipoDeCoche;
    }
    public void setTipoSeguro(seguro tipoSeguro){
        this.tipoSeguro = tipoSeguro;
    }
        
}
