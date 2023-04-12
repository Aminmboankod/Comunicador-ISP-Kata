package edu.craptocraft.correccion;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import edu.craptocraft.dominio.Basico;

public class ProcesadorTextoBasica implements Basico {

    protected List<String> texto = new ArrayList<>();

    @Override
    public void nueva(String palabra) {
        texto.add(palabra);
    }

    @Override
    public String texto() {
        return texto.stream().collect(Collectors.joining(" "));
    }

}
