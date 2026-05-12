package donnees;

public class ComparateurNombrePistes
        implements ComparateurCd {

    @Override
    public boolean etreAvant(CD cd1, CD cd2) {

        return cd1.nombrePistes()
                < cd2.nombrePistes();
    }
}
