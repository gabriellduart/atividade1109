package ClasseAbstrata;

	public class lobo extends Animais{
	public lobo (String nome,String sexo, String raca) {
	super(nome, sexo, raca);
	}
	@Override
	public void dormir() {
	System.out.println("O lobo dormi");
	}
	public void caminhar () {
	System.out.println("O lobo caminha");
	}
	public void correr () {
	System.out.println("O lobo corre");
	}
	public void emitirsom () {
	System.out.println("O lobo uiva");
	}
	
		
		
	}


