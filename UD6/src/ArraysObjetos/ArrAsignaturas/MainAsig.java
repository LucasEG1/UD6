
package ArraysObjetos.ArrAsignaturas;

public class MainAsig {
    public static void main(String[] args) {
        
        Asignatura[] vAsig = new Asignatura[5];
        
        vAsig[0] = new Asignatura("Matemáticas", 1234, 1);
        vAsig[1] = new Asignatura("Lenguaje", 2345, 1);
        vAsig[2] = new Asignatura("FOL", 3456, 1);
        vAsig[3] = new Asignatura("Inglés", 4567, 1);
        vAsig[4] = new Asignatura("Entornos", 5678, 1);
        
        for (int i = 0; i < vAsig.length; i++) {
            vAsig[i].imprime();
        }
    }
}