package EJERCICIO_POO.ejercicio_6;

public class Flor extends Planta{
    private String colorPetalos;
    private double cantidadPromedioPetalos;
    private String colorPistillo;
    private String variedadFlor;
    private String estacionFlorece;

    //constructor vacio
    public Flor(){

    }

    public Flor(String nombre, double altoTallo, boolean tieneHojas, String climaIdeal, String colorPetalos, double cantidadPromedioPetalos, String colorPistillo, String variedadFlor, String estacionFlorece){
        super(nombre, altoTallo, tieneHojas, climaIdeal);
        this.colorPetalos = colorPetalos;
        this.cantidadPromedioPetalos = cantidadPromedioPetalos;
        this.colorPistillo = colorPistillo;
        this.variedadFlor =variedadFlor;
        this.estacionFlorece = estacionFlorece;
    }

    @Override
    public void decirQueSoy() {
        System.out.println("hola soy una flor");
    }
    
}
