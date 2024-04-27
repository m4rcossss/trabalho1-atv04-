package trabalho1;
public class Shonen extends Manga {
    private int idadeAlvo;

    public Shonen(String titulo, String autor, int volumes, int idadeAlvo) {
        super(titulo, autor, volumes);
        this.idadeAlvo = idadeAlvo;
    }

    // Método getter e setter especifico para idadeAlvo
    public int getIdadeAlvo() {
        return idadeAlvo;
    }

    public void setIdadeAlvo(int idadeAlvo) {
        this.idadeAlvo = idadeAlvo;
    }

    // Método para exibir informações do mangá Shonen, incluindo informações da superclasse Manga
    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Idade Alvo: " + idadeAlvo + " anos");
    }
}
