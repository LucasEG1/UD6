
package ArraysObjetos.ArrCC;

public class CuentaCorriente {

    // ATRIBUTOS
    private int numCuenta;
    private double saldo;

    // CONSTRUCTOR
    public CuentaCorriente(int cuenta, double saldo) {
        setNumCuenta(cuenta);
        setSaldo(saldo);
    }

    // GETTERS
    public int getNumCuenta() {
        return numCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    // SETTERS
    public void setNumCuenta(int numCuenta) {
        this.numCuenta = numCuenta;
    }

    public void setSaldo(double saldo) {
        if (saldo >= 0) {
            this.saldo = saldo;
        } else {
            System.err.println("ERROR. No se permiten cuentas con saldo negativo.");
        }
    }
    
    // OTROS MÉTODOS
    public void ingresar(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
        } else {
            System.err.println("ERROR. No se permiten valores negativos.");
        }
    }

    public boolean retirar(double cantidad) {
        if (cantidad > 0 && saldo > cantidad) {
            saldo -= cantidad;
            return true;
        } else {
            System.err.println("ERROR. No se ha podido retirar dinero de la cuenta. Cantidad errónea o saldo insuficiente.");
            return false;
        }
    }

    public void imprime() {
        System.out.println("Nº Cuenta: " + numCuenta + "   Saldo: " + saldo);
    }
}