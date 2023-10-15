package ejercicio_13;

//clase para crear el objeto que contendra los datos de entrada del usuario
public class DatosCompra {
    private int destino = -1;
    private int vuelo = -1;
    private int pasajesAComprar = -1;

    public DatosCompra(){

    }

    public DatosCompra(int destino, int vuelo, int pasajesAComprar){
        this.destino = destino;
        this.vuelo = vuelo;
        this.pasajesAComprar = pasajesAComprar;
    }



    public int getDestino() {
        return destino;
    }
    public void setDestino(int destino) {
        this.destino = destino;
    }
    public int getVuelo() {
        return vuelo;
    }
    public void setVuelo(int vuelo) {
        this.vuelo = vuelo;
    }
    public int getPasajesAComprar() {
        return pasajesAComprar;
    }
    public void setPasajesAComprar(int pasajesAComprar) {
        this.pasajesAComprar = pasajesAComprar;
    }

    


}
