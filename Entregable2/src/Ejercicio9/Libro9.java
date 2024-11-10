package Ejercicio9;

public class Libro9 {
    private String titulo;
    private String autor;
    private boolean disponible;

    public Libro9(String titulo, String autor, boolean disponible) {
        this.titulo = titulo;
        this.autor = autor;
        this.disponible = disponible;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    @Override
    public String toString() {
        return "Libro9{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", disponible=" + disponible +
                '}';
    }
}
