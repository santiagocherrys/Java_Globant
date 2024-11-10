package Ejercicio2;

public class Libro {

    private String titulo;
    private String autor;
    private int numPaginas;

    public Libro(String titulo, String autor, int numPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.numPaginas = numPaginas;
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

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", numPaginas=" + numPaginas +
                '}';
    }

    public void imprimirResumen(){
        System.out.println("Titulo: " + this.titulo + " Autor: " + this.autor);
    }

    public void determinarMayor300(){
        if(this.numPaginas > 300){
            System.out.println("El libro tiene mas de 300 páginas con: " + this.numPaginas + " páginas");
        }else{
            System.out.println("El libro tiene menos de 300 páginas con: " + this.numPaginas + " páginas");
        }
    }
}
