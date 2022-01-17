
package EjercicioForo;

public class Reloj {
    
    private int hora;
    private int minutos;
    private int segundos;
    
    //Constructor
    public Reloj(int hora, int minutos, int segundos){
        if (hora < 0 || hora > 23){
            System.err.println("Error: la hora especificada no es válida para esta operación\n"
                    + "Asegúrate de que la hora se encuentra entre 0 y 23");
        } else {
            this.hora = hora;
        }
        
        if (minutos < 0 || minutos > 59){
            System.err.println("Error: Los minutos especificados no son válidos para esta operación\n"
                    + "Asegúrate de que los minutos se encuentran entre 0 y 59");
        } else {
        this.minutos = minutos;
        }
        
        if (segundos < 0 || segundos > 59){
            System.err.println("Error: Los segundos especificados no son válidos para esta operación\n"
                    + "Asegúrate de que los minutos se encuentran entre 0 y 59");
        } else {
        this.segundos = segundos;
        }
    }
    //Getters - Setters
    
    public int getHora(){
        return this.hora;
    }
    public int getMinutos(){
        return this.minutos;
    }
    public int getSegundos(){
        return this.segundos;
    }
    
    public void setReloj(int hora, int minutos, int segundos){
        if (hora < 0 || hora > 23){
            System.err.println("Error: la hora especificada no es válida para esta operación\n"
                    + "Asegúrate de que la hora se encuentra entre 0 y 23");
        } else {
            this.hora = hora;
        }
        
        if (minutos < 0 || minutos > 59){
            System.err.println("Error: Los minutos especificados no son válidos para esta operación\n"
                    + "Asegúrate de que los minutos se encuentran entre 0 y 59");
        } else {
        this.minutos = minutos;
        }
        
        if (segundos < 0 || segundos > 59){
            System.err.println("Error: Los segundos especificados no son válidos para esta operación\n"
                    + "Asegúrate de que los minutos se encuentran entre 0 y 59");
        } else {
        this.segundos = segundos;
        }
    }
    
    //Otras funciones
    public void tick() {
        
        segundos++;
        if (segundos == 60) {
            segundos = 0;
            minutos++;
        }
        if (minutos == 60) {
            minutos = 0;
            hora = (hora + 1) % 24;
        }
    }
    public String dimeHora(){
        String HoraActual = Integer.toString(this.hora) + ":" + Integer.toString(this.minutos) +
                ":" + Integer.toString(this.segundos);
        return HoraActual;
    }
    public String dimeHora12(){
        String modo;
        if (this.hora >=0 && this.hora < 13){
        modo = "AM";
        } else {
            modo = "PM";
        }
        
        switch (modo) {
            case "AM":
                String horaAM = Integer.toString(this.hora) + ":" + Integer.toString(this.minutos) +
                ":" + Integer.toString(this.segundos) + " " + modo;
                return horaAM;
            case "PM":
                String horaPM = Integer.toString((this.hora)-12) + ":" + Integer.toString(this.minutos) +
                ":" + Integer.toString(this.segundos) + " " + modo;
                return horaPM;
            default:
                return dimeHora();
        }
    }    
    public void imprimeHora(){
        System.out.println(this.dimeHora());
    }
    public void imprimeHora12(){
        System.out.println(dimeHora12());
    }
}
