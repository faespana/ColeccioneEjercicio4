package peliculaapp.services;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import peliculaapp.entities.Pelicula;

public class PeliculaService {

    private Scanner leer;
    private ArrayList<Pelicula> peliculas;

    public PeliculaService() {
        this.leer = new Scanner(System.in).useDelimiter("\n");
        this.peliculas = new ArrayList();
    }

    public Pelicula crearPelicula() {
        Pelicula peli = new Pelicula();

        System.out.println("Ingrese el titulo de la pelicula: ");
        peli.setTitulo(leer.next());

        System.out.println("");

        System.out.println("Ingrese el director de la pelicula: ");
        peli.setDirector(leer.next());

        System.out.println("");

        System.out.println("Ingrese la duracion de la pelicula: ");
        peli.setDuracion(leer.nextDouble());

        System.out.println("");

        return peli;
    }

    public void agregarPelicula(Pelicula peli) {
        peliculas.add(peli);
    }

    public void agregarNuevaPelicula() {
        boolean bandera = true;
        int aux;
        Pelicula peliculaCreada = crearPelicula();
        agregarPelicula(peliculaCreada);
        while (bandera) {
            System.out.println("Desea agregar una nueva pelicula: \n1. Si \n2. No");
            aux = leer.nextInt();
            System.out.println("");
            if (aux == 1) {
                peliculaCreada = crearPelicula();
                agregarPelicula(peliculaCreada);
            } else {
                bandera = false;
            }
        }
    }

    public void mostrarPeliculas() {
        System.out.println("");
        System.out.println("Las peliculas actuales son: ");
        for (Pelicula pelicula : peliculas) {
            System.out.println(pelicula.toString());
        }
        System.out.println("Cantidad =  " + peliculas.size());
    }

    public void mostrarPeliculasMayorA() {
        int cont = 0;
        System.out.println("");
        System.out.println("La peliculas con una duracion mayor a una hora son: ");
        for (Pelicula pelicula : peliculas) {
            if (pelicula.getDuracion() > 1) {
                System.out.println(pelicula.toString());
                cont = cont + 1;
            }
        }
        System.out.println("Cantidad =  " + cont);
    }
    
    public void mostrarPorDuracionMayorAMenor() {
        int aux = 0;
        System.out.println("");
        System.out.println("Las peliculas de mayor a menor por duracion son: ");
        Collections.sort(peliculas);
    }
}
