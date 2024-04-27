package trabalho1;
public class Manga {
    private String titulo;
    private String autor;
    private int volumes;

    public Manga(String titulo, String autor, int volumes) {
        this.titulo = titulo;
        this.autor = autor;
        this.volumes = volumes;
    }

    // Métodos getters e setters para encapsulamento
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

    public int getVolumes() {
        return volumes;
    }

    public void setVolumes(int volumes) {
        this.volumes = volumes;
    }

    // Método para exibir informações do mangá
    public void exibirInfo() {
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Volumes: " + volumes);
    }
}
