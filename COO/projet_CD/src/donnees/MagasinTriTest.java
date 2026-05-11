package test;

import donnees.CD;
import donnees.Magasin;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MagasinTriTest {

    @Test
    public void testTrierParTitre() {
        // 1. Préparation : créer un magasin avec des CD dans le désordre
        Magasin magasin = new Magasin();

        // On ajoute des titres qui ne sont pas alphabétiques
        magasin.ajouteCd(new CD("Artiste A", "Zebda"));      // Devrait être dernier (Z)
        magasin.ajouteCd(new CD("Artiste B", "Mister V"));   // Devrait être au milieu
        magasin.ajouteCd(new CD("Artiste C", "Angèle"));     // Devrait être premier (A)

        // 2. Action : trier par titre
        magasin.trierParTitre();

        // 3. Vérification : premier et dernier élément
        // On utilise getNombreCds() pour connaître l'indice du dernier (-1)
        int taille = magasin.getNombreCds();

        // Le premier (indice 0) doit être "Angèle"
        assertEquals("Le premier CD après tri devrait être Angèle",
                "Angèle", magasin.getCd(0).getNomCD());

        // Le dernier (indice taille - 1) doit être "Zebda"
        assertEquals("Le dernier CD après tri devrait être Zebda",
                "Zebda", magasin.getCd(taille - 1).getNomCD());
    }

    @Test
    public void testTrierParArtiste() {
        Magasin magasin = new Magasin();

        // Ajout par noms d'artistes dans le désordre
        magasin.ajouteCd(new CD("Zola", "Album 1"));
        magasin.ajouteCd(new CD("Adele", "Album 2"));
        magasin.ajouteCd(new CD("Lomepal", "Album 3"));

        magasin.trierParArtiste();

        int taille = magasin.getNombreCds();

        // Premier artiste : Adele
        assertEquals("Le premier artiste devrait être Adele",
                "Adele", magasin.getCd(0).getNomArtiste());

        // Dernier artiste : Zola
        assertEquals("Le dernier artiste devrait être Zola",
                "Zola", magasin.getCd(taille - 1).getNomArtiste());
    }
}
