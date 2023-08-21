package peliculaapp.entities;

public class Pelicula implements Comparable<Pelicula> {
    private String titulo;
    private String director;
    private double duracion;

    public Pelicula() {
    }

    public Pelicula(String titulo, String director, double duracion) {
        this.titulo = titulo;
        this.director = director;
        this.duracion = duracion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "titulo=" + titulo + ", director=" + director + ", duracion=" + duracion + '}';
    }

    @Override
    public int compareTo(Pelicula other) {
        return (int) (other.duracion - this.duracion);
        //Si yo vengo antes que la otra, retorno un negativo
        //Si yo voy despues que la otra, retorno un positivo
        //Si somos iguales, retorno un cero
    }
}
