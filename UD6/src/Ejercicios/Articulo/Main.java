
package Ejercicios.Articulo;

public class Main {

    public static void main(String[] args) {
        
        Articulo art1 = new Articulo();
        
        art1.nombre = "comida para gato";
        art1.precio = 2.75;
        art1.cuantosQuedan = 75;
        
        art1.mostrar();
    }
}
