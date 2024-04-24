import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

//Aquí hacemos referencia a que es una herencia
public class Mago extends Personaje {

    //DECLARAMOS UN ARRAY
    private String[] hechizos;

    //HACEMOS EL CONSTRUCTOR
    public Mago(String nombre, Raza tipoRaza, int fuerza, int inteligencia, int puntosVidaMaximo) {
        super(nombre, tipoRaza, fuerza, inteligencia, puntosVidaMaximo);
        this.setInteligencia(verificarInteligencia(inteligencia));
        this.setFuerza(verificarFuerza(fuerza));
        this.hechizos = new String[4];
    }

    //CREAMOS UN MÉTODO DONDE VERIFICAMOS LA INTELIGENCIA
    public int verificarInteligencia (int inteligencia){
        if (inteligencia < 17){
            return 17;
        }
        return inteligencia;
    }

    //CREAMOS UN MÉTODO DONDE VERIFICAMOS LA FUERZA
    public int verificarFuerza (int fuerza){

        if (fuerza > 15){
            return 15;
        }
        return fuerza;
    }

    //CREAMOS UN MÉTODO DONDE APRENDER HECHIZOS
    public void aprendeHechizo(String hechizoAnadir){
        boolean anadir = false; //Aquí ponemos el aprendisaje a false, es decir, no ha aprendido ningún hechizo
        for (int i = 0; i < hechizos.length; i++){ //Recorremos el array de hechizos
            if (hechizos[i] == null){ //Aquí le damos la posición del Arrays para comprobar si está vacío o no
                hechizos[i] = hechizoAnadir; //En caso de que esté vacío, a esa posición le añadimos el hechizo
                anadir = true; //y ponemos que el hechizo si ha sido aprendido
                System.out.println("El hechizo " + hechizoAnadir + " ha sido aprendido");
                break; //Aquí hacemos un stop para que no siga el bucle
            }
        }
        //En este caso, si no se ha aprendido el hechizo, lo ponemos en false
        if (anadir == false){
            System.out.println("No se ha podido añadir el hechizo, no hay hueco");
        }
    }

    public void lanzaHechizo(Personaje personaje){
        for (int i = 0; i < hechizos.length; i++){
            if (hechizos[i] != null){
                personaje.setPuntosVidaActual(personaje.verificarVida(personaje.getPuntosVidaActual() - 10));
                System.out.println(this.getNombre() + " ha lanzado el hechizo " + hechizos[i] + " a " + personaje.getNombre());
                hechizos[i] = null;
                break;
            }
        }
    }

    @Override
    public String toString() {
        return "Mago{" +
                "hechizos=" + Arrays.toString(hechizos) +
                ", nombre='" + getNombre() + '\'' +
                ", tipoRaza=" + getTipoRaza() +
                ", fuerza=" + getFuerza() +
                ", inteligencia=" + getInteligencia() +
                ", puntosVidaMaximo=" + getPuntosVidaMaximo() +
                ", puntosVidaActual=" + getPuntosVidaActual() +
                '}';
    }
}
