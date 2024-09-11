package ClasseAbstrata;



	public class Leao extends Animais{
		public Leao (String nome,String sexo, String raca) {
		super(nome, sexo, raca);
		}
		@Override
		public void dormir() {
		System.out.println("O leao dormi");
		}
		public void caminhar () {
		System.out.println("O leao caminha");
		}
		public void correr () {
		System.out.println("O leao corre");
		}
		public void emitirsom () {
		System.out.println("O leao uiva");
		}
		}
}
