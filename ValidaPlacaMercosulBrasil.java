package br.com.paulohenrique.validacao.placas;

public class ValidaPlacaMercosulBrasil {

	/**
	 * 
	 * @param  placa
	 * @return boolean 
	 */
	
	
	  /*
	   * Funcao para validar o atual padra brasileiro/mercosul de placas de automoveis automotores
	   * Deve receber uma String com 7 caracteres em padrao LOWER-CASE
	   * Como saida é retornado um boolean 
	   * 
	   * PADRAO MERCOSUL : LLLNLNN
	   */
	public static boolean padraoBrasilMercosul(String placa) {
		boolean validada = true;
		if(placa.length()!=7) {
			validada = false;
		}
		if(!placa.substring(0, 3).matches("[A-Z]*")||!placa.substring(4, 5).matches("[A-Z]*")) {
			validada = false;
		}
		if(!placa.substring(3, 4).matches("[0-9]*")||!placa.substring(5).matches("[0-9]*")) {
			validada = false;
		}
		return validada;
	}
	  
	 

	  /*
	   * Funcao para validar o antigo e ainda atual padra brasileiro de placas de automoveis automotores
	   * Deve receber uma String com 7 caracteres em padrao LOWER-CASE
	   * Como saida é retornado um boolean 
	   * 
	   * PADRAO BRASIL : LLLNNNN
	   */
	public static boolean padraoBrasil(String placa) {
		boolean validada = true;
		if (placa.length() != 7) {
			validada = false;
		}
		if (!placa.substring(0, 3).matches("[A-Z]*")) {
			validada = false;
		}
		if (!placa.substring(3).matches("[0-9]*")) {
			validada = false;
		}
		return validada;
	}
}
