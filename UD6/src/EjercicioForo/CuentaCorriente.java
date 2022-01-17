package EjercicioForo;
public class CuentaCorriente {
    
    private double saldo;
    private int numCuenta;
    
    //Constructor
    public CuentaCorriente(double saldo, int numCuenta) {
        this.setNumCuenta(numCuenta);
        this.setSaldo(saldo);
    }
    
    //Getters - Setters
    public double getSaldo() {
        return this.saldo;
    }
    public int getNumCuenta() {
        return this.numCuenta;
    }
    
    public void setSaldo (double saldo) {
        if (saldo < 0)
            System.err.println("Error: el saldo no puede ser negativo. \nEl saldo no ha cambiado.");
        else
            this.saldo = saldo;
    }
    public void setNumCuenta (int numCuenta) {
        if (numCuenta < 0)
            System.err.println("Error: el nº de cuenta no puede ser negativo, la operación no se ha realizado.");
        else
            this.numCuenta = numCuenta;
    }
    
    //Otras funciones
    public void ingresar(double cantidad) {
        if (cantidad < 0)
            System.err.println("Error: el saldo a ingresar no puede ser negativo. \nEl saldo no ha cambiado.");
        else
            this.saldo += saldo;
    }
    public boolean retirar(double cantidad) {
        if (cantidad < 0){
            System.err.println("Error: La cantidad a retirar no puede ser negativa. \nEl saldo no ha cambiado.");
            return false;
        } else {
            this.saldo -= saldo;
            return true;
        }
    }
}