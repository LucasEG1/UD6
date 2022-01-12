
package Ejercicios.Articulo;

public class Articulo {

    private String nombre;
    private double precio;
    private double iva = 21;
    private int cuantosQuedan;
    private final double pvp = precio*(1+(iva/100));
    
    //Constructor
    public Articulo(String name, double price, int iva, int stock) {
        this.nombre = name;
        this.iva = iva;
        this.cuantosQuedan = stock;
        this.precio = price;
    }
    
    //Getters - Setters
    public String getNombre() {
        return this.nombre;
    }
    public double getPrecio() {
        return this.precio;
    }
    public double getIva() {
        return this.iva;
    }
    public double getPvp() {
        return this.pvp;
    }
    public int getStock() {
        return this.cuantosQuedan;
    }
    
    public void setNombre (String nombre) {
        this.nombre = nombre;
    }
    public void setPrecio (double precio) {
        if (precio >= 0)
            this.precio = precio;
        else
            System.err.println("Error: el precio no puede ser negativo. \nEl precio no ha cambiado.");
    }
    public void setIva(double iva) {
        if (iva >= 0)
            this.iva = iva;
        else
            System.err.println("Error: el IVA no puede ser negativo.\nEl IVA no ha cambiado.");
    }
    public void setStock (int cuantosQuedan) {
        if (cuantosQuedan < 0)
            System.err.println("Error: el Stock no puede ser negativo.\nLa operación no se ha realizado.");
        this.cuantosQuedan = cuantosQuedan;
    }
    
    //Otras funciones
    public void mostrarArticulo() {
        System.out.println(
                nombre + 
                "\n- Precio: €" + precio + 
                "\n- IVA: " + iva + "%" +
                "\n- PVP: €" + pvp);
    }
}

