public class Personaje {

    private String nombre;
    private Raza tipoRaza;
    private int fuerza;
    private int inteligencia;
    private int puntosVidaMaximo;
    private int puntosVidaActual;

    //Constructor con parámetros
    public Personaje(String nombre, Raza tipoRaza, int fuerza, int inteligencia, int puntosVidaMaximo) {
        this.nombre = nombre;
        this.tipoRaza = tipoRaza;
        this.fuerza = fuerza;
        this.inteligencia = inteligencia;
        this.puntosVidaMaximo = puntosVidaMaximo;
        this.puntosVidaActual = puntosVidaMaximo;
    }

    //Verifica si la vida está entre esos dos valores

    public int verificarVida(int vida){
        if (vida < 0){
            return 0;
        }
        if (vida > this.puntosVidaMaximo){
            return this.puntosVidaMaximo;
        }
        return vida;
    }

    //GETTER AND SETTER
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Raza getTipoRaza() {
        return tipoRaza;
    }

    public void setTipoRaza(Raza tipoRaza) {
        this.tipoRaza = tipoRaza;
    }

    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    public int getInteligencia() {
        return inteligencia;
    }

    public void setInteligencia(int inteligencia) {
        this.inteligencia = inteligencia;
    }

    public int getPuntosVidaMaximo() {
        return puntosVidaMaximo;
    }

    public void setPuntosVidaMaximo(int puntosVidaMaximo) {
        this.puntosVidaMaximo = puntosVidaMaximo;
    }

    public int getPuntosVidaActual() {
        return puntosVidaActual;
    }

    public void setPuntosVidaActual(int puntosVidaActual) {
        this.puntosVidaActual = puntosVidaActual;
    }

    //toString
    @Override
    public String toString() {
        return "Personaje{" +
                "nombre='" + nombre + '\'' +
                ", tipoRaza=" + tipoRaza +
                ", fuerza=" + fuerza +
                ", inteligencia=" + inteligencia +
                ", puntosVidaMaximo=" + puntosVidaMaximo +
                ", puntosVidaActual=" + puntosVidaActual +
                '}';
    }
}
