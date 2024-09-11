package ClasseAbstrata;

public class Onibus extends veiculos {
	
	public Onibus(String placa, String modelo, String cor, int ano) {
		super (placa, modelo, cor, ano);
		}
		@Override
		public void acelerar() {
		System.out.println("O onibus está acelerando.");
		}
		public void freiar() {
		System.out.println("O onibus está freando.");
		}
		public void virar() {
		System.out.println("O onibus está virando.");
		}
		public void ligar() {
		System.out.println("O onibus está ligado.");
		}
		
	}


