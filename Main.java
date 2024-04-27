//Programa que exibe as informações de mangás de vários tipos de categorias
package trabalho1;
import trabalho1.Manga;
import trabalho1.Shonen;
import trabalho1.Shojo;
import trabalho1.Seinen;
public class Main {
    public static void main(String[] args) {
        Shonen onePiece = new Shonen("One Piece", "Eiichiro Oda", 100, 12);
        Shojo sailorMoon = new Shojo("Sailor Moon", "Naoko Takeuchi", 18, "Romance");
        Seinen berserk = new Seinen("Berserk", "Kentaro Miura", 40, "Adulto");

	System.out.println("-> MangaList <-\n");

        System.out.println("--- One Piece ---");
        onePiece.exibirInfo();

        System.out.println("\n--- Sailor Moon ---");
        sailorMoon.exibirInfo();

        System.out.println("\n--- Berserk ---");
        berserk.exibirInfo();
    }
}

