package services;

import java.util.Date;
import domains.Livre;

public interface LivreService {
    void createLivre(domains.Livre livre);

    java.util.List<domains.Livre> getAllLivre();

    domains.Livre getLivre(int i);

    void updateLivre(domains.Livre livre);

    void deleteLivre(int i);

}