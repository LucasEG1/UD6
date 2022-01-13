
package Ejercicios.Articulo;

public class Articulo {

    private String nombre;
    private double precio;
    private double iva = 21;
    private int stock;
    
    //Constructor
    public Articulo(String name, double price, int iva, int stock) {
        this.setNombreProd(name);
        this.setPrecio(price);
        this.setIva(iva);
        this.setStock(stock);
    }
    
    //Getters - Setters
    public String getNombreProd() {
        return this.nombre;
    }
    public double getPrecio() {
        return this.precio;
    }
    public double getIva() {
        return this.iva;
    }
    public final double getPvp() {
        double pvp = this.getPrecio()*(1+(this.getIva()/100));
        return pvp;
    }
    public int getStock() {
        return this.stock;
    }
    
    public void setNombreProd (String nombre) {
        this.nombre = nombre;
    }
    public void setPrecio (double precio) {
        if (precio < 0)
            System.err.println("Error: el precio no puede ser negativo. \nEl precio no ha cambiado.");
        else
            this.precio = precio;
    }
    public void setIva(double iva) {
        if (iva < 0)
            System.err.println("Error: el IVA no puede ser negativo.\nEl IVA no ha cambiado.");
        else
            this.iva = iva;
    }
    public void setStock (int stock) {
        if (stock < 0)
            System.err.println("Error: el Stock no puede ser negativo, la operación no se ha realizado.");
        else
            this.stock = stock;
    }
    
    //Otras funciones
    public void mostrarArticulo() {
        System.out.println(getNombreProd() + 
                "\n- Precio: €" + getPrecio() + 
                "\n- IVA: " + getIva() + "%" +
                "\n- PVP: €" + getPvp());
    }
    public double getPvpDescuento(int x) {
        if (x < 0){
            System.err.println("Error: No se puede aplicar un % de descuento negativo, la "
                + "operación ha sido cancelada");
            return getPvp();
        } else {
            double total = (getPvp()- (getPvp()*(x/100)));
            return total;
        }
    }
    public boolean vender(int x) {
        
        if (x < 0 || (getStock()- x) < 0) {
            System.err.println("Error: no se puede vender una cantidad negativa. "
                    + "La operación se ha cancelado.");
            return false;
        } else {
            setStock(getStock()-x);
            return true;
        }
    }
    public boolean almacenar(int x) {
        
        if (x < 0) {
            System.err.println("Error: no se puede vender una cantidad negativa. "
                    + "La operación se ha cancelado.");
            return false;
        } else {
            setStock(getStock() + x);
            return true;
        }
    }
}

