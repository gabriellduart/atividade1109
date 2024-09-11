package ClasseAbstrata;

public class Principal {

	public static void main(String[] args) {

		Carro ferrari = new Carro ("00000","F1","Vermelho",2023);
		ferrari.ligar();
		ferrari.acelerar();
		ferrari.virar();
		ferrari.freiar();
		
		System.out.println("-------------------------------");
		
		Onibus marcopolo = new Onibus ("111111","XB1","Prata",2020);
		marcopolo.ligar();
		marcopolo.acelerar();
		marcopolo.virar();
		marcopolo.freiar();
		
		
		System.out.println("-------------------------------");

		carro2 porsche = new carro2 ("99999","F1","Amarelo",2024);
		porsche.ligar();
		porsche.acelerar();
		porsche.virar();
		porsche.freiar();
		
		System.out.println("-------------------------------");
		
		moto BIZ = new moto ("22222","F1","Preta",2020);
		BIZ.ligar();
		BIZ.acelerar();
		BIZ.virar();
		BIZ.freiar();
		
	}

}
