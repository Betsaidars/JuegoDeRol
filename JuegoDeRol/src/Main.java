import javax.sound.midi.Soundbank;

public class Main {
    public static void main(String[] args) {


        Mago harry = new Mago("Harry", Raza.humano, 14, 19, 99);
        Mago hermione = new Mago("Hermione", Raza.humano, 37, 50, 85);
        Clerigo dani = new Clerigo("Dani", Raza.humano, 20, 14, 80, "Afrodita");

        System.out.println(harry);
        System.out.println(hermione);
        System.out.println(dani);

        System.out.println("----------------------");

        //Hechizos aprendidos

        harry.aprendeHechizo("alohomora");
        harry.aprendeHechizo("abada kadavra");
        hermione.aprendeHechizo("lumus");

        System.out.println("----------------------------------");

        System.out.println(harry);
        System.out.println(hermione);

        System.out.println("---------------------------------");

        harry.lanzaHechizo(hermione);
        hermione.lanzaHechizo(harry);
        System.out.println("La vida actual de hermione es " + hermione.getPuntosVidaActual());
        System.out.println("La vida actual de harry es " + harry.getPuntosVidaActual());

        System.out.println("----------------------------------");

        dani.curar(hermione);

        System.out.println("----------------------------------");

        System.out.println("La vida actual de hermione es " + hermione.getPuntosVidaActual());

        System.out.println("------------------------------------");

        harry.lanzaHechizo(hermione);

        System.out.println("--------------------------------------");

        System.out.println(harry);
        System.out.println(hermione);
        System.out.println(dani);


        dani.curar(hermione);
        dani.curar(hermione);
        dani.curar(hermione);
        dani.curar(hermione);
        dani.curar(hermione);
        dani.curar(hermione);
        dani.curar(hermione);

        System.out.println(hermione);

    }
}