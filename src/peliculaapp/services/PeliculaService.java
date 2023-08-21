package peliculaapp.services;

import java.util.ArrayList;
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
            System.out.println("");
            System.out.println("Desea agregar una nueva pelicula: \n1. Si \n2. No");
            aux = leer.nextInt();
            if (aux == 1) {
                peliculaCreada = crearPelicula();
                agregarPelicula(peliculaCreada);
            } else {
                System.out.println(peliculaCreada.toString());
                bandera = false;
            }
        }
    }
        
        public void mostrarPeliculas() {
        System.out.println("");
        System.out.println("Las peliculas actuales son: ");
        System.out.println("");
        for (Pelicula pelicula : peliculas) {
            System.out.println(pelicula.toString());
        }
        System.out.println("Cantidad =  " + peliculas.size());
    }
    
    
}
