package donnees;

import java.io.File;
import java.io.FileNotFoundException;

public class ChargeurMagasin {
    private String nomRepertoire;


    public ChargeurMagasin(String nomRepertoire) {
        this.nomRepertoire = nomRepertoire;
    }


    public Magasin chargerMagasin() throws Exception {
        File repertoire = new File(this.nomRepertoire);

        if (!repertoire.exists() || !repertoire.isDirectory()) {
            throw new FileNotFoundException("Répertoire invalide : " + nomRepertoire);
        }

        Magasin magasin = new Magasin();
        File[] fichiers = repertoire.listFiles();

        if (fichiers != null) {
            for (File f : fichiers) {
                if (f.isFile() && f.getName().endsWith(".xml")) {
                    ChargeurCD chargeurIndiv = new ChargeurCD(f.getAbsolutePath());
                    CD cd = chargeurIndiv.chargerCD();


                    magasin.ajouteCd(cd);
                }
            }
        }

        return magasin;
    }
}
