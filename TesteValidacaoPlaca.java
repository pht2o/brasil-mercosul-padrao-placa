package br.com.paulohenrique.validacao.placas;

public class TesteValidacaoPlaca {

	public static void main(String[] args) {
		ValidaPlacaMercosulBrasil placa = new ValidaPlacaMercosulBrasil();
		
		System.out.println("-----------Padrao brasileiro e mercosul-----------");
		System.out.println(placa.padraoBrasilMercosul("ABC3R32"));
		System.out.println(placa.padraoBrasilMercosul("A3C7P39"));
		System.out.println(placa.padraoBrasilMercosul("ABC7t3p"));
		System.out.println(placa.padraoBrasilMercosul("ABC7P30"));
		System.out.println(placa.padraoBrasilMercosul("AB3R32"));
		
		System.out.println("-----------------Padrao brasileiro----------------");
		System.out.println(placa.padraoBrasil("ABC7P30"));
		System.out.println(placa.padraoBrasil("ABC7830"));
		System.out.println(placa.padraoBrasil("ABC0P30"));
		System.out.println(placa.padraoBrasil("ABc9000"));
		System.out.println(placa.padraoBrasil("AB9000"));
	}

}
