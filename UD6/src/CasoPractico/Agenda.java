package CasoPractico;

import java.util.Arrays;

public class Agenda {

    private Contacto[] contactos;
    private int cuantos;
    
    //Constructor
    public Agenda(int longitud){
         contactos = new Contacto[longitud];
         this.cuantos = 0;
    }
    
    //Getters - Setters
    
    //Otras funciones
    public void agregarContacto(Contacto c){
        
        if (cuantos >= contactos.length){
            System.err.println("Agenda llena. El contacto no se ha agregado.");
        } else {
        this.contactos[cuantos] = c;
        cuantos++;
        }
    }
    
    public void eliminarContacto(int posicion){
        
        if (cuantos <= 0 || posicion < 0){
            System.err.println("Agenda vacía. El contacto no se ha eliminado.");
        } else {
            for (int i = posicion; i < contactos.length-1; i++) {
                contactos[i] = contactos[i+1];
            }
            cuantos--;
        }
    }
    
    public Agenda buscarNombre(String busqueda){
        
        //Contacto[] encontrados = new Contacto[this.contactos.length];
        int cuantosEncontrados = 0;
        Agenda ae = new Agenda(this.contactos.length);
        
        for (int i = 0; i < cuantos; i++) {
            
            if (busqueda.toUpperCase().contains(contactos[i].getNombre().toUpperCase())){
                //encontrados[cuantosEncontrados] = contactos[i];
                cuantosEncontrados++;
                ae.agregarContacto(contactos[i]);
            }
        }
                
        //Contacto[] devolver = Arrays.copyOf(encontrados, cuantosEncontrados);
        return ae;
    }
    
    public void imprimirTodos(){
        
        if (cuantos <= 0){
            System.err.println("No hay contactos registrados.");
        } else {
            for (int i = 0; i < cuantos; i++) {
                contactos[i].verContacto();
            }
        }
    }
}