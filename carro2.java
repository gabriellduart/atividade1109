package ClasseAbstrata;

public class carro2 extends veiculos {
	
	public carro2(String placa, String modelo, String cor, int ano) {
		super (placa, modelo, cor, ano);
		}
		@Override
		public void acelerar() {
		System.out.println("O carro2 está acelerando.");
		}
		public void freiar() {
		System.out.println("O carro2 está freando.");
		}
		public void virar() {
		System.out.println("O carro2 está virando.");
		}
		public void ligar() {
		System.out.println("O carro2 está ligado.");
		}
		
	}

