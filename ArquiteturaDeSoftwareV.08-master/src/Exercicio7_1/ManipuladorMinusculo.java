package Exercicio7_1;
/**
 * 
 * @author Leonardo Santiago Gonçalves 81612334 SI3AN-MCA
 * 			
 *
 */
public class ManipuladorMinusculo extends ManipuladorAbstrato {
	protected String transformarString(String string) {
		return string.toLowerCase();
	}
}
