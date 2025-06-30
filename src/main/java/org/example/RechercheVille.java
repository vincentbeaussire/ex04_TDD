package org.example;

import jdk.jshell.spi.ExecutionControl;
import org.example.exception.NotFoundException;

import java.util.List;

public class RechercheVille {

    private List<String> villes;

    public RechercheVille(List<String> villes) {
    }

    public List<String> rechercher(String mot) throws ExecutionControl.NotImplementedException {
        if (mot.length() < 2) {
            throw new NotFoundException("Moins de deux caractères");
        }
        throw new ExecutionControl.NotImplementedException("Erreur");
    }
}
