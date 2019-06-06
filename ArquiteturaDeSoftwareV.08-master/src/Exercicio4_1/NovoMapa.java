package Exercicio4_1;

import java.util.HashMap;
/**
 * 
 * @author Leonardo Santiago Gonçalves 81612334 SI3AN-MCA
 * 			
 *
 */

@SuppressWarnings({ "serial", "rawtypes" })
public class NovoMapa extends HashMap {

	@SuppressWarnings("unchecked")
	public NovoMapa(Object[][] pares) {
		// O vetor de pares deve ter duas linhas.
		if (pares.length != 2)
			throw new IllegalArgumentException();

		// Obtém vetores representando as colunas.
		Object[] chaves = pares[0];
		Object[] colunas = pares[1];

		// Monta o mapa.
		for (int i = 0; i < chaves.length; i++)
			put(chaves[i], colunas[i]);
	}
}
