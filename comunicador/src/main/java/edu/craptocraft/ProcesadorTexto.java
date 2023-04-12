package edu.craptocraft;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import edu.craptocraft.dominio.Basico;
import edu.craptocraft.dominio.Complejo;

public class ProcesadorTexto implements Basico, Complejo {

	private List<String> texto = new ArrayList<>();

	@Override
	public void nueva(String palabra) {
		texto.add(palabra);
	}

	@Override
	public String texto() {
		return texto.stream().collect(Collectors.joining(" "));
	}

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
