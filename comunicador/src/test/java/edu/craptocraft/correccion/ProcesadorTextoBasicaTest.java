package edu.craptocraft.correccion;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import edu.craptocraft.dominio.Basico;

public class ProcesadorTextoBasicaTest {

    @Test
    public void testSimple() {
        Basico procesador = new ProcesadorTextoBasica();

        procesador.nueva("No");
        procesador.nueva("himporta");
        procesador.nueva("la");
        procesador.nueva("hortografia");

        assertEquals("No himporta la hortografia", procesador.texto());

    }

}
