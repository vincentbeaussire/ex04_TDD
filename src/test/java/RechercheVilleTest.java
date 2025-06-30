import jdk.jshell.spi.ExecutionControl;
import org.example.RechercheVille;
import org.example.exception.NotFoundException;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;

public class RechercheVilleTest {
    private RechercheVille rechercheVille;

    @Test
    public void when_SearchCityLess2Characters_Then_Return_Exception() {

        List<String> villes = Arrays.asList("Paris", "Budapest", "Skopje", "Rotterdam", "Valence",
                "Vancouver", "Amsterdam", "Vienne", "Sydney",
                "New York", "Londres", "Bangkok", "Hong Kong",
                "Dubaï", "Rome", "Istanbul");
        RechercheVille rechercheVille = new RechercheVille(villes);

        assertThrows(NotFoundException.class, () -> {
            rechercheVille.rechercher("p");
        });
    }

    @Test
    public void when_SearchCityIsEqualOrMore2Characters_Then_Return_AllCityBeginningBySearchUser() throws ExecutionControl.NotImplementedException {
        List<String> villes = Arrays.asList("Paris", "Budapest", "Skopje", "Rotterdam", "Valence",
                "Vancouver", "Amsterdam", "Vienne", "Sydney",
                "New York", "Londres", "Bangkok", "Hong Kong",
                "Dubaï", "Rome", "Istanbul");
        RechercheVille rechercheVille = new RechercheVille(villes);

        List<String> resultat = rechercheVille.rechercher("Va");

        assertTrue(resultat.contains("Valence"));
        assertTrue(resultat.contains("Vancouver"));
    }

    @Test
    public void when_SearchCityIsAPartOfCity_Then_Return_City() {
        List<String> villes = Arrays.asList("Paris", "Budapest", "Skopje", "Rotterdam", "Valence",
                "Vancouver", "Amsterdam", "Vienne", "Sydney",
                "New York", "Londres", "Bangkok", "Hong Kong",
                "Dubaï", "Rome", "Istanbul");
        RechercheVille rechercheVille = new RechercheVille(villes);
    }
}
