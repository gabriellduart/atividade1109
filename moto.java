package ClasseAbstrata;

public class moto extends veiculos{

	public moto(String placa, String modelo, String cor, int ano) {
		super (placa, modelo, cor, ano);
		}
		@Override
		public void acelerar() {
		System.out.println("a moto está acelerando.");
		}
		public void freiar() {
		System.out.println("a moto está freando.");
		}
		public void virar() {
		System.out.println("a moto está virando.");
		}
		public void ligar() {
		System.out.println("a moto está ligado.");
		}
		
	}

