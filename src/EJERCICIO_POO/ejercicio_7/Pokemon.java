package EJERCICIO_POO.ejercicio_7;

public abstract class Pokemon {
    private int num_pokedex;
    private String nombrePokemon;
    private double pesoPokemon;
    private char sexo;
    private int temporadaQueAparece;
    private String tipo;

    //constructor vacio
    public Pokemon(){

    }

    //constructor con todas las propiedades

    public Pokemon(int num_pokedex, String nombrePokemon, double pesoPokemon, char sexo, int temporadaQueAparece, String tipo){
        this.num_pokedex = num_pokedex;
        this.nombrePokemon = nombrePokemon;
        this.pesoPokemon = pesoPokemon;
        this.sexo = sexo;
        this.temporadaQueAparece = temporadaQueAparece;
        this.tipo = tipo;
    }

    //getters and setters
        public int getNum_pokedex() {
            return num_pokedex;
        }

        public void setNum_pokedex(int num_pokedex) {
            this.num_pokedex = num_pokedex;
        }

        public String getNombrePokemon() {
            return nombrePokemon;
        }

        public void setNombrePokemon(String nombrePokemon) {
            this.nombrePokemon = nombrePokemon;
        }

        public double getPesoPokemon() {
            return pesoPokemon;
        }

        public void setPesoPokemon(double pesoPokemon) {
            this.pesoPokemon = pesoPokemon;
        }

        public char getSexo() {
            return sexo;
        }

        public void setSexo(char sexo) {
            this.sexo = sexo;
        }

        public int getTemporadaQueAparece() {
            return temporadaQueAparece;
        }

        public void setTemporadaQueAparece(int temporadaQueAparece) {
            this.temporadaQueAparece = temporadaQueAparece;
        }

        public String getTipo() {
            return tipo;
        }

        public void setTipo(String tipo) {
            this.tipo = tipo;
        }
    

    //metodos que comparten 
        public abstract void atacarPlacaje();
        public abstract void atacarArañazo();
        public abstract void atacarMordisco();
}
