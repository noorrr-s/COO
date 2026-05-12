package donnees;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TriTest {

    @Test
    public void testTriAlbum() throws Exception {

        ChargeurMagasin chargeur =
                new ChargeurMagasin("donnees/xml");

        Magasin magasin =
                chargeur.chargerMagasin();

        magasin.trier(new ComparateurAlbum());

        assertNotNull(magasin.getCd(0));
    }

    @Test
    public void testTriArtiste() throws Exception {

        ChargeurMagasin chargeur =
                new ChargeurMagasin("donnees/xml");

        Magasin magasin =
                chargeur.chargerMagasin();

        magasin.trier(new ComparateurArtiste());

        assertNotNull(magasin.getCd(0));
    }
}