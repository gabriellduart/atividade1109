package ClasseAbstrata;

public class Carro extends veiculos {

	public Carro(String placa, String modelo, String cor, int ano) {
		super (placa, modelo, cor, ano);
		}
		@Override
		public void acelerar() {
		System.out.println("O carro está acelerando.");
		}
		public void freiar() {
		System.out.println("O carro está freando.");
		}
		public void virar() {
		System.out.println("O carro está virando.");
		}
		public void ligar() {
		System.out.println("O carro está ligado.");
		
		}
		
	}


