package ClasseAbstrata;

public abstract class veiculos {

	private String placa;
	private String modelo;
	private String cor;
	private int ano;

	public veiculos(String placa, String modelo, String cor, int ano) {
		this.placa = placa;
		this.modelo = modelo;
		this.cor = cor;
		this.ano = ano;
	}

		public abstract void acelerar();
		
		public abstract void freiar();
		
		public abstract void virar();
		
		public abstract void ligar();

	}


