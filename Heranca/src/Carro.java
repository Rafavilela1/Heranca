
public class Carro extends Veiculo {
	private boolean  quatroPortas;
	
	public boolean isQuatroPortas() {
		return quatroPortas;
	}
	
	
	public void setQuatroPortas(boolean quatroPortas) {
		this.quatroPortas=quatroPortas;
	}


	@Override
	public void imprimeDados() {
		// TODO Auto-generated method stub
		super.imprimeDados();
		System.out.println("Quatro Portas");
	}
	
	
	
}
