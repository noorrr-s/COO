package donnees;

public class ComparateurAlbum implements ComparateurCd {

    @Override
    public boolean etreAvant(CD cd1, CD cd2) {

        return cd1.getNomCD()
                .compareToIgnoreCase(cd2.getNomCD()) < 0;
    }
}
