package edu.craptocraft.correccion;

import edu.craptocraft.Idioma;
import edu.craptocraft.dominio.Complejo;

public class ProcesadorTextoCompleja extends ProcesadorTextoBasica implements Complejo {

    @Override
    public boolean correcto(Idioma idioma) {
        for (String palabra : texto) {
            if (!idioma.diccionario.contains(palabra.toLowerCase())) {
                return false;
            }
        }
        return true;
    }
}
