public class Clerigo extends Personaje{

    private String nombreDios;

    public Clerigo(String nombre, Raza tipoRaza, int fuerza, int inteligencia, int puntosVidaMaximo, String nombreDios) {
        super(nombre, tipoRaza, fuerza, inteligencia, puntosVidaMaximo);
        this.verificarInteligenciaC(inteligencia);
        this.verificarFuerzaC(fuerza);
        this.nombreDios = nombreDios;
    }

    public void verificarInteligenciaC(int inteligencia){
        if (inteligencia <= 12){
            this.setInteligencia(13);
        }
        if (inteligencia >= 16){
            this.setInteligencia(15);
        }
    }

    public void verificarFuerzaC(int fuerza){
        if (fuerza < 18){
            this.setFuerza(18);
        }
    }

    public void curar(Personaje personajeCurar){
        personajeCurar.setPuntosVidaActual(personajeCurar.verificarVida(getPuntosVidaActual() + 10));
        System.out.println(this.getNombre() + " ha curado a " + personajeCurar.getNombre());
    }















}
