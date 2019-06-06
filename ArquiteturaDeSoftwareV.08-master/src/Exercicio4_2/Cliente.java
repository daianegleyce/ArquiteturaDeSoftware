package Exercicio4_2;
/**
 * 
 * @author Leonardo Santiago Gonçalves 81612334 SI3AN-MCA
 * 			
 *
 */
public class Cliente {
	/** Somador. */
	private SomadorEsperado somador;

	/** Construtor. */
	public Cliente(SomadorEsperado somador) {
		this.somador = somador;
	}

	/** Efetua a soma de um vetor. */
	public void executar() {
		int[] vetor = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int soma = somador.somaVetor(vetor);
		System.out.println("Resultado: " + soma);
	}
}
