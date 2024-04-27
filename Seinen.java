package trabalho1;
public class Seinen extends Manga {
    private String demografia;

    public Seinen(String titulo, String autor, int volumes, String demografia) {
        super(titulo, autor, volumes);
        this.demografia = demografia;
    }

    // Método getter e setter especifico para demografia
    public String getDemografia() {
        return demografia;
    }

    public void setDemografia(String demografia) {
        this.demografia = demografia;
    }

    // Método para exibir informações do mangá Seinen, incluindo informações da superclasse Manga
    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Demografia: " + demografia);
    }
}
