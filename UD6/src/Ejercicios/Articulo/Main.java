
package Ejercicios.Articulo;

public class Main {

    public static void main(String[] args) {
        
        Articulo art1 = new Articulo("Comida", 2.75, 21, 3);
        
        art1.setNombre("Shampoo");
        art1.setPrecio(55.99);
        art1.mostrarArticulo();
    }
}
