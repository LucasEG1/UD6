package CasoPractico;

import java.util.Arrays;

public class Agenda {

    private Contacto[] contactos;
    private int cuantos;
    
    //Constructor
    public Agenda(){
         contactos = new Contacto[100];
         this.cuantos = 0;
    }
    
    //Getters - Setters
    
    //Otras funciones
    public void agregarContacto(Contacto c){
        this.contactos[cuantos] = c;
        cuantos++;
    }
    
    public void eliminarContacto(int posicion){
        
        for (int i = posicion; i < contactos.length-1; i++) {
            contactos[i] = contactos[i+1];
        }
        
        cuantos--;
    }
    
    public Contacto[] buscarNombre(String busqueda){
        
        Contacto[] encontrados = new Contacto[this.contactos.length];
        int cuantosEncontrados = 0;
        
        //Agenda ae = new Agenda();
        
        for (int i = 0; i < contactos.length; i++) {
            
            if (busqueda.toUpperCase().contains(contactos[i].getNombre().toUpperCase())){
                encontrados[cuantosEncontrados] = contactos[i];
                cuantosEncontrados++;
                
                //ae.agregarContacto(contactos[i]);
            }
        }
                
        Contacto[] devolver = Arrays.copyOf(encontrados, cuantosEncontrados);
        return devolver;
    }
    
    public void imprimirTodos(){
        
        for (int i = 0; i < contactos.length; i++) {
            contactos[i].verContacto();
        }
    }
}