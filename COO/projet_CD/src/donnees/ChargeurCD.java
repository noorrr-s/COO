package donnees;

import java.io.File;
import java.io.FileNotFoundException;

public class ChargeurCD {
    private String nomFichier;

    public ChargeurCD(String nomFichier) {
        this.nomFichier = nomFichier;
    }

    public CD chargerCD() throws Exception {
        File f = new File(this.nomFichier);

        if (!f.exists()) {
            throw new FileNotFoundException("Fichier introuvable : " + nomFichier);
        }

        CD nouveauCD = new CD("Artiste Inconnu", "Album Inconnu");

        return nouveauCD;
    }
}