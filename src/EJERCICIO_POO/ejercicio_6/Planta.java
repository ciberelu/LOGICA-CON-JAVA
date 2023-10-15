package EJERCICIO_POO.ejercicio_6;

public abstract class Planta {

    private String nombre;
    private double altoTallo;
    private boolean tieneHojas;
    private String climaIdeal;

    //constructor vacio
    public Planta(){

    }

    //constructor con todos los argumentos
    public Planta(String nombre, double altoTallo, boolean tieneHojas, String climaIdeal){
        this.nombre = nombre;
        this.altoTallo = altoTallo;
        this.tieneHojas = tieneHojas;
        this.climaIdeal = climaIdeal;
    }

    //getters y setters

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public double getAltoTallo() {
        return altoTallo;
    }

    public void setAltoTallo(double altoTallo) {
        this.altoTallo = altoTallo;
    }

    public boolean isTieneHojas() {
        return tieneHojas;
    }

    public void setTieneHojas(boolean tieneHojas) {
        this.tieneHojas = tieneHojas;
    }

    public String getClimaIdeal() {
        return climaIdeal;
    }

    public void setClimaIdeal(String climaIdeal) {
        this.climaIdeal = climaIdeal;
    }

    public abstract void decirQueSoy();
    
}
