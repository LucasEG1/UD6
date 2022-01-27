
package CasoPracticoBanco;

public class Cuenta {
    private String nombre;
    private double saldo;
    
    //Constructor
    public Cuenta(String nombre, double saldo){
        
    }
    
    //Getters - Setters
    public String getNombre(){
        return nombre;
    }
    public double getSaldo(){
        return saldo;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setSaldo(double saldo){
        if (saldo < -100){
            System.err.println("El saldo de la cuenta no puede ser inferior a 100€.");
        } else {
            this.saldo = saldo;
        }
    }
    
    //Otras funciones
    public void verCuenta(){
        System.out.println(this.nombre + "\t" + this.saldo);
    }
    public void ingersar(double dinero){
        if (dinero < 0) {
            System.err.println("No se puede ingresar dinero negativo. La operación fue cancelada.");
        } else {
        this.saldo += dinero;
        }
    }
    public boolean retirar(double dinero){
        if ((this.saldo - dinero) < -100){
            System.err.println("La cuenta no puede tener un saldo inferior a -100€");
            return false;
        } else {
            this.saldo -= dinero;
            return true;
        }
    }
}
