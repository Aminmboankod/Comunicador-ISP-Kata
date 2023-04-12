package edu.craptocraft.correccion;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import edu.craptocraft.Idioma;

public class ProcesadorTextoComplejaTest {
    @Test
    public void testCorrecto() {
        ProcesadorTextoCompleja procesador = new ProcesadorTextoCompleja();

        procesador.nueva("Tengo");
        procesador.nueva("hambre");

        assertEquals("Tengo hambre", procesador.texto());

        assertTrue(procesador.correcto(Idioma.ES));
    }
}
