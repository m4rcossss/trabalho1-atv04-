package trabalho1;
public class Shojo extends Manga {
    private String estilo;

    public Shojo(String titulo, String autor, int volumes, String estilo) {
        super(titulo, autor, volumes);
        this.estilo = estilo;
    }

    // Método getter e setter especifico para estilo
    public String getEstilo() {
        return estilo;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }

    // Método para exibir informações do mangá Shojo, incluindo informacoes da superclasse Manga
    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Estilo: " + estilo);
    }
}

