package peliculaapp;

import peliculaapp.services.PeliculaService;

public class PeliculaAPP {

    public static void main(String[] args) {
      PeliculaService ps = new PeliculaService();
      
      ps.agregarNuevaPelicula();
      ps.mostrarPeliculas();
      ps.mostrarPeliculasMayorA();
      ps.mostrarPorDuracionMayorAMenor();
      ps.mostrarPeliculas();
    }
}
