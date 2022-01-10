
package Ejercicios.Articulo;

public class Articulo {

    public String nombre;
    public double precio;
    public final double iva = 21;
    public int cuantosQuedan;
    public double pvp;
    
    public void mostrar() {
        pvp = precio*(1+(iva/100));
        System.out.println(nombre + "\n- Precio: €" + precio + 
            "\n- IVA: " + iva + "%\n- PVP: €" + pvp);
    }
    
    /*public void articulo(String name, double price, int stock) {
        this.nombre = name;
        this.cuantosQuedan = stock;
        this.precio = price;
    }*/
}

